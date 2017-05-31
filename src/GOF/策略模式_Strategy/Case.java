package GOF.策略模式_Strategy;

/**
 * 策略模式-算法实现
 * 2017年5月19日 下午3:03:19
 *
 */
class CaseNormal implements CaseStrategyInterface
{

	@Override
	public double Operation(double money)
	{
		return money;
	}

}

class CaseRebate implements CaseStrategyInterface
{

	@Override
	public double Operation(double money)
	{
		System.out.print("请输入折扣：");
		double sale = GetScanner.getInput().nextDouble();
		return money * sale;
	}

}

class CaseReturn implements CaseStrategyInterface
{

	@Override
	public double Operation(double money)
	{
		System.out.println("请输入返现标准：");
		System.out.print("满：");
		double over = GetScanner.getInput().nextDouble();
		System.out.print("减：");
		double sale = GetScanner.getInput().nextDouble();
		if (money >= over)
		{
			if (sale > money)
			{
				return 0;
			}
			else
			{
				return money - (money / over) * sale;
			}
		}
		else
		{
			return money;
		}
	}

}