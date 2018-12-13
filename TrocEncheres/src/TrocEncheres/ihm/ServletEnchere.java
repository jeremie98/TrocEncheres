package TrocEncheres.ihm;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import TrocEncheres.bll.BLLException;
import TrocEncheres.bll.EnchereMger;
import TrocEncheres.bll.VenteMger;
import TrocEncheres.bo.Enchere;
import TrocEncheres.bo.Retrait;
import TrocEncheres.bo.Vente;

/**
 * Servlet implementation class ServletEnchere
 */
@WebServlet("/ServletEnchere")
public class ServletEnchere extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletEnchere() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Récupération des informations de la vente
		VenteMger venteMger = new VenteMger();
		EnchereMger enchereMger = new EnchereMger();
		Vente vente = null;
		Retrait retrait = null;
		int propositionEnchere;
		try {
			vente = venteMger.selectById(Integer.parseInt(request.getParameter("noVente")));
			retrait = venteMger.selectRetrait(Integer.parseInt(request.getParameter("noVente")));
			propositionEnchere = enchereMger.selectByUtilisateur((Integer)request.getSession().getAttribute("idutilisateur"), 
					Integer.parseInt(request.getParameter("noVente")));
			request.setAttribute("numeroVente", vente.getNoVente());
			request.setAttribute("nomArticle", vente.getNomArticle());
			request.setAttribute("description", vente.getDescription());
			request.setAttribute("meilleureOffre", vente.getPrixVente());
			request.setAttribute("miseAPrix", vente.getMiseAPrix());
			request.setAttribute("finEnchere", vente.getDateFinEncheres());
			String AdresseRetrait = retrait.getRue()+"\n"+retrait.getCode_postal()+"\n"+retrait.getVille();
			request.setAttribute("retrait", AdresseRetrait);
			request.setAttribute("vendeur", venteMger.selectPseudoVente(Integer.parseInt(request.getParameter("noVente"))));
			request.setAttribute("proposition", propositionEnchere);

		} catch(BLLException e) {
			e.printStackTrace();
		}
		
		// redirection vers la page de détails d'une vente
		request.getRequestDispatcher("WEB-INF/detailvente.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// récupération et enregistrement de l'enchère
		EnchereMger enchereMger = new EnchereMger();
		
		try {
			enchereMger.insert((Integer)request.getSession().getAttribute("idutilisateur"), 
					Integer.parseInt(request.getParameter("noVente")), 
					Integer.parseInt(request.getParameter("proposition")));
			
			// redirection vers la page de listeEnchere
			request.getRequestDispatcher("WEB-INF/liste_encheres.jsp").forward(request, response);
		
		} catch (BLLException e) {
			e.printStackTrace();
		}
		
	}

}
