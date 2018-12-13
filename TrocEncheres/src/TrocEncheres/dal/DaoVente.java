package TrocEncheres.dal;

import java.util.List;

import TrocEncheres.bo.Retrait;
import TrocEncheres.bo.Vente;

/**
 * Interface déclarant les méthodes relatives à la communication avec la base de données de l'objet Vente
 * @author jpelage2018
 *
 */
public interface DaoVente {

	void Insert(Vente vente, int no_utilisateur, int idCateg, Retrait retrait) throws DALException;
	
	List<Vente> listVente() throws DALException;
	
	void Delete(Vente vente) throws DALException;
	
	void Update(Vente vente) throws DALException;
	
	Retrait selectRetrait(int no_vente) throws DALException;
	
	String selectPseudoVente(int no_vente) throws DALException;
	
	Vente selectById(int no_vente) throws DALException;
	
}
