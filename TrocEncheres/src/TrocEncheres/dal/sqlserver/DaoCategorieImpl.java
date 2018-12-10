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
 * Classe DAO qui permet de récupérer les catégorie dans la base de données
 * @author jpelage2018
 *
 */
public class DaoCategorieImpl implements DaoCategorie{
	
	private static final String SELECTALL = "select * from categories";

	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	/**
	 * Retourne toutes les catégories présentes en base
	 * @return la liste des catégories
	 * @throws DALException
	 */
	public List<Categorie> selectAll() throws DALException{
		List<Categorie> listeCateg = new ArrayList<Categorie>();
		Categorie categorie = null;
		try {
			// récupération de la connexion
			conn = ConnectionProvider.getConnection();
			
			// préparation de la requête
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
