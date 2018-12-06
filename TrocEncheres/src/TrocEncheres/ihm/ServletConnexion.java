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
			boolean trouver = false;
			UtilisateurMger userManag = new UtilisateurMger();
			String pseudo = request.getParameter("user");
			String mdp = request.getParameter("pass");
			
		
		if (userManag.checkUser(pseudo, mdp) == false) {
			trouver = false;
		}
		if (userManag.checkUser(pseudo, mdp) == true) {
			request.getSession().setAttribute("idutilisateur", userManag.selectNoUtilisateur(pseudo));
			
			trouver = true;
			request.getRequestDispatcher("WEB-INF/creer_compte.jsp").forward(request, response);	
		}
		
		} catch (BLLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
