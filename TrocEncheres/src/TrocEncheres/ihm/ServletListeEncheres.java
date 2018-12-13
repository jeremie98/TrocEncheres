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

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// redirection vers la page d'accueil
		VenteMger venteManag = new VenteMger();
		request.setAttribute("venteManager", venteManag);

		List<Vente> listVentes =  new ArrayList<Vente>();
		
		try {
			listVentes = venteManag.listVente();
			request.setAttribute("listVentes", listVentes);
			request.getRequestDispatcher("WEB-INF/liste_encheres.jsp").forward(request, response);
			
		} catch (BLLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		VenteMger venteManag = new VenteMger();
		request.setAttribute("venteManager", venteManag);

		List<Vente> listVenteById;
		
		List<Vente> listVentes =  new ArrayList<Vente>();

		
		
		try {
			if (request.getParameter("mesenchere") == null) {
				
				listVentes = venteManag.listVente();
				request.setAttribute("listVentes", listVentes);
				
				request.getRequestDispatcher("WEB-INF/liste_encheres.jsp").forward(request, response);
				
			}else if (request.getParameter("mesenchere").equals("mesVentes")) {
							
				listVenteById = venteManag.venteById((Integer)request.getSession().getAttribute("idutilisateur"));
				request.setAttribute("listVentes", listVenteById);
				request.getRequestDispatcher("WEB-INF/liste_encheres.jsp").forward(request, response);
			}
		}
		catch (BLLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
