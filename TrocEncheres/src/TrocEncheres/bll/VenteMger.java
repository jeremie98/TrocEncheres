package TrocEncheres.bll;

import TrocEncheres.bo.Vente;
import TrocEncheres.dal.DaoFactory;
import TrocEncheres.dal.DaoVente;

public class VenteMger {
	DaoVente daoVente = DaoFactory.getVenteDAO();
	
	// Constructeur
	public VenteMger() {
		super();
	}
	
	// Méthodes 
	public void insert(Vente vente) {
		
	}

}
