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
 * Servlet implementation class NoiDungController
 */
@WebServlet("/NoiDungController")
public class NoiDungController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoiDungController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    TinTucBo sbo=new TinTucBo();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			ArrayList<TinTucBean> listtintuc=new ArrayList<TinTucBean>();
			ArrayList<TinTucBean> noidung=new ArrayList<TinTucBean>();
			listtintuc=sbo.gettintuc();
			System.out.print(listtintuc);
			String mtt=request.getParameter("matintuc");
			System.out.print(mtt);
			for(int i=0;i<listtintuc.size();i++) {
				if(listtintuc.get(i).getMatintuc().equals(mtt))
				{
					noidung.add(listtintuc.get(i));
				}
			}
			//ArrayList<TinTucBean> noidung=new ArrayList<TinTucBean>();
			//noidung=sbo.timnoidung(mtt);
			System.out.print(noidung);
			request.setAttribute("noidung", noidung);
			System.out.print(noidung);
			RequestDispatcher rd=request.getRequestDispatcher("Don_NoiDung.jsp");
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
