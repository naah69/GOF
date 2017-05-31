package GOF.装饰模式_decorate;

/**
 *
 * 2017年5月23日 上午10:49:19
 *
 */
public class Main
{

	public static void main(String[] args)
	{
		Man man = new Man();
		ManDecoratorA md1 = new ManDecoratorA();
		ManDecoratorB md2 = new ManDecoratorB();

		md1.setPerson(man);
		md2.setPerson(md1);
		md2.eat();
	}

}
