package TrocEncheres.bll;

import java.util.ArrayList;
import java.util.List;

import TrocEncheres.bo.Utilisateur;
import TrocEncheres.dal.DALException;
import TrocEncheres.dal.DaoFactory;
import TrocEncheres.dal.DaoUtilisateur;

/**
 * Classe UtilisateurMger (Manager) qui impl�mente les m�thodes de l'objet DaoUtilisateur
 * @author jpelage2018
 *
 */
public class UtilisateurMger {
	// Attributs
	DaoUtilisateur daoUtilisateur = DaoFactory.getUtilisateurDAO();
	private List<String> erreurs = new ArrayList<String>();
	
	// Constructeur
	
	/**
	 * Constructeur qui h�rite du constructeur de la classe Object
	 */
	public UtilisateurMger() {
		super();
	}
	
	// M�thodes
	
	/**
	 * M�thode r�cup�rant tous le champs d'un utilisateur dans la base
	 * @param idutilisateur
	 * @return
	 * @throws BLLException
	 */
	public Utilisateur selectAll(int idutilisateur) throws BLLException{
		Utilisateur utilisateur;
		try {
			utilisateur = daoUtilisateur.selectAll(idutilisateur);
		} catch(DALException e) {
			throw new BLLException("SelectAll failed -----", e);
		}
		return utilisateur;
	}
	
	/**
	 * M�thode r�cup�rant le num�ro de l'utilisateur en base 
	 * @param pseudo
	 * @return
	 * @throws BLLException
	 */
	public int selectNoUtilisateur(String pseudo) throws BLLException{
		int noUtilisateur = 0;
		try {
			noUtilisateur = daoUtilisateur.selectNoUtilisateur(pseudo);
		} catch(DALException e) {
			throw new BLLException("Select noUtilisateur failed -----", e);
		}
		return noUtilisateur;
	}
	
	/**
	 * M�thode ins�rant un utilisateur dans la base 
	 * @param utilisateur
	 * @throws BLLException
	 * @throws DALException 
	 */
	public void insert(Utilisateur utilisateur) throws BLLException{
		// v�rifications
		boolean valide = true;
		
		if(utilisateur == null) {
			valide = false;
			throw new BLLException("Utilisateur null");
		}if(utilisateur.getPseudo().trim().length()==0) {
			erreurs.add("Le pseudo est obligatoire.\n");
			valide = false;
		}if(utilisateur.getNom().trim().length()==0) {
			erreurs.add("Le nom est obligatoire.\n");
			valide = false;
		}if(utilisateur.getPrenom().trim().length()==0) {
			erreurs.add("Le pr�nom est obligatoire.\n");
			valide = false;
		}if(utilisateur.getEmail().trim().length()==0) {
			erreurs.add("L'email est obligatoire.\n");
			valide = false;
		}if(utilisateur.getRue().trim().length()==0){
			erreurs.add("La rue est obligatoire.\n");
			valide = false;
		}if(utilisateur.getCodePostal().trim().length()==0){
			erreurs.add("Le code postal est obligatoire.\n");
			valide = false;
		}if(utilisateur.getVille().trim().length()==0){
			erreurs.add("La ville est obligatoire.\n");
			valide = false;
		}if(utilisateur.getMotDePasse().trim().length()==0){
			erreurs.add("Le mot de passe est obligatoire.\n");
			valide = false;
		}
		try {
			if(daoUtilisateur.selectNoUtilisateur(utilisateur.getPseudo()) != 0) {
				valide = false;
				erreurs.add("Le pseudo que vous avez choisi existe d�j�, veuillez en choisir un nouveau.");
			}
		} catch (DALException e1) {
			e1.printStackTrace();
		}
		
		try {
			if(valide) {
				daoUtilisateur.Insert(utilisateur);	
			}
		} catch(DALException e){
			throw new BLLException("Insert failed ----", e);
		}
	}
	
	/**
	 * M�thode mettant � jour les informations de l'utilisateur dans la base
	 * @param utilisateur
	 * @throws BLLException
	 */
	public void update(Utilisateur utilisateur) throws BLLException{
		// v�rifications
		boolean valide = true;
		
		if(utilisateur == null) {
			valide = false;
			throw new BLLException("Utilisateur null");
		}if(utilisateur.getPseudo().trim().length()==0) {
			erreurs.add("Le pseudo est obligatoire.\n");
			valide = false;
		}if(utilisateur.getNom().trim().length()==0) {
			erreurs.add("Le nom est obligatoire.\n");
			valide = false;
		}if(utilisateur.getPrenom().trim().length()==0) {
			erreurs.add("Le pr�nom est obligatoire.\n");
			valide = false;
		}if(utilisateur.getEmail().trim().length()==0) {
			erreurs.add("L'email est obligatoire.\n");
			valide = false;
		}if(utilisateur.getRue().trim().length()==0){
			erreurs.add("La rue est obligatoire.\n");
			valide = false;
		}if(utilisateur.getCodePostal().trim().length()==0){
			erreurs.add("Le code postal est obligatoire.\n");
			valide = false;
		}if(utilisateur.getVille().trim().length()==0){
			erreurs.add("La ville est obligatoire.\n");
			valide = false;
		}if(utilisateur.getMotDePasse().trim().length()==0){
			erreurs.add("Le mot de passe est obligatoire.\n");
			valide = false;
		}
		try {
			if(valide) {
				daoUtilisateur.Update(utilisateur);
			}
		} catch(DALException e) {
			throw new BLLException("Update failed ----", e);
		}
	}
	
	/**
	 * M�thode v�rifiant que l'utilisateur essayant de se connecter est bien en base
	 * @param pseudo
	 * @param mdp
	 * @return
	 * @throws BLLException
	 */
	public boolean checkUser(String pseudo, String mdp) throws BLLException{
		boolean trouver = false;
		try {
			if(daoUtilisateur.checkUser(pseudo, mdp) == true) {
				trouver = true;
			} else {
				trouver = false;
			}
		} catch(DALException e ) {
			throw new BLLException("Check User failed ----", e );
		}
		return trouver;
	}
	
	/**
	 * Renvoie une liste d'erreurs 
	 * @return une liste d'erreurs relatives aux requ�tes d'insertion, de mise � jours
	 */
	public List<String> getErreurs(){
		return erreurs;
	}

}
