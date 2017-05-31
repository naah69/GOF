package GOF.抽象工厂模式_abstractFactory;

/**
 * 抽象工厂模式-产品实现类
 * 2017年5月26日 下午3:56:49
 * 
 */
class SqlSeverUser implements IUser
{

	@Override
	public void insert(User a)
	{
		System.out.println("SqlSever插入一条User");
	}

	@Override
	public User getUser(int id)
	{
		System.out.println("SqlSever得到User");
		return null;
	}

}

class OracleUser implements IUser
{

	@Override
	public void insert(User a)
	{
		System.out.println("Oracle插入一条User");
	}

	@Override
	public User getUser(int id)
	{
		System.out.println("Oracle得到User");
		return null;
	}

}
