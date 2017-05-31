package GOF.桥接模式_CARP_Bridge;

/**
 * 
 * 2017年5月29日 上午9:51:02
 * 
 */
public class Main {

	public static void main(String[] args) {
		HandsetBrand ab;
		ab = new HandsetBrandN();
		ab.setSoft(new HandsetGame());
		ab.Run();

		ab.setSoft(new HandsetAddressList());
		ab.Run();

		ab = new HandsetBrandM();
		ab.setSoft(new HandsetGame());
		ab.Run();

		ab.setSoft(new HandsetAddressList());
		ab.Run();

	}

}
