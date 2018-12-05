package TrocEncheres.dal;

/**
 * Classe héritant de la Classe Exception, retourne les erreurs de la couche relatives à la couche DAL
 * @author jpelage2018
 *
 */
public class DALException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructeur héritant du constructeur de la classe Exception
	 */
	public DALException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur avec deux paramètres, un message et la cause
	 * @param message
	 * @param cause
	 */
	public DALException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur avec un paramètre, un message
	 * @param message
	 */
	public DALException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}
