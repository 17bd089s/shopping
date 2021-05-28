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
		response.setContentType("text/html;charset=utf-8");

		PrintWriter out = response.getWriter();
		// パラメータの取得
		String name = request.getParameter("name");
		String info = request.getParameter("info");
		String strcategory_code = request.getParameter("category_code");
		int category_code = Integer.parseInt(strcategory_code);
		String strprice = request.getParameter("price");

		// 必要な情報が登録されているかどうかのチェック
		if(name == null||name.length() == 0 ||strprice == null || strprice.length() == 0) {
			showNotEnterdError(out);
			return;
		}else {
		// 「登録する」ボタンが押された際の処理
		try {
			int price = Integer.parseInt(strprice);
			ItemDAO dao = new ItemDAO();
			dao.addNewProduct(name, category_code, price, info);

			out.println("<html><head><title>  </title></head><body>");
			out.println("<h1>新規作成完了</h1><br>");
			out.println("<h3><a href=\"/shopping/ShowItemServlet2?action=top\">トップページへ</a></h3><br>");
			out.println("<h3><a href=\"/shopping/menu2.jsp\">登録を続ける</a>|</h3><br>");
			out.println("</body></html>");
		// 価格が整数で入力されているかどうかのチェック
		}catch (DAOException | NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			showNotIntegerError(out);
			return;
		}
		}
	}
	// 商品名か価格が未入力だった際の処理
	private void showNotEnterdError(PrintWriter out) {
		out.println("<html><head><title>  </title></head><body>");
		out.println("<h1>商品名と価格を入力してください</h1><br>");
		out.println("<h3><a href=\"/shopping/newproduct.jsp\">戻る</a>|</h3><br>");
		out.println("</body></html>");


	}
	// 価格に整数以外が入力されていた際の処理
	private void showNotIntegerError(PrintWriter out) {
		// TODO 自動生成されたメソッド・スタブ
		out.println("<html><head><title>  </title></head><body>");
		out.println("<h1>整数を入力してください</h1><br>");
		out.println("<h3><a href=\"/shopping/newproduct.jsp\">戻る</a>|</h3><br>");
		out.println("</body></html>");

	}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
