package GOF.代理模式_proxy;

/**
 *代理模式-实现类
 * 2017年5月23日 上午11:15:36
 *追求者
 */
public class Pursuit implements GiveGift
{
	private SchoolGirl ss;

	public Pursuit(SchoolGirl ss)
	{
		this.ss = ss;
	}

	@Override
	public void giveGift()
	{
		System.out.println(ss.getName() + "送你礼物！");
	}

	@Override
	public void giveFlowers()
	{
		System.out.println(ss.getName() + "送你鲜花！");
	}

	@Override
	public void giveChocolate()
	{
		System.out.println(ss.getName() + "送你巧克力！");
	}

}
