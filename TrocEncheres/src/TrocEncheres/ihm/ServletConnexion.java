package TrocEncheres.ihm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import TrocEncheres.bll.BLLException;
import TrocEncheres.bll.UtilisateurMger;

/**
 * Servlet Connexion qui va redirigé vers la page de connexion, et traité les informations 
 * isssues du formulaire de connexion
 * @author jpelage2018
 *
 */
public class ServletConnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConnexion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// affichage de la page de connexion
		request.getRequestDispatcher("WEB-INF/connexion.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			UtilisateurMger userManag = new UtilisateurMger();
			String pseudo = request.getParameter("user").trim();
			String mdp = request.getParameter("pass").trim();
			
			if (userManag.checkUser(pseudo, mdp) == false) {
				request.setAttribute("erreurConnexion", "Erreur de connexion, réessayer...");
				// redirection vers la page de connexion car échec
				request.getRequestDispatcher("WEB-INF/connexion.jsp").forward(request, response);	
			}
			if (userManag.checkUser(pseudo, mdp) == true) {
				// mise en session de l'utilisateur 
				request.getSession().setAttribute("idutilisateur", userManag.selectNoUtilisateur(pseudo));
				// redirection vers la page d'accueil
				request.getRequestDispatcher("/listeencheres").forward(request, response);	
			}
		} catch (BLLException e) {
			e.printStackTrace();
		}
	}
}
