package GOF.适配器模式_Adapter;

/**
 * 
 * 2017年5月28日 下午5:18:59
 * 
 */
public class Main {
	public static void main(String[] args) {
		Player a = new Forwards("巴蒂尔");
		a.Attack();
		Player b = new Guard("麦克格雷迪");
		b.Attack();
		Player ym = new Translator("姚明");
		ym.Attack();
		ym.Defense();
	}
}
