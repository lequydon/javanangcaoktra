package Don_controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Don_bean.TinTucBean;
import Don_bo.TinTucBo;

/**
 * Servlet implementation class TinTucController
 */
@WebServlet("/TinTucController")
public class TinTucController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TinTucController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    TinTucBo sbo=new TinTucBo();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String tk=request.getParameter("search");
		ArrayList<TinTucBean> listtintuc=null;
		if(tk!=null)
		{
			listtintuc=sbo.timkey(tk);
		}
		else
			listtintuc=sbo.gettintuc();
		request.setAttribute("listtintuc", listtintuc);
		RequestDispatcher rd=request.getRequestDispatcher("Don_TinTuc.jsp");
		rd.forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
