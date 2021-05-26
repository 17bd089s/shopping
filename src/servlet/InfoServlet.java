package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ItemBean2;
import dao.DAOException;
import dao.ItemDAO;

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
		String strcode = request.getParameter("code");
		int code = Integer.parseInt(strcode);
		String info;

		if(code == 1) {
			info = request.getParameter("info1");

			ItemBean2 bean2 = new ItemBean2(info,code);

			try {
				ItemDAO dao = new ItemDAO();
				dao.addInfo(info, code);

			} catch (DAOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}else if(code == 2) {
			info = request.getParameter("info2");

			ItemBean2 bean2 = new ItemBean2(info,code);

			try {
				ItemDAO dao = new ItemDAO();
				dao.addInfo(info, code);

			} catch (DAOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}


		}else if(code == 3) {
			info = request.getParameter("info3");

			ItemBean2 bean2 = new ItemBean2(info,code);

			try {
				ItemDAO dao = new ItemDAO();
				dao.addInfo(info, code);

			} catch (DAOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}else if(code == 4) {
			info = request.getParameter("info4");

			ItemBean2 bean2 = new ItemBean2(info,code);

			try {
				ItemDAO dao = new ItemDAO();
				dao.addInfo(info, code);

			} catch (DAOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}

		}else if(code == 5) {
			info = request.getParameter("info5");

			ItemBean2 bean2 = new ItemBean2(info,code);

			try {
				ItemDAO dao = new ItemDAO();
				dao.addInfo(info, code);

			} catch (DAOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}

		}else if(code == 6) {
			info = request.getParameter("info6");

			ItemBean2 bean2 = new ItemBean2(info,code);
			try {
				ItemDAO dao = new ItemDAO();
				dao.addInfo(info, code);

			} catch (DAOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}

		}else if(code == 7) {
			info = request.getParameter("info7");

			ItemBean2 bean2 = new ItemBean2(info,code);
			try {
				ItemDAO dao = new ItemDAO();
				dao.addInfo(info, code);

			} catch (DAOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}else if(code == 8) {
			info = request.getParameter("info8");

			ItemBean2 bean2 = new ItemBean2(info,code);
			try {
				ItemDAO dao = new ItemDAO();
				dao.addInfo(info, code);

			} catch (DAOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}else if(code == 9) {
			info = request.getParameter("info9");

			ItemBean2 bean2 = new ItemBean2(info,code);
			try {
				ItemDAO dao = new ItemDAO();
				dao.addInfo(info, code);

			} catch (DAOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
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
