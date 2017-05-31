package GOF.装饰模式_decorate;

/**
 *装饰模式-继承类
 * 2017年5月23日 上午10:47:59
 *
 */
class ManDecoratorA extends Decorator
{

	public void eat()
	{
		super.eat();
		reEat();
		System.out.println("ManDecoratorA类");
	}

	public void reEat()
	{
		System.out.println("再吃一顿饭");
	}
}

class ManDecoratorB extends Decorator
{

	public void eat()
	{
		super.eat();
		System.out.println("ManDecoratorB类");
	}
}