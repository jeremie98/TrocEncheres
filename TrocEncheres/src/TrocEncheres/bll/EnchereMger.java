package TrocEncheres.bll;

import java.sql.Date;

import TrocEncheres.dal.DALException;
import TrocEncheres.dal.DaoEnchere;
import TrocEncheres.dal.DaoFactory;

public class EnchereMger {

	// Attributs
	DaoEnchere daoEnchere = DaoFactory.getEnchereDAO();
	
	// Enchere
	public EnchereMger() {
		// TODO Auto-generated constructor stub
	}
	
	// Méthodes
	
	/**
	 * Méthode insérant une enchère en base
	 * @param dateEnchere
	 * @param no_utilisateur
	 * @param no_vente
	 * @param proposition
	 * @throws BLLException
	 */
	public void insert(int no_utilisateur, int no_vente, int proposition) throws BLLException{
		try {
			daoEnchere.Insert(no_utilisateur, no_vente, proposition);
		
		} catch(DALException e) {
			throw new BLLException("Insert failed ------", e);
		}
	}
	
	/**
	 * Méthode retournant la dernière proposition de l'utilisateur
	 * @param no_utilisateur
	 * @return une proposition
	 * @throws BLLException
	 */
	public int selectByUtilisateur(int no_utilisateur, int no_vente) throws BLLException{
		int proposition;
		try {
			proposition = daoEnchere.selectByUtilisateur(no_utilisateur, no_vente);
			
		} catch(DALException e) {
			throw new BLLException("SelectByUtilisateur failed ------", e);
		}
		return proposition;
	}

}
