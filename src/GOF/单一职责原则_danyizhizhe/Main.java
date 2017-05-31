package GOF.单一职责原则_danyizhizhe;

/**
 *
 * 2017年5月26日 上午11:31:54
 *
 */
public class Main
{

	public static void main(String[] args)
	{
		Animal a = new Animal();
		a.breathe("狗");
		a.breathe("猫");
		a.breathe("羊");
		a.breathe2("鱼");
	}

}
