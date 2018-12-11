package TrocEncheres.ihm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import TrocEncheres.bll.BLLException;
import TrocEncheres.bll.CategorieMger;
import TrocEncheres.bll.UtilisateurMger;
import TrocEncheres.bo.Utilisateur;

/**
 * Servlet implementation class ServletVente
 */
@WebServlet("/ServletVente")
public class ServletVente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletVente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// affichage des catégories dans la liste déroulante
		CategorieMger categorieMger = new CategorieMger();
		try {
			request.setAttribute("listeCategorie", categorieMger.selectAll());
		} catch (BLLException e) {
			e.printStackTrace();
		}
		
		// affichage des informations de retrait
		UtilisateurMger userM = new UtilisateurMger();
		Utilisateur user = null;
		try {
			user = userM.selectAll((Integer)request.getSession().getAttribute("idutilisateur"));
		} catch (BLLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			
			request.setAttribute("listeCategorie", categorieMger.selectAll());
			request.setAttribute("rue", user.getRue() );
			request.setAttribute("cp", user.getCodePostal());
			request.setAttribute("ville", user.getVille() );
		} catch (BLLException e) {
			e.printStackTrace();
		}
		
		// redirection vers la page de nouvelle vente
		request.getRequestDispatcher("WEB-INF/vendre.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// enregistrement d'une nouvelle vente
		
	}

}
