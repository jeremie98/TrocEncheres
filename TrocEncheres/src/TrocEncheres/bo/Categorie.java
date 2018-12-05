package TrocEncheres.bo;

/**
 * Classe représentant la catégorie d'un article mis en vente
 * @author jpelage2018
 *
 */
public class Categorie {

	// Attributs
	private int noCategorie;
	private String libelle;
	
	// Constructeur
	
	/**
	 * Constructeur héritant du constructeur de la classe Object
	 */
	public Categorie() {
		super();
	}

	/**
	 * Constructeur avec deux paramètres, numéro de catégorie et son libellé
	 * @param noCategorie
	 * @param libelle
	 */
	public Categorie(int noCategorie, String libelle) {
		super();
		this.noCategorie = noCategorie;
		this.libelle = libelle;
	}

	// Accesseurs
	
	/**
	 * Getteur de NoCategorie
	 * @return numéro de catégorie
	 */
	public int getNoCategorie() {
		return noCategorie;
	}

	/**
	 * Setteur de NoCategorie, modifie la valeur du numéro de catégorie
	 * @param noCategorie
	 */
	public void setNoCategorie(int noCategorie) {
		this.noCategorie = noCategorie;
	}

	/**
	 * Getteur de libellé
	 * @return libellé de la catégorie
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Setteur de libellé, modifie la valeur du libellé 
	 * @param libelle
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
}
