package GOF.单例模式_Singlleton;

/**
 * 
 * 2017年5月28日 下午10:06:52
 * 
 */
public class Main {

	public static void main(String[] args) {
		Singleton a = Singleton.getInstance();
		Singleton b = Singleton.getInstance();
		System.out.println(a == b);
	}

}
