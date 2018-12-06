package TrocEncheres.dal;

import java.util.List;

import TrocEncheres.bo.Vente;

/**
 * Interface déclarant les méthodes relatives à la communication avec la base de données de l'objet Vente
 * @author jpelage2018
 *
 */
public interface DaoVente {

	void Insert(Vente vente, int no_utilisateur) throws DALException;
	
	List<Vente> listVente() throws DALException;
	
	void Delete(Vente vente) throws DALException;
	
	void Update(Vente vente) throws DALException;
	
}
