package TrocEncheres.bo;

/**
 * Classe représentant un retrait, retrait physique de la marchandise dans un lieu déterminé par la vendeur
 * @author jpelage2018
 *
 */
public class Retrait {

	// Attributs
	private Vente vente;
	private String rue;
	private char code_postal;
	private String ville;
	
	// Constructeurs
	
	/**
	 * Constructeur héritant du constructeur de la classe Object
	 */
	public Retrait() {
		super();
	}

	/**
	 * Constructeur à 4 paramètres, vente, rue, code postal et ville
	 * @param vente
	 * @param rue
	 * @param code_postal
	 * @param ville
	 */
	public Retrait(Vente vente, String rue, char code_postal, String ville) {
		super();
		this.vente = vente;
		this.rue = rue;
		this.code_postal = code_postal;
		this.ville = ville;
	}

	// Accesseurs
	
	/**
	 * Getteur de vente
	 * @return la vente associée au retrait
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
	 * Getteur de rue
	 * @return la rue du lieu du retrait 
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
	 * Getteur de code_postal
	 * @return renvoie le code postal du lieu du retrait
	 */
	public char getCode_postal() {
		return code_postal;
	}

	/**
	 * Setteur de code_postal, modifie la valeur de code_postal
	 * @param code_postal
	 */
	public void setCode_postal(char code_postal) {
		this.code_postal = code_postal;
	}

	/**
	 * Getteur de ville
	 * @return la ville du lieu du retrait
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
}
