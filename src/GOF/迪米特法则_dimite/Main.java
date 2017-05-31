package GOF.迪米特法则_dimite;

/**
 *
 * 2017年5月26日 上午11:26:00
 *
 */
public class Main
{

	public static void main(String[] args)
	{
		HuangDi huangdi = new HuangDi(new Taijian());
		huangdi.getA().FindShiWei();
	}

}
