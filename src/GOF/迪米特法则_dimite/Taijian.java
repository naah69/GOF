package GOF.迪米特法则_dimite;

/**
 * 迪米特法则-第三者类
 * 2017年5月26日 上午11:18:35
 *
 */
public class Taijian extends Stranger
{

	@Override
	public void operation()
	{
		System.out.println("others play");
	}

	public void FindShiWei()
	{
		Stranger shiwei = new ShiWei();
		shiwei.operation();
	}
}
