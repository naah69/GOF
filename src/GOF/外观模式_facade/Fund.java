package GOF.外观模式_facade;

/**
 * 外观模式-外观类
 * 2017年5月26日 上午11:44:37
 *
 */
public class Fund
{
	Stock1 a;
	Stock2 b;
	Stock3 c;

	public Fund()
	{
		a = new Stock1();
		b = new Stock2();
		c = new Stock3();
	}

	public void BuyFund()
	{
		a.Buy();
		b.Buy();
		c.Buy();
	}

	public void SellFund()
	{
		a.Sell();
		b.Sell();
		c.Sell();
	}

}
