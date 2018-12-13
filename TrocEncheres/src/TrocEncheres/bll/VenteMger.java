package TrocEncheres.bll;

import java.util.ArrayList;
import java.util.List;

import TrocEncheres.bo.Retrait;
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
	// Attributs
	DaoVente daoVente = DaoFactory.getVenteDAO();
	private List<String> erreurs = new ArrayList<String>();
	
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
	public void insert(Vente vente, int no_utilisateur, int idCateg, Retrait retrait) throws BLLException{
		// vérifications
		boolean valide = true;
		if(vente == null) {
			valide = false;
			throw new BLLException("Vente null");
		}if(vente.getNomArticle().trim().length()==0) {
			erreurs.add("Le nom de l'article est obligatoire.\n");
			valide = false;
		}if(vente.getIdCateg() <0 || vente.getIdCateg() == 0) {
			erreurs.add("La catégorie est obligatoire.\n");
			valide = false;
		}if(vente.getDescription().trim().length()==0) {
			erreurs.add("La description est obligatoire.\n");
			valide = false;
		}if(vente.getMiseAPrix() <0 || vente.getMiseAPrix() == 0) {
			erreurs.add("Le prix de départ doit être supérieur à 0.\n");
			valide = false;
		}if(vente.getDateFinEncheres() == null) {
			erreurs.add("La date doit être renseignée.\n");
			valide = false;
		}
		try {
			if(valide) {
				daoVente.Insert(vente, no_utilisateur, idCateg, retrait );
			}
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
	
	/**
	 * Renvoie une liste d'erreurs 
	 * @return une liste d'erreurs relatives à l'insertion d'une vente
	 */
	
	public List<Vente> listVente()  throws BLLException {
		 
		List<Vente> listVentes = new ArrayList<>();
		try {
			
			listVentes = daoVente.listVente();
		}catch (DALException e) {
			
			throw new BLLException("Select failed ------", e);
		}
		
		return listVentes;
	}
	
	/**
	 * Renvoie les informations de retrait concernant la vente
	 * @param no_vente
	 * @return l'adresse du retrait
	 * @throws BLLException
	 */
	public Retrait selectRetrait(int no_vente) throws BLLException{
		Retrait retrait = null;
		try {
			retrait = daoVente.selectRetrait(no_vente);
		}catch (DALException e) {
			
			throw new BLLException("SelectRetrait failed ------", e);
		}
		return retrait;
	}
	
	/**
	 * Renvoie le pseudo associé à la vente grâce à l'id de la vente
	 * @param no_vente
	 * @return un pseudo
	 * @throws BLLException
	 */
	public String selectPseudoVente(int no_vente) throws BLLException{
		String pseudo = null;
		try {
			pseudo = daoVente.selectPseudoVente(no_vente);
		}catch (DALException e) {
			
			throw new BLLException("SelectPseudoVente failed ------", e);
		}
		return pseudo;
	}
	
	/**
	 * Renvoie la vente en fonction de son id
	 * @param no_vente
	 * @return une vente
	 * @throws BLLException
	 */
	public Vente selectById(int no_vente) throws BLLException{
		Vente vente = null;
		try {
			vente = daoVente.selectById(no_vente);
		} catch(DALException e) {
			throw new BLLException("SelectById failed --------", e);
		}
		return  vente;
	}
	
	
	public List<Vente> venteById(int id) throws BLLException {
		List<Vente> listVenteId = new ArrayList<>();;
		try {
			
			
			listVenteId = daoVente.venteById(id);
			
		}catch (DALException e) {
			
			throw new BLLException("Select by id failed ------", e);
		}
		
		return listVenteId;
		
		
	}
	
	/**
	 * Renvoie une liste d'erreurs 
	 * @return une liste d'erreurs relatives aux requêtes d'insertion, de mise à jours
	 */
	public List<String> getErreurs(){
		return erreurs;
	}
}
