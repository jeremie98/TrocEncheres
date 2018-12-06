package TrocEncheres.bll;

import TrocEncheres.bo.Vente;
import TrocEncheres.dal.DALException;
import TrocEncheres.dal.DaoFactory;
import TrocEncheres.dal.DaoVente;

/**
 * Classe VenteMger (Manager) qui impl�mente les m�thodes de l'objet DaoVente
 * @author jpelage2018
 *
 */
public class VenteMger {
	DaoVente daoVente = DaoFactory.getVenteDAO();
	
	// Constructeur
	
	/**
	 * Constructeur qui h�rite du constructeur de la classe Object
	 */
	public VenteMger() {
		super();
	}
	
	// M�thodes 

	/**
	 * M�thode ins�rant une vente en base
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
	 * M�thode supprimant une vente en base
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
