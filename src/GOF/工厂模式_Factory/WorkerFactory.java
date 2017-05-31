package GOF.工厂模式_Factory;

/**
 *工厂模式-工厂实现类
 * 2017年5月24日 上午11:03:12
 *工人工厂
 */
public class WorkerFactory implements Factory
{

	@Override
	public LeiFeng createLeifeng()
	{
		return new worker();
	}

}
