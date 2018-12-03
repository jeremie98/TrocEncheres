package TrocEncheres.bo;

import java.util.Date;

public class Enchere {

	// Attributs
	private Utilisateur utilisateur;
	private Vente vente;
	private Date dateEnchere;
	
	// Constructeur
	public Enchere() {
		super();
	}

	public Enchere(Utilisateur utilisateur, Vente vente, Date dateEnchere) {
		super();
		this.utilisateur = utilisateur;
		this.vente = vente;
		this.dateEnchere = dateEnchere;
	}

	// Accesseurs
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Vente getVente() {
		return vente;
	}

	public void setVente(Vente vente) {
		this.vente = vente;
	}

	public Date getDateEnchere() {
		return dateEnchere;
	}

	public void setDateEnchere(Date dateEnchere) {
		this.dateEnchere = dateEnchere;
	}
}
