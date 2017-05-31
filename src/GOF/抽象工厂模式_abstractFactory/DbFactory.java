package GOF.抽象工厂模式_abstractFactory;

/**
 * 抽象工厂模式-工厂实现类
 * 2017年5月26日 下午3:59:13
 * 
 */
class SqlSeverFactory implements IFactory
{

	@Override
	public IUser createUser()
	{
		return new SqlSeverUser();
	}

}

class OracleFactory implements IFactory
{

	@Override
	public IUser createUser()
	{
		return new OracleUser();
	}

}
