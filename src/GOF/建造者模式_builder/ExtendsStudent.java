package GOF.建造者模式_builder;

/**
 * 建造者模式-建造者实现类
 * 2017年5月26日 下午12:22:48
 * 学生实现类
 */
class Student1 implements Student
{

	@Override
	public void prepareEx()
	{
		System.out.println("学生1拿来了纸和笔");
	}

	@Override
	public void writeTitle()
	{
		System.out.println("学生1写标题");
	}

	@Override
	public void writeAuthor()
	{
		System.out.println("学生1写作者");
	}

	@Override
	public void writeContent()
	{
		System.out.println("学生1写内容");
	}

}

class Student2 implements Student
{

	@Override
	public void prepareEx()
	{
		System.out.println("学生2拿来了纸和笔");
	}

	@Override
	public void writeTitle()
	{
		System.out.println("学生2写标题");
	}

	@Override
	public void writeAuthor()
	{
		System.out.println("学生2写作者");
	}

	@Override
	public void writeContent()
	{
		System.out.println("学生2写内容");
	}

}
