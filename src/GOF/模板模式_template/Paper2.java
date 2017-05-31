package GOF.模板模式_template;

/**
 * 模板模式-继承类
 * 2017年5月26日 上午11:06:00
 *
 */
public class Paper2 extends Paper
{

	@Override
	protected String answer1()
	{
		return "3";
	}

	@Override
	protected String answer2()
	{
		return "2";
	}

	@Override
	protected String answer3()
	{
		return "1";
	}

}
