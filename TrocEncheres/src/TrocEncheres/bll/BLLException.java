package TrocEncheres.bll;

/**
 * Classe Business Logic Layer Exception qui va récupérer les erreurs  provenant de la couche DAL
 * @author jpelage2018
 *
 */
public class BLLException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructeur qui hérite du conscruteur parent (Exception)
	 */
	public BLLException() {
		super();
	}
	
	/**
	 * Constructeur avec deux paramètres, message et cause
	 * @param message
	 * @param cause
	 */
	public BLLException(String message, Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * Constructeur avec un paramètre message
	 * @param message
	 */
	public BLLException(String message) {
		super(message);
	}

}
