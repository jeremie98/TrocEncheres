package TrocEncheres.bo;

/**
 * Classe repr�sentant la cat�gorie d'un article mis en vente
 * @author jpelage2018
 *
 */
public class Categorie {

	// Attributs
	private int noCategorie;
	private String libelle;
	
	// Constructeur
	
	/**
	 * Constructeur h�ritant du constructeur de la classe Object
	 */
	public Categorie() {
		super();
	}

	/**
	 * Constructeur avec deux param�tres, num�ro de cat�gorie et son libell�
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
	 * @return num�ro de cat�gorie
	 */
	public int getNoCategorie() {
		return noCategorie;
	}

	/**
	 * Setteur de NoCategorie, modifie la valeur du num�ro de cat�gorie
	 * @param noCategorie
	 */
	public void setNoCategorie(int noCategorie) {
		this.noCategorie = noCategorie;
	}

	/**
	 * Getteur de libell�
	 * @return libell� de la cat�gorie
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Setteur de libell�, modifie la valeur du libell� 
	 * @param libelle
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
}
