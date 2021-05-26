package servlet;

import java.io.IOException;
import java.io.PrintWriter;

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
		String name = request.getParameter("name");
		String strcode = request.getParameter("code");
		int code = Integer.parseInt(strcode);
		String info;
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		if(name.equals("edit")) {

			if(code == 1) {
				info = request.getParameter("info");

				ItemBean2 bean2 = new ItemBean2(info,code);
				out.println("<html><head><title>  </title></head><body>");
				out.println("<h1>削除完了</h1><br>");
				out.println("<h3><a href=\"/shopping/ShowItemServlet2?action=top\">トップページへ</a></h3><br>");
				out.println("<h3><a href=\"/shopping/menu2.jsp\">登録を続ける</a>|</h3><br>");
				out.println("</body></html>");
				try {
					ItemDAO dao = new ItemDAO();
					dao.addInfo(info,code);

				} catch (DAOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}else if(code == 2) {
				info = request.getParameter("info");

				ItemBean2 bean2 = new ItemBean2(info,code);
				out.println("<html><head><title>  </title></head><body>");
				out.println("<h1>削除完了</h1><br>");
				out.println("<h3><a href=\"/shopping/ShowItemServlet2?action=top\">トップページへ</a></h3><br>");
				out.println("<h3><a href=\"/shopping/menu2.jsp\">登録を続ける</a>|</h3><br>");
				out.println("</body></html>");
				try {
					ItemDAO dao = new ItemDAO();
					dao.addInfo(info,code);

				} catch (DAOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}


			}else if(code == 3) {
				info = request.getParameter("info");

				ItemBean2 bean2 = new ItemBean2(info,code);
				out.println("<html><head><title>  </title></head><body>");
				out.println("<h1>削除完了</h1><br>");
				out.println("<h3><a href=\"/shopping/ShowItemServlet2?action=top\">トップページへ</a></h3><br>");
				out.println("<h3><a href=\"/shopping/menu2.jsp\">登録を続ける</a>|</h3><br>");
				out.println("</body></html>");
				try {
					ItemDAO dao = new ItemDAO();
					dao.addInfo(info,code);

				} catch (DAOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}else if(code == 4) {
				info = request.getParameter("info");

				ItemBean2 bean2 = new ItemBean2(info,code);
				out.println("<html><head><title>  </title></head><body>");
				out.println("<h1>削除完了</h1><br>");
				out.println("<h3><a href=\"/shopping/ShowItemServlet2?action=top\">トップページへ</a></h3><br>");
				out.println("<h3><a href=\"/shopping/menu2.jsp\">登録を続ける</a>|</h3><br>");
				out.println("</body></html>");
				try {
					ItemDAO dao = new ItemDAO();
					dao.addInfo(info,code);

				} catch (DAOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}

			}else if(code == 5) {
				info = request.getParameter("info");

				ItemBean2 bean2 = new ItemBean2(info,code);
				out.println("<html><head><title>  </title></head><body>");
				out.println("<h1>削除完了</h1><br>");
				out.println("<h3><a href=\"/shopping/ShowItemServlet2?action=top\">トップページへ</a></h3><br>");
				out.println("<h3><a href=\"/shopping/menu2.jsp\">登録を続ける</a>|</h3><br>");
				out.println("</body></html>");
				try {
					ItemDAO dao = new ItemDAO();
					dao.addInfo(info,code);

				} catch (DAOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}

			}else if(code == 6) {
				info = request.getParameter("info");

				ItemBean2 bean2 = new ItemBean2(info,code);
				out.println("<html><head><title>  </title></head><body>");
				out.println("<h1>削除完了</h1><br>");
				out.println("<h3><a href=\"/shopping/ShowItemServlet2?action=top\">トップページへ</a></h3><br>");
				out.println("<h3><a href=\"/shopping/menu2.jsp\">登録を続ける</a>|</h3><br>");
				out.println("</body></html>");
				try {
					ItemDAO dao = new ItemDAO();
					dao.addInfo(info,code);

				} catch (DAOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}

			}else if(code == 7) {
				info = request.getParameter("info");

				ItemBean2 bean2 = new ItemBean2(info,code);
				out.println("<html><head><title>  </title></head><body>");
				out.println("<h1>削除完了</h1><br>");
				out.println("<h3><a href=\"/shopping/ShowItemServlet2?action=top\">トップページへ</a></h3><br>");
				out.println("<h3><a href=\"/shopping/menu2.jsp\">登録を続ける</a>|</h3><br>");
				out.println("</body></html>");
				try {
					ItemDAO dao = new ItemDAO();
					dao.addInfo(info,code);

				} catch (DAOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}else if(code == 8) {
				info = request.getParameter("info");

				ItemBean2 bean2 = new ItemBean2(info,code);
				out.println("<html><head><title>  </title></head><body>");
				out.println("<h1>削除完了</h1><br>");
				out.println("<h3><a href=\"/shopping/ShowItemServlet2?action=top\">トップページへ</a></h3><br>");
				out.println("<h3><a href=\"/shopping/menu2.jsp\">登録を続ける</a>|</h3><br>");
				out.println("</body></html>");
				try {
					ItemDAO dao = new ItemDAO();
					dao.addInfo(info,code);

				} catch (DAOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}else if(code == 9) {
				info = request.getParameter("info");

				ItemBean2 bean2 = new ItemBean2(info,code);
				out.println("<html><head><title>  </title></head><body>");
				out.println("<h1>削除完了</h1><br>");
				out.println("<h3><a href=\"/shopping/ShowItemServlet2?action=top\">トップページへ</a></h3><br>");
				out.println("<h3><a href=\"/shopping/menu2.jsp\">登録を続ける</a>|</h3><br>");
				out.println("</body></html>");
				try {
					ItemDAO dao = new ItemDAO();
					dao.addInfo(info,code);

				} catch (DAOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}
		}else if(name.equals("delete")) {
			if(code == 1) {
				out.println("<html><head><title>  </title></head><body>");
				out.println("<h1>削除完了</h1><br>");
				out.println("<h3><a href=\"/shopping/ShowItemServlet2?action=top\">トップページへ</a></h3><br>");
				out.println("<h3><a href=\"/shopping/menu2.jsp\">登録を続ける</a>|</h3><br>");
				out.println("</body></html>");
				try {
					ItemDAO dao = new ItemDAO();
					dao.delInfo(code);

				} catch (DAOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}else if(code == 2) {
				out.println("<html><head><title>  </title></head><body>");
				out.println("<h1>削除完了</h1><br>");
				out.println("<h3><a href=\"/shopping/ShowItemServlet2?action=top\">トップページへ</a></h3><br>");
				out.println("<h3><a href=\"/shopping/menu2.jsp\">登録を続ける</a>|</h3><br>");
				out.println("</body></html>");
				try {
					ItemDAO dao = new ItemDAO();
					dao.delInfo(code);

				} catch (DAOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}


			}else if(code == 3) {
				out.println("<html><head><title>  </title></head><body>");
				out.println("<h1>削除完了</h1><br>");
				out.println("<h3><a href=\"/shopping/ShowItemServlet2?action=top\">トップページへ</a></h3><br>");
				out.println("<h3><a href=\"/shopping/menu2.jsp\">登録を続ける</a>|</h3><br>");
				out.println("</body></html>");
				try {
					ItemDAO dao = new ItemDAO();
					dao.delInfo(code);

				} catch (DAOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}else if(code == 4) {
				out.println("<html><head><title>  </title></head><body>");
				out.println("<h1>削除完了</h1><br>");
				out.println("<h3><a href=\"/shopping/ShowItemServlet2?action=top\">トップページへ</a></h3><br>");
				out.println("<h3><a href=\"/shopping/menu2.jsp\">登録を続ける</a>|</h3><br>");
				out.println("</body></html>");
				try {
					ItemDAO dao = new ItemDAO();
					dao.delInfo(code);

				} catch (DAOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}

			}else if(code == 5) {
				out.println("<html><head><title>  </title></head><body>");
				out.println("<h1>削除完了</h1><br>");
				out.println("<h3><a href=\"/shopping/ShowItemServlet2?action=top\">トップページへ</a></h3><br>");
				out.println("<h3><a href=\"/shopping/menu2.jsp\">登録を続ける</a>|</h3><br>");
				out.println("</body></html>");
				try {
					ItemDAO dao = new ItemDAO();
					dao.delInfo(code);

				} catch (DAOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}

			}else if(code == 6) {
				out.println("<html><head><title>  </title></head><body>");
				out.println("<h1>削除完了</h1><br>");
				out.println("<h3><a href=\"/shopping/ShowItemServlet2?action=top\">トップページへ</a></h3><br>");
				out.println("<h3><a href=\"/shopping/menu2.jsp\">登録を続ける</a>|</h3><br>");
				out.println("</body></html>");
				try {
					ItemDAO dao = new ItemDAO();
					dao.delInfo(code);

				} catch (DAOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}

			}else if(code == 7) {
				out.println("<html><head><title>  </title></head><body>");
				out.println("<h1>削除完了</h1><br>");
				out.println("<h3><a href=\"/shopping/ShowItemServlet2?action=top\">トップページへ</a></h3><br>");
				out.println("<h3><a href=\"/shopping/menu2.jsp\">登録を続ける</a>|</h3><br>");
				out.println("</body></html>");
				try {
					ItemDAO dao = new ItemDAO();
					dao.delInfo(code);

				} catch (DAOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}else if(code == 8) {
				out.println("<html><head><title>  </title></head><body>");
				out.println("<h1>削除完了</h1><br>");
				out.println("<h3><a href=\"/shopping/ShowItemServlet2?action=top\">トップページへ</a></h3><br>");
				out.println("<h3><a href=\"/shopping/menu2.jsp\">登録を続ける</a>|</h3><br>");
				out.println("</body></html>");
				try {
					ItemDAO dao = new ItemDAO();
					dao.delInfo(code);

				} catch (DAOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}else if(code == 9) {
				out.println("<html><head><title>  </title></head><body>");
				out.println("<h1>削除完了</h1><br>");
				out.println("<h3><a href=\"/shopping/ShowItemServlet2?action=top\">トップページへ</a></h3><br>");
				out.println("<h3><a href=\"/shopping/menu2.jsp\">登録を続ける</a>|</h3><br>");
				out.println("</body></html>");
				try {
					ItemDAO dao = new ItemDAO();
					dao.delInfo(code);

				} catch (DAOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
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
