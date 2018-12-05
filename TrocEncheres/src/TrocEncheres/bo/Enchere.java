package TrocEncheres.bo;

import java.util.Date;

/**
 * Classe repr�sentant une ench�re (proposition d'achat d'un article)
 * @author jpelage2018
 *
 */
public class Enchere {

	// Attributs
	private Utilisateur utilisateur;
	private Vente vente;
	private Date dateEnchere;
	
	// Constructeurs
	
	/*
	 * Constructeur h�ritant du constructeur de la classe Object
	 */
	public Enchere() {
		super();
	}

	/**
	 * Constructeur avec trois param�tres, utilisateur, vente et dateEnchere
	 * @param utilisateur
	 * @param vente
	 * @param dateEnchere
	 */
	public Enchere(Utilisateur utilisateur, Vente vente, Date dateEnchere) {
		super();
		this.utilisateur = utilisateur;
		this.vente = vente;
		this.dateEnchere = dateEnchere;
	}

	// Accesseurs
	
	/**
	 * Getteur d'utilisateur
	 * @return l'utilisateur associ�  � l'ench�re
	 */
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	/**
	 * Setteur d'utilisateur, modifie la valeur d'utilisateur
	 * @param utilisateur
	 */
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	/**
	 * Getteur de vente
	 * @return la vente auquel est associ�e l'ench�re
	 */
	public Vente getVente() {
		return vente;
	}

	/**
	 * Setteur de vente, modifie la valeur de vente
	 * @param vente
	 */
	public void setVente(Vente vente) {
		this.vente = vente;
	}

	/**
	 * Getteur de dateEnchere
	 * @return la date de l'ench�re
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
}
