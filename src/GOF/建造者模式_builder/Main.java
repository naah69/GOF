package GOF.建造者模式_builder;

/**
 *
 * 2017年5月26日 下午1:00:48
 *
 */
public class Main
{

	public static void main(String[] args)
	{
		Student a = new Student1();
		Student b = new Student2();

		Teacher t = new Teacher(a);

		t.zhiHui();

		System.out.println("---------------------------------------");
		t.setA(b);

		t.zhiHui();
	}

}
