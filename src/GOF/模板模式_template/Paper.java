package GOF.模板模式_template;

/**
 * 模板模式-原型类
 * 2017年5月26日 上午11:01:36
 *
 */
public class Paper
{
	public void question1()
	{
		System.out.println("1+1=?");
		System.out.println("答案：" + answer1());
	}

	public void question2()
	{
		System.out.println("1*1=?");
		System.out.println("答案：" + answer2());
	}

	public void question3()
	{
		System.out.println("1/1=?");
		System.out.println("答案：" + answer3());
	}

	protected String answer1()
	{
		return "";
	}

	protected String answer2()
	{
		return "";
	}

	protected String answer3()
	{
		return "";
	}

}
