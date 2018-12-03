package TrocEncheres.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import TrocEncheres.bo.Utilisateur;
import TrocEncheres.dal.ConnectionProvider;

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
	private static final String UPDATE = "update UTILISATEURS set ;";
	
	
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
	public void Delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Update(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Utilisateur> listUser() {
		// TODO Auto-generated method stub
		return null;
	}
}
