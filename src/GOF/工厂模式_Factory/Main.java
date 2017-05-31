package GOF.工厂模式_Factory;

/**
 *
 * 2017年5月24日 上午11:04:13
 *
 */
public class Main
{

	public static void main(String[] args)
	{
		Factory f = new StudentFactory();
		LeiFeng leifeng = f.createLeifeng();
		leifeng.clean();
		leifeng.buy();
		leifeng.wash();
	}

}
