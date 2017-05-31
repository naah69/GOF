package GOF.装饰模式_decorate;

/**
 *装饰模式-实现类
 * 2017年5月23日 上午10:47:20
 *
 */
public class Decorator implements Person
{

	protected Person person;

	public void setPerson(Person person)
	{
		this.person = person;
	}

	public void eat()
	{
		person.eat();
	}
}
