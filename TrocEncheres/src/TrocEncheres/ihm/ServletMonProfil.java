package TrocEncheres.ihm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.generic.NEW;

import TrocEncheres.bll.BLLException;
import TrocEncheres.bll.UtilisateurMger;
import TrocEncheres.bo.Utilisateur;

/**
 * Servlet MonProfil qui va redirigé vers la page de modification de profil, et traité les informations 
 * isssues du formulaire de modification
 * @author jpelage2018
 *
 */
public class ServletMonProfil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletMonProfil() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// récupération des informations à afficher sur la page profil
		try {
			UtilisateurMger userMger = new UtilisateurMger();
			Utilisateur utilisateur;
			utilisateur = userMger.selectAll((Integer)request.getSession().getAttribute("idutilisateur"));
			// mise à disposition des données pour la JSP
			request.setAttribute("pseudo", utilisateur.getPseudo());
			request.setAttribute("nom", utilisateur.getPseudo());
			request.setAttribute("prenom", utilisateur.getPseudo());
			request.setAttribute("email", utilisateur.getPseudo());
			request.setAttribute("telephone", utilisateur.getPseudo());
			request.setAttribute("rue", utilisateur.getPseudo());
			request.setAttribute("codepostal", utilisateur.getPseudo());
			request.setAttribute("ville", utilisateur.getPseudo());

			
		} catch(BLLException e) {
			e.printStackTrace(); 
		}
			
		// redirection vers la page de modification de profil
		request.getRequestDispatcher("WEB-INF/mon_profil.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// enregistrement des modifications 
		try {
			UtilisateurMger userMger = new UtilisateurMger();
			Utilisateur utilisateur;
			// récupération des informations du formulaire
			String pseudo = request.getParameter("pseudo").trim();
			String nom = request.getParameter("nom").trim();
			String prenom = request.getParameter("prenom").trim();
			String email = request.getParameter("email").trim();
			int tel = Integer.parseInt(request.getParameter("tel").trim());
			String rue = request.getParameter("rue").trim();
			String cp = request.getParameter("cp").trim();
			String ville = request.getParameter("ville").trim();
			String pass = request.getParameter("pass").trim();
			String confPass = request.getParameter("confPass").trim();
			utilisateur = new Utilisateur(pseudo, nom, prenom, email, tel, rue, cp, ville, pass);
			// update 
			if(pass.equals(confPass)) {
				userMger.update(utilisateur);
			}	
		} catch(BLLException e) {
			e.printStackTrace();
		}
		// redirection vers la page principale
		request.getRequestDispatcher("WEB-INF/liste_encheres.jsp").forward(request, response);;
	}

}
