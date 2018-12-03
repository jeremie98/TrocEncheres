package TrocEncheres.bo;

public class Retrait {

	// Attributs
	private Vente vente;
	private String rue;
	private char code_postal;
	private String ville;
	
	// Constructeurs
	public Retrait() {
		super();
	}

	public Retrait(Vente vente, String rue, char code_postal, String ville) {
		super();
		this.vente = vente;
		this.rue = rue;
		this.code_postal = code_postal;
		this.ville = ville;
	}

	// Accesseurs
	public Vente getVente() {
		return vente;
	}

	public void setVente(Vente vente) {
		this.vente = vente;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public char getCode_postal() {
		return code_postal;
	}

	public void setCode_postal(char code_postal) {
		this.code_postal = code_postal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
}
