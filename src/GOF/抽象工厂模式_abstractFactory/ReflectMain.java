package GOF.抽象工厂模式_abstractFactory;


/**
 * 
 * 2017年5月26日 下午4:21:48
 * 
 */
public class ReflectMain
{

	public static void main(String[] args)
	{
		User user = new User();
		IUser iu = DataAccess.CreateUser();
		iu.insert(user);
		iu.getUser(1);
	}

}
