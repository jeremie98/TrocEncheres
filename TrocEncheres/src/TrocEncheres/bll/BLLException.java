package TrocEncheres.bll;

/**
 * Classe Business Logic Layer Exception qui va r�cup�rer les erreurs  provenant de la couche DAL
 * @author jpelage2018
 *
 */
public class BLLException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructeur qui h�rite du conscruteur parent (Exception)
	 */
	public BLLException() {
		super();
	}
	
	/**
	 * Constructeur avec deux param�tres, message et cause
	 * @param message
	 * @param cause
	 */
	public BLLException(String message, Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * Constructeur avec un param�tre message
	 * @param message
	 */
	public BLLException(String message) {
		super(message);
	}

}
