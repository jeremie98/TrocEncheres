package TrocEncheres.ihm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import TrocEncheres.bll.BLLException;
import TrocEncheres.bll.VenteMger;
import TrocEncheres.bo.Retrait;
import TrocEncheres.bo.Vente;

/**
 * Servlet implementation class ServletAccueil
 */
@WebServlet("/ServletAccueil")
public class ServletListeEncheres extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletListeEncheres() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		VenteMger venteManag = new VenteMger();
		// envoi d'un objet VenteMger à la JSP
		request.setAttribute("venteManager", venteManag);
		try {
			List<Vente> listeVentes = venteManag.listVente();
			// récupération de la liste de ventes
			request.setAttribute("listVentes",listeVentes);
			
			// redirection vers la page d'accueil
			request.getRequestDispatcher("WEB-INF/liste_encheres.jsp").forward(request, response);
		} catch (BLLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
