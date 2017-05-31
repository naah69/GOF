package GOF.策略模式_Strategy;

/**
 * 策略模式-多态实现类
 * 2017年5月19日 下午3:15:19
 *
 */
public class CaseContext
{
	private CaseStrategyInterface cs;

	public CaseContext(CaseStrategyInterface cs)
	{
		this.cs = cs;
	}

	public double getResult(double money)
	{
		return cs.Operation(money);
	}
}
