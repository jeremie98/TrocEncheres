package TrocEncheres.bo;

public class Categorie {

	// Attributs
	private int noCategorie;
	private String libelle;
	
	// Constructeur
	public Categorie() {
		super();
	}

	public Categorie(int noCategorie, String libelle) {
		super();
		this.noCategorie = noCategorie;
		this.libelle = libelle;
	}

	// Accesseurs
	public int getNoCategorie() {
		return noCategorie;
	}

	public void setNoCategorie(int noCategorie) {
		this.noCategorie = noCategorie;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
}
