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

	private static final String INSERT = "insert into UTILISATEURS() values ()";
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
			//stmt.setString
			
			//Executer la requete
			stmt.executeUpdate();
			
		}catch (SQLException e) {
			
			e.printStackTrace();
		}
		try {
			
			throw new DALException("Erreur insert", e);
		}catch (DALException e1) {
			
			e1.printStackTrace();
		}
	}finally {
		
		if(conn!=null) {
			
			try {
				conn.close();
			}catch(SQL) {
				
				
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
