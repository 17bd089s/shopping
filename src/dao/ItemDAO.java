package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.CategoryBean;
import bean.ItemBean;
import bean.ItemBean2;
/**
 * 商品関連のテーブルにアクセスするDAOクラス
 * @author tutor
 */
public class ItemDAO {

	/**
	 * フィールド
	 */
	private Connection con;

	/**
	 * コンストラクタ
	 * @throws DAOException
	 */
	public ItemDAO() throws DAOException {
		this.getConnection();
	}

	private void getConnection() throws DAOException {
		// データベース接続情報の設定
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql:sample";
		String user = "student";
		String password = "himitu";

		try {
			// JDBCドライバの登録
			Class.forName(driver);
			// データベースに接続
			this.con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new DAOException("データベースの接続に失敗しました。");
		}


	}

	/**
	 * 商品分類リストを取得する。
	 * @return List<CategoryBean> 商品分類リスト
	 * @throws DAOException
	 */
	public List<CategoryBean> findByAllCategory() throws DAOException {
		// データベース接続関連オブジェクトの初期化
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String sql = "select * from category";
			pstmt = this.con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			List<CategoryBean> list = new ArrayList<CategoryBean>();
			while (rs.next()) {
				int code = rs.getInt("code");
				String name = rs.getString("name");
				CategoryBean bean = new CategoryBean(code, name);
				list.add(bean);
			}

			// 商品分類リストを返却
			return list;

		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			throw new DAOException("レコードの取得に失敗しました。");
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				this.close();
			} catch (Exception e) {
				throw new DAOException("リソースの解放に失敗しました。");
			}
		}
	}

	/**
	 * データベース接続を切断する：データベース接続オブジェクトを解放する。
	 * @throws SQLException
	 */
	private void close() throws SQLException {
		if (this.con != null) {
			this.con.close();
			this.con = null;
		}
	}

	/**
	 * 指定された商品分類の商品を取得する。
	 * @param categoryCode 商品分類番号
	 * @return 商品番号に合致した商品の商品リスト（合致した商品がない場合は0件の商品リストとなる）
	 * @throws DAOException
	 */
	public List<ItemBean> findByCategory(int categoryCode) throws DAOException {
		// データベース接続関連オブジェクトの初期化
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String sql = "select * from item where category_code = ? order by code";
			pstmt = this.con.prepareStatement(sql);
			// プレースホルダを設定
			pstmt.setInt(1, categoryCode);
			// SQLの実行と結果セットの取得
			rs = pstmt.executeQuery();
			// 結果セットから商品リストを取得
			List<ItemBean> list = new ArrayList<ItemBean>();
			while (rs.next()) {
				int code = rs.getInt("code");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				String info = rs.getString("info");
				// info
				ItemBean bean = new ItemBean(code, name, price, info);
				list.add(bean);
			}

			// 商品リストを返却
			return list;

		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("レコードの取得に失敗しました。");
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				this.close();
			} catch (Exception e) {
				throw new DAOException("リソースの解放に失敗しました。");
			}
		}


	}

	/**
	 * 指定された主キー（商品番号）に合致する商品を取得する。
	 * @param code 取得対象の商品の商品番号
	 * @return 商品番号に合致した商品があればItemBeanのインスタンス、それ以外はnull
	 * @throws DAOException
	 */
	public ItemBean findByPrimariKey(int code) throws DAOException {
		// データベース接続関連オブジェクトの初期化
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String sql = "select * from item where code = ?";
			pstmt = this.con.prepareStatement(sql);
			// プレースホルダを設定
			pstmt.setInt(1, code);
			// SQLの実行と結果セットの取得
			rs = pstmt.executeQuery();
			// 結果セットから商品を取得
			ItemBean bean = null;
			if (rs.next()) {
				String name = rs.getString("name");
				int price = rs.getInt("price");
				bean = new ItemBean(code, name, price);
			}

			// 商品を返却
			return bean;

		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("レコードの取得に失敗しました。");
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				this.close();
			} catch (Exception e) {
				throw new DAOException("リソースの解放に失敗しました。");
			}
		}
	}
	// 詳細情報（info）をデータベースに追加する
	public void addInfo(String info, int code) throws DAOException{
			ItemBean2 bean2 = new ItemBean2();
			if (con == null)
			getConnection();
			PreparedStatement pstmt = null;
		try {
			String sql ="update item set info = ? where code = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, info);
			pstmt.setInt(2, code);
			pstmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("レコードの取得に失敗しました。");
		} finally {
			try {

				if (pstmt != null) pstmt.close();
				this.close();
			} catch (Exception e) {
				throw new DAOException("リソースの解放に失敗しました。");
			  }

		  }
	}

	// info(詳細情報)をデータベースから削除する
	public void delInfo(int code) throws DAOException{
		ItemBean2 bean2 = new ItemBean2();

		if (con == null)
		getConnection();
		PreparedStatement pstmt = null;
		try {
			String sql ="update item set info = '' where code = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, code);
			pstmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("レコードの取得に失敗しました。");
		} finally {
			try {

				if (pstmt != null) pstmt.close();
				this.close();
			} catch (Exception e) {
				throw new DAOException("リソースの解放に失敗しました。");
			}

		}
	}
	// 新しい商品をデータベースに追加する
	public void addNewProduct(String name, int category_code, int price, String info) throws DAOException{
		ItemBean2 bean2 = new ItemBean2();
		if (con == null)
		getConnection();
		PreparedStatement pstmt = null;
		try {
			String sql ="insert into item(category_code,name,price,info) values(?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, category_code);
			pstmt.setString(2, name);
			pstmt.setInt(3, price);
			pstmt.setString(4, info);
			pstmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("レコードの取得に失敗しました。");
		} finally {
			try {

				if (pstmt != null) pstmt.close();
				this.close();
			} catch (Exception e) {
				throw new DAOException("リソースの解放に失敗しました。");
			  }

		  }
	}
	// 登録してある商品自体をデータベースから削除する
	public void delProduct(int code) throws DAOException{
		
		if (con == null)
		getConnection();
		PreparedStatement pstmt = null;
		try {
			String sql ="delete from item where code = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, code);
			pstmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("レコードの取得に失敗しました。");
		} finally {
			try {

				if (pstmt != null) pstmt.close();
				this.close();
			} catch (Exception e) {
				throw new DAOException("リソースの解放に失敗しました。");
			  }

		  }
}



}
