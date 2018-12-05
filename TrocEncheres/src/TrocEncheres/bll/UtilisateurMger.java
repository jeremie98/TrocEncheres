package TrocEncheres.bll;

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
	
	// Constructeur
	
	/**
	 * Constructeur qui h�rite du constructeur de la classe Object
	 */
	public UtilisateurMger() {
		super();
	}
	
	// M�thodes
	
	/**
	 * M�thode ins�rant un utilisateur dans la base 
	 * @param utilisateur
	 * @throws BLLException
	 */
	public void insert(Utilisateur utilisateur) throws BLLException{
		try {
			daoUtilisateur.Insert(utilisateur);
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
		try {
			daoUtilisateur.Update(utilisateur);
		} catch(DALException e) {
			throw new BLLException("Update failed ----", e);
		}
	}
	
	public boolean checkUser(String pseudo, String mdp) throws BLLException{
		boolean trouver = false;
		try {
			if(
			daoUtilisateur.checkUser(pseudo, mdp) == true) {
				
				trouver = true;
			}else if (daoUtilisateur.checkUser(pseudo, mdp) == false){
				
				trouver = false;
			}
			
		} catch(DALException e ) {
			throw new BLLException("Check User failed ----", e );
		}
		return trouver;
	}

}
