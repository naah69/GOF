package GOF.迪米特法则_dimite;

/**
 * 迪米特法则-拥有者类
 * 2017年5月26日 上午11:24:13
 *
 */
public class HuangDi extends Stranger
{
	private Taijian a;

	public HuangDi(Taijian a)
	{
		super();
		this.a = a;
	}

	public Taijian getA()
	{
		return a;
	}

	public void setA(Taijian a)
	{
		this.a = a;
	}

	@Override
	public void operation()
	{
		System.out.println("someon play");
	}

}
