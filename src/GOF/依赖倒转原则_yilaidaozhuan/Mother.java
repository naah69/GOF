package GOF.依赖倒转原则_yilaidaozhuan;

/**
 *
 * 2017年5月23日 上午9:47:03
 *
 */
public class Mother
{
	public void narrate(IReader reader)
	{
		System.out.println("妈妈开始讲故事");
		System.out.println(reader.getContent());
	}
}
