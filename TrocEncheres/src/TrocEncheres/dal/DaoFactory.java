package TrocEncheres.dal;

/**
 * Classe DAOFactory qui permet de renvoyer une instance de classe
 * @author jpelage2018
 *
 */
public class DaoFactory {

	/**
	 * Méthode qui renvoie une instance d'Utilisateur
	 * @return un nouvel utilisateur
	 */
	public static DaoUtilisateur getUtilisateurDAO()  {
		DaoUtilisateur daoUser=null;
		try {
			daoUser=(DaoUtilisateur ) Class.forName("TrocEncheres.dal.sqlserver.DaoUtilisateurImpl").newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return daoUser; 
	}
	
	/**
	 * Méthode qui renvoie une instance de Vente
	 * @return une nouvelle vente
	 */
	public static DaoVente getVenteDAO()  {
		DaoVente daoVente=null;
		try {
			daoVente=(DaoVente ) Class.forName("TrocEncheres.dal.sqlserver.DaoVenteImpl").newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return daoVente; 
	}
	
	/**
	 * Méthode qui renvoie une instance de Vente
	 * @return une nouvelle vente
	 */
	public static DaoCategorie getCategorieDAO()  {
		DaoCategorie daoCategorie =null;
		try {
			daoCategorie=(DaoCategorie ) Class.forName("TrocEncheres.dal.sqlserver.DaoCategorieImpl").newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return daoCategorie; 
	}
	
	/**
	 * Méthode qui renvoie une instance de Enchere
	 * @return une nouvelle enchere
	 */
	public static DaoEnchere getEnchereDAO()  {
		DaoEnchere daoEnchere =null;
		try {
			daoEnchere=(DaoEnchere ) Class.forName("TrocEncheres.dal.sqlserver.DaoEnchereImpl").newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return daoEnchere; 
	}
}
