package TrocEncheres.dal;

public class DaoFactory {

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
}