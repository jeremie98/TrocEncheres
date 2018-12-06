package TrocEncheres.bo;

import java.sql.Date;

/**
 * Classe représentant une vente, mise à dispostion d'un article
 * @author jpelage2018
 *
 */
public class Vente {

	// Attributs
	private int noVente;
	private String nomArticle;
	private String description;
	private Date dateFinEncheres;
	private int miseAPrix;
	private int prixVente;
	private Utilisateur utilisateur;
	private Categorie categorie;
	
	// Constructeurs
	
	/**
	 * Constructeur héritant du constructeur de la classe Object
	 */
	public Vente() {
		super();
	}

	/**
	 * Constructeur avec huit paramètres, le numéro de vente, le nom de l'article en vente, la description, la date de fin d'enchères,
	 * le prix initial (mise  àprix), le prix de vente(meilleure offre), l'utilisateur et la catégorie de la vente
	 * @param noVente
	 * @param nomArticle
	 * @param description
	 * @param dateFinEncheres
	 * @param miseAPrix
	 * @param prixVente
	 * @param utilisateur
	 * @param categorie
	 */
	public Vente(int noVente, String nomArticle, String description, Date dateFinEncheres, int miseAPrix, int prixVente,
			Utilisateur utilisateur, Categorie categorie) {
		super();
		this.noVente = noVente;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateFinEncheres = dateFinEncheres;
		this.miseAPrix = miseAPrix;
		this.prixVente = prixVente;
		this.utilisateur = utilisateur;
		this.categorie = categorie;
	}

	// Accessseurs
	
	/**
	 * Getteur noVente
	 * @return le numéro de vente 
	 */
	public int getNoVente() {
		return noVente;
	}

	/**
	 * Setteur noVente, modifie la valeur de noVente
	 * @param noVente
	 */
	public void setNoVente(int noVente) {
		this.noVente = noVente;
	}

	/**
	 * Getteur de nomArticle
	 * @return le nom de l'article de la vente
	 */
	public String getNomArticle() {
		return nomArticle;
	}

	/**
	 * Setteur de nomArticle, modifie la valeur de nomArticle
	 * @param nomArticle
	 */
	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}

	/**
	 * Getteur de description
	 * @return la description de l'article en vente
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Setteur de description, modifie la valeur de description
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Getteur de dateFinEncheres
	 * @return la date de fin des enchères pour la vente
	 */
	public Date getDateFinEncheres() {
		return dateFinEncheres;
	}

	/**
	 * Setteur de dateFinEncheres, modifie la valeur de dateFinEncheres
	 * @param dateFinEncheres
	 */
	public void setDateFinEncheres(Date dateFinEncheres) {
		this.dateFinEncheres = dateFinEncheres;
	}

	/**
	 * Getteur de miseAPrix
	 * @return le prix initial de la vente 
	 */
	public int getMiseAPrix() {
		return miseAPrix;
	}

	/**
	 * Setteur de miseAPrix, modifie la valeur de miseAPrix
	 * @param miseAPrix
	 */
	public void setMiseAPrix(int miseAPrix) {
		this.miseAPrix = miseAPrix;
	}

	/**
	 * Getteur de prixVente
	 * @return le prix de la vente (meilleure offre)
	 */
	public int getPrixVente() {
		return prixVente;
	}

	/**
	 * Setteur de prixVente, modifie la valeur de prixVente
	 * @param prixVente
	 */
	public void setPrixVente(int prixVente) {
		this.prixVente = prixVente;
	}

	/**
	 * Getteur de utilisateur
	 * @return l'utilisateur associé à la vente
	 */
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	/**
	 * Setteur de utilisateur, modifie la valeur de utilisateur
	 * @param utilisateur
	 */
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	/**
	 * Getteur de categorie
	 * @return la catégorie de l'article en vente
	 */
	public Categorie getCategorie() {
		return categorie;
	}

	/**
	 * Setteur de categorie, modifie la valeur de categorie
	 * @param categorie
	 */
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
}
