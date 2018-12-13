package TrocEncheres.dal;

import TrocEncheres.dal.DALException;

/**
 * Interface déclarant les méthodes relatives à la communication avec la base de données de l'objet Enchere
 * @author jpelage2018
 *
 */
public interface DaoEnchere {
	void Insert(int no_utilisateur, int no_vente, int proposition) throws DALException;
	
	int selectByUtilisateur(int no_utilisateur, int no_vente) throws DALException;
}
