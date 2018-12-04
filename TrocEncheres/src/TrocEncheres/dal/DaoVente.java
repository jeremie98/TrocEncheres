package TrocEncheres.dal;

import java.util.List;

import TrocEncheres.bo.Vente;

public interface DaoVente {

	void Insert(Vente vente) throws DALException;
	
	List<Vente> listVente() throws DALException;
	
	void Delete(Vente vente) throws DALException;
	
	void Update(Vente vente) throws DALException;
	
}
