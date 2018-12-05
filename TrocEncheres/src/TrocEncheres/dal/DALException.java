package TrocEncheres.dal;

/**
 * Classe h�ritant de la Classe Exception, retourne les erreurs de la couche relatives � la couche DAL
 * @author jpelage2018
 *
 */
public class DALException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructeur h�ritant du constructeur de la classe Exception
	 */
	public DALException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur avec deux param�tres, un message et la cause
	 * @param message
	 * @param cause
	 */
	public DALException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur avec un param�tre, un message
	 * @param message
	 */
	public DALException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}
