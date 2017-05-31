package GOF.抽象工厂模式_abstractFactory;

/**
 * 
 * 2017年5月26日 下午4:02:24
 * 
 */
public class Main
{

	public static void main(String[] args)
	{
		User user = new User();
		IFactory factory = new SqlSeverFactory();
		IUser iu = factory.createUser();
		iu.insert(user);
		iu.getUser(1);
	}
}
