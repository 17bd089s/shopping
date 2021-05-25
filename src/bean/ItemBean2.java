package bean;

/**
 * itemテーブルの1レコードを管理するBeanクラス
 * @author tutor
 */
public class ItemBean2 {

	/**
	 * フィールド
	 */
	private String info;  //詳細情報

	public ItemBean2(String info) {
		super();
		this.info = info;
	}

	public ItemBean2() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}
