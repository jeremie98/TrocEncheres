package TrocEncheres.dal;

import TrocEncheres.bo.Utilisateur;

public interface DaoUtilisateur {

	void Insert(Utilisateur utilisateur) throws DALException;
	
	void Update(Utilisateur utilisateur) throws DALException;
}
