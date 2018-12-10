package TrocEncheres.bll;

import java.util.ArrayList;
import java.util.List;

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
	// Attributs
	DaoVente daoVente = DaoFactory.getVenteDAO();
	private List<String> erreurs = new ArrayList<String>();
	
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
		// v�rifications
		boolean valide = true;
		if(vente == null) {
			valide = false;
			throw new BLLException("Vente null");
		}if(vente.getNomArticle().trim().length()==0) {
			erreurs.add("Le nom de l'article est obligatoire.\n");
			valide = false;
		}if(vente.getCategorie() == null) {
			erreurs.add("La cat�gorie est obligatoire.\n");
			valide = false;
		}if(vente.getDescription().trim().length()==0) {
			erreurs.add("La description est obligatoire.\n");
			valide = false;
		}if(vente.getMiseAPrix() <0 || vente.getMiseAPrix() == 0) {
			erreurs.add("Le prix de d�part doit �tre sup�rieur � 0.\n");
			valide = false;
		}if(vente.getDateFinEncheres() == null) {
			erreurs.add("La date doit �tre renseign�e.\n");
			valide = false;
		}
		try {
			if(valide) {
				daoVente.Insert(vente, no_utilisateur);
			}
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
	
	/**
	 * Renvoie une liste d'erreurs 
	 * @return une liste d'erreurs relatives � l'insertion d'une vente
	 */
	public List<String> getErreurs(){
		return erreurs;
	}
}
