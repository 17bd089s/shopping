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
		int code;

		if(action.equals("info1")) {
			info = request.getParameter("info1");
			String strcode = request.getParameter("1");
			code = Integer.parseInt(strcode);

			ItemBean2 bean2 = new ItemBean2();

		}else if(action.equals("info2")) {
			info = request.getParameter("info2");
			String strcode = request.getParameter("2");
			code = Integer.parseInt(strcode);

			ItemBean2 bean2 = new ItemBean2();
		}else if(action.equals("info3")) {
			info = request.getParameter("info3");
			String strcode = request.getParameter("3");
			code = Integer.parseInt(strcode);

			ItemBean2 bean2 = new ItemBean2();
		}else if(action.equals("info4")) {
			info = request.getParameter("info4");
			String strcode = request.getParameter("4");
			code = Integer.parseInt(strcode);

			ItemBean2 bean2 = new ItemBean2();
		}else if(action.equals("info5")) {
			info = request.getParameter("info5");
			String strcode = request.getParameter("5");
			code = Integer.parseInt(strcode);

			ItemBean2 bean2 = new ItemBean2();
		}else if(action.equals("info6")) {
			info = request.getParameter("info6");
			String strcode = request.getParameter("6");
			code = Integer.parseInt(strcode);

			ItemBean2 bean2 = new ItemBean2();
		}else if(action.equals("info7")) {
			info = request.getParameter("info7");
			String strcode = request.getParameter("7");
			code = Integer.parseInt(strcode);

			ItemBean2 bean2 = new ItemBean2();
		}else if(action.equals("info8")) {
			info = request.getParameter("info8");
			String strcode = request.getParameter("8");
			code = Integer.parseInt(strcode);

			ItemBean2 bean2 = new ItemBean2();
		}else if(action.equals("info9")) {
			info = request.getParameter("info9");
			String strcode = request.getParameter("9");
			code = Integer.parseInt(strcode);

			ItemBean2 bean2 = new ItemBean2();
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
