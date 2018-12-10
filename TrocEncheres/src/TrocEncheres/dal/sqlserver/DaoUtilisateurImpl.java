package TrocEncheres.dal.sqlserver;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import TrocEncheres.bo.Utilisateur;
import TrocEncheres.dal.ConnectionProvider;
import TrocEncheres.dal.DALException;
import TrocEncheres.dal.DaoUtilisateur;

/**
 * Classe DAO qui permet à l'utilisateur de communiquer avec la base de données
 * @author jpelage2018
 *
 */

public class DaoUtilisateurImpl implements DaoUtilisateur {

	private static final String INSERT = "insert into UTILISATEURS(pseudo, nom, prenom, email,"
			+ " telephone, rue, code_postal, ville, mot_de_passe, credit, administrateur) values (?,?,?,?,?,?,?,?,?,?,?)";
	private static final String UPDATE = "update UTILISATEURS set pseudo=?, nom=?, prenom=?, email=?,"
			+ " telephone=?, rue=?, code_postal=?, ville=?, mot_de_passe=? where no_utilisateur=?;";
	private static final String SELECTUSER = "select pseudo, mot_de_passe from UTILISATEURS where pseudo=?;";
	private static final String SELECTNOUSER = "select no_utilisateur from UTILISATEURS where pseudo=? ";
	private static final String SELECTALL = "select no_utilisateur, pseudo, nom, prenom, email, telephone, "
			+ "rue, code_postal, ville, mot_de_passe, credit, administrateur from UTILISATEURS "
			+ "where no_utilisateur = ?";
	
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;

	@Override
	public void Insert(Utilisateur utilisateur) throws DALException{
		// TODO Auto-generated method stub
		try {

			// Récupérer une connexion
			conn = ConnectionProvider.getConnection();

			// Préparer la requete
			stmt = conn.prepareStatement(INSERT, stmt.RETURN_GENERATED_KEYS);
			stmt.setString(1, utilisateur.getPseudo());
			stmt.setString(2, utilisateur.getNom());
			stmt.setString(3, utilisateur.getPrenom());
			stmt.setString(4, utilisateur.getEmail());
			stmt.setString(5, String.valueOf(utilisateur.getTelephone()));
			stmt.setString(6, utilisateur.getRue());
			stmt.setString(7, utilisateur.getCodePostal());
			stmt.setString(8, utilisateur.getVille());
			stmt.setString(9, utilisateur.getMotDePasse());
			stmt.setInt(10, utilisateur.getCredit());
			stmt.setBoolean(11, utilisateur.isAdministrateur());
			
			//stmt.setString
			
			//Executer la requete
			int nbRows = stmt.executeUpdate();
			if(nbRows ==1) {
				
				rs = stmt.getGeneratedKeys();
				if(rs.next()) {
					
					utilisateur.setNoUtilisateur(rs.getInt(1));
				}
			}
			
			
		} catch (SQLException e) {
			
		} finally {
		
			//Fermer la connexion
			if(conn!=null) {
				try {
					conn.close();
				}catch(SQLException e) {
					
					e.printStackTrace();
				}
			}

	}
		
	}

	@Override
	public void Update(Utilisateur utilisateur) throws DALException{
		// TODO Auto-generated method stub
		try {

			// Récupérer une connexion
			conn = ConnectionProvider.getConnection();

			// Préparer la requete
			stmt = conn.prepareStatement(UPDATE);
			stmt.setString(1, utilisateur.getPseudo());
			stmt.setString(2, utilisateur.getNom());
			stmt.setString(3, utilisateur.getPrenom());
			stmt.setString(4, utilisateur.getEmail());
			stmt.setString(5, String.valueOf(utilisateur.getTelephone()));
			stmt.setString(6, utilisateur.getRue());
			stmt.setString(7, utilisateur.getCodePostal());
			stmt.setString(8, utilisateur.getVille());
			stmt.setString(9, utilisateur.getMotDePasse());
			stmt.setInt(10, utilisateur.getNoUtilisateur());

			stmt.executeUpdate();

		} catch (SQLException e) {
			throw new DALException("Update utilisateur failed ---- " + utilisateur, e);
			
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

	}

	@Override
	public boolean checkUser(String pseudo, String mdp) throws DALException {
		boolean trouver = false;
		try {
			// récupération de la connexion
			conn = ConnectionProvider.getConnection();
			// préparation de la connexion
			stmt = conn.prepareStatement(SELECTUSER);
			stmt.setString(1, pseudo);
		
			// exécution
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				if(rs.getString("pseudo").equals(pseudo.trim()) && rs.getString("mot_de_passe").equals(mdp.trim())) {
					trouver = true;
				}else {
					trouver = false;
				}
			}
		} catch (SQLException e) {
			throw new DALException("Select utilisateur failed ---- ", e);
			
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
		return trouver;
	}

	@Override
	public int selectNoUtilisateur(String pseudo) throws DALException {
		int noutilisateur = 0;
		
		try {
			// récupération de la connexion
			conn = ConnectionProvider.getConnection();
			
			// préparation de la requête
			stmt = conn.prepareStatement(SELECTNOUSER);
			stmt.setString(1, pseudo);
			
			// exécution de a la requête
			rs = stmt.executeQuery();
			if(rs.next()) {
				noutilisateur = rs.getInt("no_utilisateur");
			}
			
		} catch(SQLException e){
			throw new DALException("Select noUtilisateur failed -----", e);

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
		return noutilisateur;
	}

	@Override
	public Utilisateur selectAll(int idutilisateur) throws DALException {
		Utilisateur utilisateur = null;
		try {
			// récupération de la connexion
			conn = ConnectionProvider.getConnection();
			
			// préparation de la requête
			stmt = conn.prepareStatement(SELECTALL);
			stmt.setInt(1, idutilisateur);
			// exécution
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				utilisateur = new Utilisateur(rs.getInt("no_utilisateur"), rs.getString("pseudo"), 
						rs.getString("nom"), rs.getString("prenom"), rs.getString("email"), rs.getInt("telephone"), 
						rs.getString("rue"), rs.getString("code_postal"), rs.getString("ville"),
						rs.getString("mot_de_passe"), rs.getInt("credit"), rs.getBoolean("administrateur"));
			}
			
		} catch(SQLException e) {
			throw new DALException("SelectAll failed ------", e);
		}
		
		return utilisateur;
	}

}
