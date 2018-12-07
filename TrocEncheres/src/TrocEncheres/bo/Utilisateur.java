package TrocEncheres.bo;

/**
 * Classe représentant un utilisateur, personne connecté à la plateforme et qui participe aux enchères
 * @author jpelage2018
 *
 */
public class Utilisateur {
	// Attributs
	private int noUtilisateur;
	private String pseudo;
	private String nom;
	private String prenom;
	private String email;
	private int telephone;
	private String rue;
	private String codePostal;
	private String ville;
	private String motDePasse;
	private int credit;
	private boolean administrateur;
	
	// Constructeurs
	
	/*
	 * Constructeur héritant du constructeur de la classe Object
	 */
	public Utilisateur() {
		super();
	}

	/**
	 * Constructeur avec neuf paramètres, le pseudo, le nom, le prénom, l'email, 
	 * le téléphone, la rue de l'adresse, le code postal, la ville et le mot de passe de l'utilisateur
	 * @param pseudo
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param telephone
	 * @param rue
	 * @param codePostal
	 * @param ville
	 * @param motDePasse
	 */
	public Utilisateur(String pseudo, String nom, String prenom, String email, int telephone, String rue,
			String codePostal, String ville, String motDePasse) {
		super();
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
	}
	
	/**
	 * Constructeur avec onze paramètres, le pseudo, le nom, le prénom, l'email, le téléphone, 
	 * la rue de l'adresse, le code postal, la ville, le mot de passe, le crédit et administrateur de l'utilisateur
	 * @param pseudo
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param telephone
	 * @param rue
	 * @param codePostal
	 * @param ville
	 * @param motDePasse
	 * @param credit
	 * @param administrateur
	 */
	public Utilisateur(String pseudo, String nom, String prenom, String email, int telephone, String rue,
			String codePostal, String ville, String motDePasse, int credit, boolean administrateur) {
		super();
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;
		this.administrateur = administrateur;
	}

	/**
	 * Constructeur avec onze paramètres, le pseudo, le nom, le prénom, l'email, le téléphone, la rue de l'adresse,
	 * le code postal, la ville, le mot de passe et administrateur de l'utilisateur
	 * @param noUtilisateur
	 * @param pseudo
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param telephone
	 * @param rue
	 * @param codePostal
	 * @param ville
	 * @param motDePasse
	 * @param administrateur
	 */
	public Utilisateur(int noUtilisateur, String pseudo, String nom, String prenom, String email, int telephone,
			String rue, String codePostal, String ville, String motDePasse, boolean administrateur) {
		super();
		this.noUtilisateur = noUtilisateur;
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.administrateur = administrateur;
	}
	
	/**
	 * Constructeur contenant tous les champs de l'utilisateur
	 * @param noUtilisateur
	 * @param pseudo
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param telephone
	 * @param rue
	 * @param codePostal
	 * @param ville
	 * @param motDePasse
	 * @param credit
	 * @param administrateur
	 */
	public Utilisateur(int noUtilisateur, String pseudo, String nom, String prenom, String email, int telephone,
			String rue, String codePostal, String ville, String motDePasse, int credit, boolean administrateur) {
		super();
		this.noUtilisateur = noUtilisateur;
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;
		this.administrateur = administrateur;
	}


	// Accesseurs
	
	/**
	 * Getteur de noUtilisateur
	 * @return le numéro de l'utilisateur
	 */
	public int getNoUtilisateur() {
		return noUtilisateur;
	}

	/**
	 * Setteur du numéro utilisateur, modifie la valeur de noUtilisateur
	 * @param noUtilisateur
	 */
	public void setNoUtilisateur(int noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}

	/**
	 * Getteur de pseudo
	 * @return le pseudo de l'utilisateur
	 */
	public String getPseudo() {
		return pseudo;
	}

	/**
	 * Setteur de pseudo, modifie la valeur de pseudo
	 * @param pseudo
	 */
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	/**
	 * Getteur de nom
	 * @return le nom de l'utilisateur
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setteur de nom, modifie la valeur de nom
	 * @param nom 
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getteur de prenom
	 * @return le prénom de l'utilisateur
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Setteur de prenom, modifie la valeur de prenom
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Getteur de email
	 * @return l'email de l'utilisateur
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Setteur de email, modifie la valeur de l'email
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Getteur de telephone
	 * @return le numéro de téléphone de l'utilisateur
	 */
	public int getTelephone() {
		return telephone;
	}

	/**
	 * Setteur de telephone, modifie la valeur de telephone
	 * @param telephone
	 */
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	/**
	 * Getteur de rue
	 * @return la rue de l'adresse de l'utilisateur
	 */
	public String getRue() {
		return rue;
	}

	/**
	 * Setteur de rue, modifie la valeur de rue
	 * @param rue
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}

	/**
	 * Getteur de code postal
	 * @return le code postal de l'adresse de l'utilisateur
	 */
	public String getCodePostal() {
		return codePostal;
	}

	/**
	 * Setteur de code postal, modifie la valeur de codepostal
	 * @param codePostal
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * Getteur de ville
	 * @return la ville de l'adresse de l'utilisateur
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * Setteur de ville, modifie la valeur de ville
	 * @param ville
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/**
	 * Getteur de motdepasse
	 * @return le mot de passe de l'utilisateur
	 */
	public String getMotDePasse() {
		return motDePasse;
	}

	/**
	 * Setteur de mot de passe, modifie la valeur de mot de passe
	 * @param motDePasse
	 */
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	/**
	 * Getteur de credit
	 * @return le crédit de l'utilisateur
	 */
	public int getCredit() {
		return credit;
	}

	/**
	 * Setteur de crédit, modifie la valeur de credit
	 * @param credit
	 */
	public void setCredit(int credit) {
		this.credit = credit;
	}

	/**
	 * Getteur d'administrateur
	 * @return true si l'utilisateur est administrateur sinon false
	 */
	public boolean isAdministrateur() {
		return administrateur;
	}

	/**
	 * Setteur d'administrateur, passe administrateur à true ou false
	 * @param administrateur
	 */
	public void setAdministrateur(boolean administrateur) {
		this.administrateur = administrateur;
	}

	/**
	 * Méthode toString qui va afficher les informations de l'utilisateur
	 */
	@Override
	public String toString() {
		return "Utilisateur [noUtilisateur=" + noUtilisateur + ", pseudo=" + pseudo + ", nom=" + nom + ", prenom="
				+ prenom + ", email=" + email + ", telephone=" + telephone + ", rue=" + rue + ", codePostal="
				+ codePostal + ", ville=" + ville + ", motDePasse=" + motDePasse + ", credit=" + credit
				+ ", administrateur=" + administrateur + "]";
	}

	

}
