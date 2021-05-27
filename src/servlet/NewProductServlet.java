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
 * Servlet implementation class NewProductServlet
 */
@WebServlet("/NewProductServlet")
public class NewProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String info = request.getParameter("info");
		String strcategory_code = request.getParameter("category_code");
		int category_code = Integer.parseInt(strcategory_code);
		String strprice = request.getParameter("price");
		int price = Integer.parseInt(strprice);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		try {
			ItemDAO dao = new ItemDAO();
			dao.addNewProduct(name, category_code, price, info);

			out.println("<html><head><title>  </title></head><body>");
			out.println("<h1>新規作成完了</h1><br>");
			out.println("<h3><a href=\"/shopping/ShowItemServlet2?action=top\">トップページへ</a></h3><br>");
			out.println("<h3><a href=\"/shopping/menu2.jsp\">登録を続ける</a>|</h3><br>");
			out.println("</body></html>");

		}catch (DAOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
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
