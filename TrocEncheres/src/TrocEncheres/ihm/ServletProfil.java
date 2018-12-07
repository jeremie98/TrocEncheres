package TrocEncheres.ihm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import TrocEncheres.bll.BLLException;
import TrocEncheres.bll.UtilisateurMger;
import TrocEncheres.bo.Utilisateur;

/**
 * Servlet implementation class ServletProfil
 */
@WebServlet("/ServletProfil")
public class ServletProfil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletProfil() {
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
			request.setAttribute("nom", utilisateur.getNom());
			request.setAttribute("prenom", utilisateur.getPrenom());
			request.setAttribute("email", utilisateur.getEmail());
			request.setAttribute("telephone", utilisateur.getTelephone());
			request.setAttribute("rue", utilisateur.getRue());
			request.setAttribute("codepostal", utilisateur.getCodePostal());
			request.setAttribute("ville", utilisateur.getVille());
			
		} catch(BLLException e) {
			e.printStackTrace(); 
		}
		
		request.getRequestDispatcher("WEB-INF/profil.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
