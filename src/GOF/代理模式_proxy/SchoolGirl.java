package GOF.代理模式_proxy;

/**
 *代理模式-实体类
 * 2017年5月23日 上午11:16:39
 *女孩
 */
public class SchoolGirl
{
	private String name;

	public SchoolGirl(String name)
	{
		super();
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}
