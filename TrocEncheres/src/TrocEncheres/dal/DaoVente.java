package TrocEncheres.dal;

import java.util.List;

import TrocEncheres.bo.Vente;

public interface DaoVente {

	void Insert(Vente vente);
	
	List<Vente> listVente();
	
	void Delete(Vente vente);
	
	void Update(Vente vente);
	
}
