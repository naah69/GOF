package GOF.代理模式_proxy;

/**
 *
 * 2017年5月23日 上午11:21:13
 *
 */
public class Main
{
	public static void main(String[] args)
	{
		SchoolGirl mm = new SchoolGirl("女孩");
		Proxy daili = new Proxy(mm);
		daili.giveGift();
		daili.giveFlowers();
		daili.giveChocolate();
	}
}
