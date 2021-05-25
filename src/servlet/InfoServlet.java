package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ItemBean2;

/**
 * Servlet implementation class InfoServlet
 */
@WebServlet("/InfoServlet")
public class InfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String action = request.getParameter("action");
		String info;

		if(action.equals("info1")) {
			info = request.getParameter("info1");
			ItemBean2 bean = new ItemBean2(info);

		}else if(action.equals("info2")) {
			info = request.getParameter("info2");
			ItemBean2 bean = new ItemBean2(info);

		}else if(action.equals("info3")) {
			info = request.getParameter("info3");
			ItemBean2 bean = new ItemBean2(info);

		}else if(action.equals("info4")) {
			info = request.getParameter("info4");
			ItemBean2 bean = new ItemBean2(info);

		}else if(action.equals("info5")) {
			info = request.getParameter("info5");
			ItemBean2 bean = new ItemBean2(info);

		}else if(action.equals("info6")) {
			info = request.getParameter("info6");
			ItemBean2 bean = new ItemBean2(info);

		}else if(action.equals("info7")) {
			info = request.getParameter("info7");
			ItemBean2 bean = new ItemBean2(info);

		}else if(action.equals("info8")) {
			info = request.getParameter("info8");
			ItemBean2 bean = new ItemBean2(info);

		}else if(action.equals("info9")) {
			info = request.getParameter("info9");
			ItemBean2 bean = new ItemBean2(info);

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
