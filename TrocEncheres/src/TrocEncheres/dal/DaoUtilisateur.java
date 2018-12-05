package TrocEncheres.dal;

import TrocEncheres.bo.Utilisateur;

/**
 * Interface déclarant les méthodes relatives à la communication avec la base de données de l'objet Utilisateur
 * @author jpelage2018
 *
 */
public interface DaoUtilisateur {

	void Insert(Utilisateur utilisateur) throws DALException;
	
	void Update(Utilisateur utilisateur) throws DALException;
}
