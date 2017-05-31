package GOF.依赖倒转原则_yilaidaozhuan;

/**
 *
 * 2017年5月23日 上午9:47:23
 *
 */
public class Main
{

	public static void main(String[] args)
	{
		Mother mother = new Mother();
		mother.narrate(new Book());
		mother.narrate(new Newspaper());
	}

}
