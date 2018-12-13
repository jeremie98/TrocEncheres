package TrocEncheres.ihm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import TrocEncheres.bll.UtilisateurMger;
import TrocEncheres.dal.DALException;

public class ServletDeleteUsers extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UtilisateurMger userDel = new UtilisateurMger();
		int idUtilisateur = (Integer) req.getSession().getAttribute("idutilisateur");
		try {
			userDel.delete(idUtilisateur);
			HttpSession session = req.getSession(true);
			session.invalidate();
			req.getRequestDispatcher("WEB-INF/connexion.jsp").forward(req, resp);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	
}
