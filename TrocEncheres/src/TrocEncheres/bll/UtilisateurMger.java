package TrocEncheres.bll;

import TrocEncheres.bo.Utilisateur;
import TrocEncheres.dal.DALException;
import TrocEncheres.dal.DaoFactory;
import TrocEncheres.dal.DaoUtilisateur;

public class UtilisateurMger {
	DaoUtilisateur daoUtilisateur = DaoFactory.getUtilisateurDAO();
	
	// Constructeur
	public UtilisateurMger() {
		super();
	}
	
	// Méthodes
	public void insert(Utilisateur utilisateur) throws BLLException{
		try {
			daoUtilisateur.Insert(utilisateur);
		} catch(DALException e){
			throw new BLLException("Insert failed ----", e);
		}
	}
	
	public void update(Utilisateur utilisateur) throws BLLException{
		try {
			daoUtilisateur.Update(utilisateur);
		} catch(DALException e) {
			throw new BLLException("Update failed ----", e);
		}
	}

}
