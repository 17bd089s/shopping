package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		String action = request.getParameter("action");
		String strcode = request.getParameter("code");
		int code = Integer.parseInt(strcode);
		String info;
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		// 詳細情報の「編集」が押された際の処理
		if(action.equals("edit")) {
				info = request.getParameter("info");

				out.println("<html><head><title>  </title></head><body>");
				out.println("<h1>登録完了</h1><br>");
				out.println("<h3><a href=\"/shopping/ShowItemServlet2?action=top\">トップページへ</a></h3><br>");
				out.println("<h3><a href=\"/shopping/menu2.jsp\">登録を続ける</a></h3><br>");
				out.println("</body></html>");
				try {
					ItemDAO dao = new ItemDAO();
					dao.addInfo(info,code);

				} catch (DAOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
		// 詳細情報の「削除」が押された場合の処理
		}else if(action.equals("del")) {
				out.println("<html><head>"
						+ "<link rel=\\\"stylesheet\\\" type=\\\"text/css\\\" href=\\\"\"+ context +\"/stylesheet.css\\\" >"
						+ "<title> 削除完了 </title></head><body >");
				out.println("<h1>削除完了</h1><br>");
				out.println("<h3><a href=\"/shopping/ShowItemServlet2?action=top\">トップページへ</a></h3><br>");
				out.println("<h3><a href=\"/shopping/menu2.jsp\">登録を続ける</a></h3><br>");
				out.println("</body></html>");
				try {
					ItemDAO dao = new ItemDAO();
					dao.delInfo(code);


				} catch (DAOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
		// 登録してある商品を削除する際の処理
		}else if(action.equals("productdel")){
			try {
				ItemDAO dao = new ItemDAO();
				dao.delProduct(code);
				out.println("<html><head>"
						+ "<link rel=\\\"stylesheet\\\" type=\\\"text/css\\\" href=\\\"\"+ context +\"/stylesheet.css\\\" >"
						+ "<title> 商品削除完了 </title></head><body>");
				out.println("<h1>商品削除完了</h1><br>");
				out.println("<h3><a href=\"/shopping/ShowItemServlet2?action=top\">トップページへ</a></h3><br>");
				out.println("<h3><a href=\"/shopping/menu2.jsp\">登録を続ける</a></h3><br>");
				out.println("</body></html>");

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
