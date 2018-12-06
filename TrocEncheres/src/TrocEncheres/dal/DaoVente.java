package TrocEncheres.dal;

import java.util.List;

import TrocEncheres.bo.Vente;

/**
 * Interface d�clarant les m�thodes relatives � la communication avec la base de donn�es de l'objet Vente
 * @author jpelage2018
 *
 */
public interface DaoVente {

	void Insert(Vente vente, int no_utilisateur) throws DALException;
	
	List<Vente> listVente() throws DALException;
	
	void Delete(Vente vente) throws DALException;
	
	void Update(Vente vente) throws DALException;
	
}
