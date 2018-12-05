package TrocEncheres.dal;

import TrocEncheres.bo.Utilisateur;

/**
 * Interface d�clarant les m�thodes relatives � la communication avec la base de donn�es de l'objet Utilisateur
 * @author jpelage2018
 *
 */
public interface DaoUtilisateur {

	void Insert(Utilisateur utilisateur) throws DALException;
	
	void Update(Utilisateur utilisateur) throws DALException;
}
