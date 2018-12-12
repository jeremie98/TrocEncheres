package TrocEncheres.dal.sqlserver;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import TrocEncheres.bo.Categorie;
import TrocEncheres.dal.ConnectionProvider;
import TrocEncheres.dal.DALException;
import TrocEncheres.dal.DaoCategorie;

/**
 * Classe DAO qui permet de r�cup�rer les cat�gorie dans la base de donn�es
 * @author jpelage2018
 *
 */
public class DaoCategorieImpl implements DaoCategorie{
	
	private static final String SELECTALL = "select * from categories";

	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	/**
	 * Retourne toutes les cat�gories pr�sentes en base
	 * @return la liste des cat�gories
	 * @throws DALException
	 */
	public List<Categorie> selectAll() throws DALException{
		List<Categorie> listeCateg = new ArrayList<Categorie>();
		Categorie categorie = null;
		try {
			// r�cup�ration de la connexion
			conn = ConnectionProvider.getConnection();
			
			// pr�paration de la requ�te
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SELECTALL);
			while(rs.next()) {
				categorie = new Categorie(rs.getInt("no_categorie"), rs.getString("libelle"));
				listeCateg.add(categorie);
			}
			
		} catch(SQLException e) {
			throw new DALException("SelectAll failed --------", e);
		}
		return listeCateg;
	}
}
