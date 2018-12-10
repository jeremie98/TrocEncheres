package TrocEncheres.ihm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import TrocEncheres.bll.BLLException;
import TrocEncheres.bll.UtilisateurMger;
import TrocEncheres.bo.Utilisateur;

/**
 * Servlet Inscription qui va redirigé vers la page d'inscription, et traité les informations 
 * isssues du formulaire d'inscription
 * @author jpelage2018
 *
 */
public class ServletInscription extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("WEB-INF/creer_compte.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			UtilisateurMger userManag = new UtilisateurMger(); 
			Utilisateur utilisateur;
			String pseudo = req.getParameter("pseudo").trim();
			int tel = 0;
			if(req.getParameter("tel").trim() != "") {
				tel = Integer.parseInt(req.getParameter("tel").trim());
			}
			String cp = req.getParameter("cp").trim();
			String pass = req.getParameter("pass").trim();
			String mail = req.getParameter("email").trim();
			String rue = req.getParameter("rue").trim();
			String ville = req.getParameter("ville").trim();
			String confirm = req.getParameter("confPass").trim();
			String nom = req.getParameter("nom").trim();
			String prenom = req.getParameter("prenom").trim();
			utilisateur = new Utilisateur(pseudo,nom,prenom,mail,tel,rue,cp,ville,pass);
			
			// si les mots de passe correspondent on réalise l'insert
			if(pass.equals(confirm)) {
				userManag.insert(utilisateur);
				if(userManag.getErreurs().isEmpty()) {
					// redirection vers la page de connexion
					req.getRequestDispatcher("WEB-INF/connexion.jsp").forward(req, resp);
				} else {
					req.setAttribute("erreurs", userManag.getErreurs());
					req.getRequestDispatcher("WEB-INF/creer_compte.jsp").forward(req, resp);
				}
			}else {
				req.setAttribute("mdpincorrect", "Les mots de passes sont différents");
				req.getRequestDispatcher("WEB-INF/creer_compte.jsp").forward(req, resp);
			}
		} catch (BLLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
