package TrocEncheres.ihm;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import TrocEncheres.bll.BLLException;
import TrocEncheres.bll.CategorieMger;
import TrocEncheres.bll.UtilisateurMger;
import TrocEncheres.bll.VenteMger;
import TrocEncheres.bo.Retrait;
import TrocEncheres.bo.Utilisateur;
import TrocEncheres.bo.Vente;

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
		// redirection vers la page de nouvelle vente
		// affichage des catégories dans la liste déroulante
				CategorieMger categorieMger = new CategorieMger();
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
		
		try {
			

			Vente vente = null;
			Retrait retrait = null;
			Date d;
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			String nomArticle = request.getParameter("article").trim();
			String description = request.getParameter("description").trim();
			d = sdf.parse(request.getParameter("dateLimite"));
			int prix = Integer.parseInt(request.getParameter("prix"));
			int prix_vente = 0;
			int id = (Integer)request.getSession().getAttribute("idutilisateur");
			int id_categ = Integer.parseInt(request.getParameter("categorie"));
			String rue = request.getParameter("rue");
			String cp = request.getParameter("cp");
			String ville = request.getParameter("ville");
			
			vente = new Vente(nomArticle,description,d,prix,prix_vente,id,id_categ);
			retrait = new Retrait(vente.getIdCateg(),rue,cp,ville);
			VenteMger venteManag = new VenteMger();
			
			
			try {
				venteManag.insert(vente, id, id_categ, retrait);
			} catch (BLLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			}catch(ParseException e){
				
				e.printStackTrace();
			}
		
	}

}
