package GOF.依赖倒转原则_yilaidaozhuan;

/**
 *依赖倒转原则-实现类
 * 2017年5月23日 上午9:46:08
 *
 */
class Newspaper implements IReader
{
	public String getContent()
	{
		return "林书豪17+9助尼克斯击败老鹰……";
	}
}

class Book implements IReader
{
	public String getContent()
	{
		return "很久很久以前有一个阿拉伯的故事……";
	}
}