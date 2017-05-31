package GOF.单例模式_Singlleton;

/**
 * 单例模式-饿汉式
 * 2017年5月28日 下午10:00:47
 * 
 */
public class Singleton {
	private static Singleton instance = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return instance;
	}

}
