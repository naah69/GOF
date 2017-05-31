package GOF.策略模式_Strategy;

/**
 * 简单工厂模式-创建对象
 * 2017年5月19日 下午3:18:18
 *
 */
public class CaseSimpleFactory
{
	public static CaseStrategyInterface CaseFactory(int select)
	{
		switch (select)
		{
			case 1:
				return new CaseNormal();
			case 2:
				return new CaseRebate();
			case 3:
				return new CaseReturn();

			default:
				throw new RuntimeException("输入错误！");
		}
	}
}
