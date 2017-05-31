package GOF.抽象工厂模式_abstractFactory;

/**
 * 抽象工厂模式-反射
 * 2017年5月26日 下午4:15:13
 * 
 */
public class DataAccess
{
	public static IUser CreateUser()
	{
		IUser result = null;
		try
		{
			Class c1 = Class.forName("GOF.a16_abstractFactory.SqlSeverUser");
			Object o = c1.newInstance();
			result = (IUser) o;
		}
		catch (InstantiationException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
