package TrocEncheres.dal;

import TrocEncheres.dal.DALException;

/**
 * Interface d�clarant les m�thodes relatives � la communication avec la base de donn�es de l'objet Enchere
 * @author jpelage2018
 *
 */
public interface DaoEnchere {
	void Insert(int no_utilisateur, int no_vente, int proposition) throws DALException;
	
	int selectByUtilisateur(int no_utilisateur, int no_vente) throws DALException;
}
