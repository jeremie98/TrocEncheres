package TrocEncheres.dal;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * Classe qui permet l'accès à la base de données SQLServer
 * @author jpelage2018
 *
 */
public class ConnectionProvider {

private static DataSource dataSource;
	
	static {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/cxion_troc_db");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Impossible d'accéder à la base de données");
		}
		
	}
	
	/**
	 * Méthode qui retourne une connexion à la base de données
	 * @return
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException
	{
		return dataSource.getConnection();
	}

	
	
}
