package GOF.模板模式_template;

/**
 *
 * 2017年5月26日 上午11:07:07
 *
 */
public class Main
{

	public static void main(String[] args)
	{
		System.out.println("学生1");
		Paper a = new Paper1();
		a.question1();
		a.question2();
		a.question3();
		System.out.println("--------------------------------------");
		System.out.println("学生2");
		Paper b = new Paper2();
		b.question1();
		b.question2();
		b.question3();

	}

}
