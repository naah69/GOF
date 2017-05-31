package GOF.单一职责原则_danyizhizhe;

/**
 * 单一职责
 * 2017年5月26日 上午11:29:47
 *
 */
public class Animal
{
	public void breathe(String animal)
	{
		System.out.println(animal + "在空气中呼吸");
	}

	public void breathe2(String animal)
	{
		System.out.println(animal + "在水中呼吸");
	}
}
