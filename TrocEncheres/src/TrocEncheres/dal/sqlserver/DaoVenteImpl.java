package TrocEncheres.dal.sqlserver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import TrocEncheres.bo.Retrait;
import TrocEncheres.bo.Vente;
import TrocEncheres.dal.ConnectionProvider;
import TrocEncheres.dal.DALException;
import TrocEncheres.dal.DaoVente;

/**
 * Classe DAO qui permet à une Vente de communiquer avec la base de données
 * @author jpelage2018
 *
 */
public class DaoVenteImpl implements DaoVente{

	private static final String INSERT = "insert into VENTES(nomarticle," 
															+ "description," 
															+ "date_fin_encheres," 
															+ "prix_initial,"
															+ "prix_vente,"
															+ "no_utilisateur,"
															+ "no_categorie) values (?,?,?,?,?,?,?)";
	private static final String SELECTAllVENTE = "select no_vente, nomarticle, description, date_fin_encheres ,prix_initial, prix_vente, no_utilisateur, no_categorie FROM VENTES";
	private static final String INSERTRETRAIT =  "insert into RETRAITS (no_vente, rue, code_postal, ville) values (?,?,?,?)";
	private static final String SELECTRETRAIT = "select no_vente, rue, code_postal, ville FROM RETRAITS where no_vente=?;";
	private static final String SELECTPSEUDOVENTE = "select pseudo from UTILISATEURS U inner join VENTES V on U.no_utilisateur = V.no_utilisateur where no_vente = ?";
	private static final String SELECTVENTEBYID = "select * from VENTES where no_vente = ?";
	
	Connection conn = null;
	PreparedStatement stmt = null;
	Statement st = null;
	ResultSet rs = null;
	
	@Override
	public void Insert(Vente vente, int no_utilisateur, int idCateg, Retrait retrait) throws DALException{
		// TODO Auto-generated method stub
		
		
		
		try {
			// Récupérer une connexion
			conn = ConnectionProvider.getConnection();
		
			// Préparer la requete
			stmt = conn.prepareStatement(INSERT, stmt.RETURN_GENERATED_KEYS);
			stmt.setString(1, vente.getNomArticle());
			stmt.setString(2, vente.getDescription());
			stmt.setDate(3, new Date(vente.getDateFinEncheres().getTime()));
			stmt.setInt(4, vente.getMiseAPrix());
			stmt.setInt(5, vente.getPrixVente());
			stmt.setInt(6, no_utilisateur);
			stmt.setInt(7, idCateg);
			// Executer la requete
			int nbRows  = stmt.executeUpdate();
			
			
			if(nbRows == 1){
				ResultSet rs = stmt.getGeneratedKeys();
				if(rs.next()){
					vente.setNoVente(rs.getInt(1));
					
					PreparedStatement stmt2 = conn.prepareStatement(INSERTRETRAIT);
					
					stmt2.setInt(1, vente.getNoVente());
					stmt2.setString(2,  retrait.getRue());
					stmt2.setString(3, retrait.getCode_postal());
					stmt2.setString(4, retrait.getVille());
					
					stmt2.executeUpdate();
				}				
			}			

		} catch (SQLException e) {
			throw new DALException("InsertVente failed--------", e);
			
		} finally {
			try {
				if (rs != null){
					rs.close();
				}
				if (st != null){
					st.close();
				}
				if(conn!=null){
					conn.close();
				}
			} catch (SQLException e) {
				throw new DALException("close failed " , e);
			}
		}
	}

	@Override
	public void Delete(Vente vente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Update(Vente vente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Vente> listVente() throws DALException {
		// TODO Auto-generated method stub
		
		List<Vente> listVentes = new ArrayList<Vente>();

		Vente vente = null;
		try {
			
			conn = ConnectionProvider.getConnection();
			
			st = conn.createStatement();
			rs = st.executeQuery(SELECTAllVENTE);
			
			while(rs.next()) {
				
				vente = new Vente(rs.getInt("no_vente"),
								  rs.getString("nomarticle"),
								  rs.getString("description"),
								  rs.getDate("date_fin_encheres"),
								  rs.getInt("prix_initial"),
								  rs.getInt("prix_vente"),
								  rs.getInt("no_utilisateur"),
								  rs.getInt("no_categorie"));
				
				listVentes.add(vente);
				
			}
		}catch (SQLException e) {
				
				e.printStackTrace();
		}finally {
			try {
				if (rs != null){
					rs.close();
				}
				if (st != null){
					st.close();
				}
				if(conn!=null){
					conn.close();
				}
			} catch (SQLException e) {
				throw new DALException("close failed " , e);
			}
		}
		
		return listVentes;
	}
	
	@Override
	public Retrait selectRetrait(int no_vente) throws DALException {
		Retrait retrait = null;
		try {
			// récupération de la connexion
			conn = ConnectionProvider.getConnection();
			
			// préparation de la requête
			stmt = conn.prepareStatement(SELECTRETRAIT);
			stmt.setInt(1, no_vente);
			// exécution de la requête
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				retrait = new Retrait(rs.getInt("no_vente"), rs.getString("rue"), 
						rs.getString("code_postal"), rs.getString("ville"));
			}
			
		} catch(SQLException e){
			throw new DALException("SelectRetrait failed -----", e);

		} finally {

			try {
				if (stmt != null) {

					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return retrait;
		
	}

	@Override
	public String selectPseudoVente(int no_vente) throws DALException {
		String pseudo = null;
		try {
			// récupération de la connexion
			conn = ConnectionProvider.getConnection();
			
			// préparation de la requête
			stmt = conn.prepareStatement(SELECTPSEUDOVENTE);
			stmt.setInt(1, no_vente);
			// exécution de la requête
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				pseudo = rs.getString("pseudo");
			}
		} catch(SQLException e){
			throw new DALException("SelectPseudoVente failed -----", e);

		} finally {
			try {
				if (stmt != null) {

					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return pseudo;
	}

	@Override
	public Vente selectById(int no_vente) throws DALException {
		Vente vente = null;
		try {
			// récupération de la connexion
			conn = ConnectionProvider.getConnection();
			
			// préparation de la requête
			stmt = conn.prepareStatement(SELECTVENTEBYID);
			stmt.setInt(1, no_vente);
			// exécution de la requête
			rs = stmt.executeQuery();
			// traitement
			if(rs.next()) {
				vente = new Vente(rs.getInt("no_vente"),
						  rs.getString("nomarticle"),
						  rs.getString("description"),
						  rs.getDate("date_fin_encheres"),
						  rs.getInt("prix_initial"),
						  rs.getInt("prix_vente"),
						  rs.getInt("no_utilisateur"),
						  rs.getInt("no_categorie"));
			}
			
		} catch(SQLException e){
			throw new DALException("SelectVenteById failed -----", e);

		} finally {
			try {
				if (stmt != null) {

					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return vente;
	}

}
