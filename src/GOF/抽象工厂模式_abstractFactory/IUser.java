package GOF.抽象工厂模式_abstractFactory;

/**
 * 抽象工厂模式-产品接口或抽象产品类
 * 2017年5月26日 下午3:55:56
 * 
 */
public interface IUser
{
	void insert(User a);

	User getUser(int id);
}
