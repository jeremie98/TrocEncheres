package TrocEncheres.bll;

import TrocEncheres.bo.Vente;
import TrocEncheres.dal.DALException;
import TrocEncheres.dal.DaoFactory;
import TrocEncheres.dal.DaoVente;

/**
 * Classe VenteMger (Manager) qui implémente les méthodes de l'objet DaoVente
 * @author jpelage2018
 *
 */
public class VenteMger {
	DaoVente daoVente = DaoFactory.getVenteDAO();
	
	// Constructeur
	
	/**
	 * Constructeur qui hérite du constructeur de la classe Object
	 */
	public VenteMger() {
		super();
	}
	
	// Méthodes 

	/**
	 * Méthode insérant une vente en base
	 * @param vente
	 * @throws BLLException
	 */
	public void insert(Vente vente, int no_utilisateur) throws BLLException{
		try {
			daoVente.Insert(vente, no_utilisateur);
		} catch(DALException e) {
			throw new BLLException("Insert failed ------", e);
		}
	}
	
	/**
	 * Méthode supprimant une vente en base
	 * @param vente
	 * @throws BLLException
	 */
	public void delete(Vente vente) throws BLLException{
		try {
			daoVente.Delete(vente);
		} catch(DALException e) {
			throw new BLLException("Delete failed ------", e);
		}
	}
}
