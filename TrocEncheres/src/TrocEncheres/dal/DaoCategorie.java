package TrocEncheres.dal;

import java.util.List;

import TrocEncheres.bo.Categorie;

public interface DaoCategorie {
	
	List<Categorie> selectAll() throws DALException;
}
