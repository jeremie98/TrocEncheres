package TrocEncheres.dal;

import java.util.List;

import TrocEncheres.bo.Utilisateur;

public interface DaoUtilisateur {

	void Insert(Utilisateur utilisateur);
	
	
	List<Utilisateur> listUser;
	
	void Delete(int id);
	
	void Update(Utilisateur utilisateur);
}
