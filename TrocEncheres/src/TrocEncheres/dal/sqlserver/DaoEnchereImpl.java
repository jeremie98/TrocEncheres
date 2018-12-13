package TrocEncheres.dal.sqlserver;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import TrocEncheres.dal.ConnectionProvider;
import TrocEncheres.dal.DALException;
import TrocEncheres.dal.DaoEnchere;

/**
 * Classe DAO qui permet à l'enchèere de communiquer avec la base de données
 * @author jpelage2018
 *
 */

public class DaoEnchereImpl implements DaoEnchere{
	
	private static final String INSERT ="insert into ENCHERES(date_enchere, no_utilisateur, no_vente, proposition)"
			+ " values(getutcdate(), ?, ?, ?) ";
	private static final String SELECTBYUTILISATEUR	= "select proposition from ENCHERES where no_utilisateur = ? and no_vente = ?";

	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	@Override
	public void Insert(int no_utilisateur, int no_vente, int proposition) throws DALException {
		try {
			// Récupérer une connexion
			conn = ConnectionProvider.getConnection();
		
			// Préparer la requete
			stmt = conn.prepareStatement(INSERT);
			stmt.setInt(1, no_utilisateur);
			stmt.setInt(2, no_vente);
			stmt.setInt(3, proposition);
			
			// Executer la requete
			stmt.executeUpdate();
						
		} catch (SQLException e) {
			throw new DALException("InsertEnchere failed--------", e);
			
		} finally {
			try {
				if (rs != null){
					rs.close();
				}
				if (stmt != null){
					stmt.close();
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
	public int selectByUtilisateur(int no_utilisateur, int no_vente) throws DALException {
		int proposition=0;
		try {
			// Récupérer une connexion
			conn = ConnectionProvider.getConnection();
		
			// Préparer la requete
			stmt = conn.prepareStatement(SELECTBYUTILISATEUR);
			stmt.setInt(1, no_utilisateur);
			stmt.setInt(2, no_vente);
			
			// exécuter la requête
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				proposition = rs.getInt("proposition");
			}
			
		} catch (SQLException e) {
			throw new DALException("selectByUtilisateur failed--------", e);
			
		} finally {
			try {
				if (rs != null){
					rs.close();
				}
				if (stmt != null){
					stmt.close();
				}
				if(conn!=null){
					conn.close();
				}
			} catch (SQLException e) {
				throw new DALException("close failed " , e);
			}
		}
		
		return proposition;
	}

}
