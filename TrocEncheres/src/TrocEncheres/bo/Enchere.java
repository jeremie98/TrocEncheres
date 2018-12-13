package TrocEncheres.bo;

import java.util.Date;

/**
 * Classe représentant une enchère (proposition d'achat d'un article)
 * @author jpelage2018
 *
 */
public class Enchere {

	// Attributs
	private int no_utilisateur;
	private int no_vente;
	private Date dateEnchere;
	private int proposition;
	
	// Constructeurs
	
	/*
	 * Constructeur héritant du constructeur de la classe Object
	 */
	public Enchere() {
		super();
	}

	/**
	 * Constructeur avec trois paramètres, utilisateur, vente et dateEnchere
	 * @param no_utilisateur
	 * @param no_vente
	 * @param dateEnchere
	 */
	public Enchere(int no_utilisateur, int no_vente, Date dateEnchere, int proposition) {
		super();
		this.no_utilisateur = no_utilisateur;
		this.no_vente = no_vente;
		this.dateEnchere = new Date(dateEnchere.getTime());
		this.proposition = proposition;
	}

	// Accesseurs
	
	/**
	 * Getteur d'utilisateur
	 * @return l'utilisateur associé  à l'enchère
	 */
	public int getUtilisateur() {
		return no_utilisateur;
	}

	/**
	 * Setteur d'utilisateur, modifie la valeur d'utilisateur
	 * @param utilisateur
	 */
	public void setUtilisateur(int no_utilisateur) {
		this.no_utilisateur = no_utilisateur;
	}

	/**
	 * Getteur de vente
	 * @return la vente auquel est associée l'enchère
	 */
	public int getVente() {
		return no_vente;
	}

	/**
	 * Setteur de vente, modifie la valeur de vente
	 * @param vente
	 */
	public void setVente(int no_vente) {
		this.no_vente = no_vente;
	}

	/**
	 * Getteur de dateEnchere
	 * @return la date de l'enchère
	 */
	public Date getDateEnchere() {
		return dateEnchere;
	}

	/**
	 * Setteur de dateEnchere, modifie la valeur de dateEnchere
	 * @param dateEnchere
	 */
	public void setDateEnchere(Date dateEnchere) {
		this.dateEnchere = dateEnchere;
	}
	
	/**
	 * Getteur de proposition
	 * @return la proposition d'un utilisateur
	 */
	public int getProposition() {
		return proposition;
	}
	/**
	 * Setteur de proposition, modifie la valeur de proposition
	 * @param dateEnchere
	 */
	public void setProposition(int proposition) {
		this.proposition = proposition;
	}
}
