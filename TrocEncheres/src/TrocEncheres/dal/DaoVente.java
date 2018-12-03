package TrocEncheres.dal;

import java.util.List;

public interface DaoVente {

	void Insert(Vente vente);
	
	List<Vente> listVente;
	
	void Delete(Vente vente);
	
	void Update(Vente vente);
	
}
