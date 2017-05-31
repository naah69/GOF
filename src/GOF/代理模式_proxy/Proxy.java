package GOF.代理模式_proxy;

/**
 *代理模式-代理类
 * 2017年5月23日 上午11:19:40
 *代理类
 */
public class Proxy implements GiveGift
{
	private Pursuit gg;

	public Proxy(SchoolGirl mm)
	{
		super();
		this.gg = new Pursuit(mm);
	}

	@Override
	public void giveGift()
	{
		gg.giveGift();
	}

	@Override
	public void giveFlowers()
	{
		gg.giveFlowers();
	}

	@Override
	public void giveChocolate()
	{
		gg.giveChocolate();
	}

}
