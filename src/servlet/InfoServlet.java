package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ItemBean;

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
		String info1;
		String info2;
		String info3;
		String info4;
		String info5;
		String info6;
		String info7;
		String info8;
		String info9;

		if(action.equals("info1")) {
			info1 = request.getParameter("info1");
			ItemBean bean = new ItemBean();

		}else if(action.equals("info2")) {
			info2 = request.getParameter("info2");
			ItemBean bean2 = new ItemBean();

		}else if(action.equals("info3")) {
			info3 = request.getParameter("info3");
			ItemBean bean2 = new ItemBean();

		}else if(action.equals("info4")) {
			info4 = request.getParameter("info4");
			ItemBean bean = new ItemBean();

		}else if(action.equals("info5")) {
			info5 = request.getParameter("info5");
			ItemBean bean = new ItemBean();

		}else if(action.equals("info6")) {
			info6 = request.getParameter("info6");
			ItemBean bean = new ItemBean();

		}else if(action.equals("info7")) {
			info7 = request.getParameter("info7");
			ItemBean bean = new ItemBean();

		}else if(action.equals("info8")) {
			info8 = request.getParameter("info8");
			ItemBean bean = new ItemBean();

		}else if(action.equals("info9")) {
			info9 = request.getParameter("info9");
			ItemBean bean = new ItemBean();

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
