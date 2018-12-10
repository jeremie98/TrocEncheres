package TrocEncheres.bll;

import java.util.ArrayList;
import java.util.List;

import TrocEncheres.bo.Categorie;
import TrocEncheres.dal.DALException;
import TrocEncheres.dal.DaoCategorie;
import TrocEncheres.dal.DaoFactory;

/**
 * Classe CategorieMger (Manager) qui impl�mente les m�thodes de l'objet DaoCategorie
 * @author jpelage2018
 *
 */
public class CategorieMger {
	DaoCategorie daoCategorie = DaoFactory.getCategorieDAO();
	
	/**
	 * Constructeur qui h�rite du constructeur de la classe Object
	 */
	public CategorieMger() {
		// TODO Auto-generated constructor stub
	}
	
	// M�thodes
	
	public List<Categorie> selectAll() throws BLLException{
		List<Categorie> listeCateg = new ArrayList<Categorie>();
		try {
			listeCateg = daoCategorie.selectAll();
			
		} catch(DALException e) {
			throw new BLLException("SelectAll failed -------", e);
		}
		return listeCateg;
	}

}
