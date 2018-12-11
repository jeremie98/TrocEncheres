package TrocEncheres.dal.sqlserver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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
															+ "prix_vente," 
															+ "date_fin_encheres,"
															+ "prix_initial,"
															+ "prix_vente"
															+ "no_utilisateur,"
															+ "no_categorie ) values (?,?,?,?,?,?,?,?)";
	private static final String UPDATE = "update VENTES set  prix_vente=?;";
	private static final String SELECT = "select nomarticle from VENTES where nomarticle=? ;";
	private static final String SELECTCATEG =  "select no_categorie FROM CATEGORIE where libelle=? ; ";

	
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	@Override
	public void Insert(Vente vente, int no_utilisateur, int idCateg) {
		// TODO Auto-generated method stub
		
		try {

			// Récupérer une connexion
			conn = ConnectionProvider.getConnection();
		
			/*ResultSet rs2 = null;
			PreparedStatement stmt2 = conn.prepareStatement(SELECTCATEG);
			rs2 = stmt2.executeQuery();
			int idCateg = rs2.getInt(1);*/
			
			
			// Préparer la requete
			stmt = conn.prepareStatement(INSERT);
			stmt.setString(1, vente.getNomArticle());
			stmt.setString(2, vente.getDescription());
			stmt.setDate(3, new Date(vente.getDateFinEncheres().getTime()));
			stmt.setInt(4, vente.getMiseAPrix());
			stmt.setInt(5, vente.getPrixVente());
			stmt.setInt(6, no_utilisateur);
			stmt.setInt(7, idCateg);

			// stmt.setString

			// Executer la requete
			stmt.executeUpdate();
			

		} catch (SQLException e) {

			e.printStackTrace();

			try {

				throw new DALException("Erreur insert", e);
			} catch (DALException e1) {

				e1.printStackTrace();
			}
		} finally {

			// Fermer la connexion
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {

					try {
						rs = stmt.getGeneratedKeys();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				}

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
	public List<Vente> listVente() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
