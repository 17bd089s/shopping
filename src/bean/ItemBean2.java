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
	private int code;
	public ItemBean2() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public ItemBean2(String info, int code) {
		super();
		this.info = info;
		this.code = code;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}


}
