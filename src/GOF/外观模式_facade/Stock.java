package GOF.外观模式_facade;

/**
 * 外观模式-系统类
 * 2017年5月26日 上午11:42:10
 * 股票类
 */
class Stock1
{
	public void Sell()
	{
		System.out.println("卖出股票1");
	}

	public void Buy()
	{
		System.out.println("购入股票1");
	}
}

class Stock2
{
	public void Sell()
	{
		System.out.println("卖出股票2");
	}

	public void Buy()
	{
		System.out.println("购入股票2");
	}
}

class Stock3
{
	public void Sell()
	{
		System.out.println("卖出股票3");
	}

	public void Buy()
	{
		System.out.println("购入股票3");
	}
}
