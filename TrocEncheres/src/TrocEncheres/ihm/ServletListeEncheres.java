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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		VenteMger venteManag = new VenteMger();
		List<Vente> listVenteById;
		
		List<Vente> listVentes =  new ArrayList<Vente>();

		
		
		try {
			if (request.getParameter("mesenchere") == null) {
				
				listVentes = venteManag.listVente();
				request.setAttribute("listVentes", listVentes);
				
				request.getRequestDispatcher("WEB-INF/liste_encheres.jsp").forward(request, response);
				
			}else if (request.getParameter("mesenchere").equals("mesVentes")) {
				
				
				System.out.println(request.getParameter("mesenchere"));
			
				listVenteById = venteManag.venteById((Integer)request.getSession().getAttribute("idutilisateur"));
				System.out.println(listVenteById.toString());
				request.setAttribute("listVentes", listVenteById);
				System.out.println(listVenteById.toString());
				request.getRequestDispatcher("WEB-INF/liste_encheres.jsp").forward(request, response);
			}
		}
		catch (BLLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
