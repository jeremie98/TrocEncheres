package TrocEncheres.dal.sqlserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import TrocEncheres.bo.Utilisateur;
import TrocEncheres.dal.ConnectionProvider;
import TrocEncheres.dal.DALException;
import TrocEncheres.dal.DaoUtilisateur;

public class DaoUtilisateurImpl implements DaoUtilisateur{

	private static final String INSERT = "insert into UTILISATEURS(pseudo,"
																+ "nom,"
																+ "prenom,"
																+ "email,"
																+ "telephone,"
																+ "rue,"
																+ "code_postal,"
																+ "ville,"
																+ "mot_de_passe,"
																+ "credit,"
																+ "administrateur) values (?,?,?,?,?,?,?,?,?,?,?)";
	private static final String UPDATE = "update UTILISATEURS set pseudo=?,"
																+ "nom=?,"
																+ "prenom?,"
																+ "email=?,"
																+ "telephone=?,"
																+ "rue=?,"
																+ "code_postal=?,"
																+ "ville=?,"
																+ "mot_de_passe=?,"
																+ "where id=?;";
	
	
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	@Override
	public void Insert(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		try {
			
			// Récupérer une connexion
			conn = ConnectionProvider.getConnection();
			
			// Préparer la requete
			stmt = conn.prepareStatement(INSERT);
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
			stmt.executeUpdate();
			
		}catch (SQLException e) {
			
			e.printStackTrace();
		
		try {
			
			throw new DALException("Erreur insert", e);
		}catch (DALException e1) {
			
			e1.printStackTrace();
		}
	}finally {
		
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
	public void Update(Utilisateur utilisateur) {
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
			
			stmt.executeUpdate();

}catch (SQLException e) {
	
	try {
		throw new DALException("Update utilisateur failes - " + utilisateur, e);
	} catch (DALException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
}finally {
	
	try {
		if (stmt != null) {
			
			stmt.close();
		}
		if (conn != null) {
			conn.close();
		}
		
	}catch (SQLException e) {
		
		e.printStackTrace();
	}
	
}
		
		
	}

}
