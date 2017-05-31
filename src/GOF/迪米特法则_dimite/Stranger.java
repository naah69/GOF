package GOF.迪米特法则_dimite;

/**
 * 模板模式-陌生人类
 * 2017年5月26日 上午11:19:52
 *
 */
abstract class Stranger
{
	public abstract void operation();
}

/**
 * 模板模式-侍卫类
 * 2017年5月26日 上午11:19:52
 *
 */
class ShiWei extends Stranger
{
	@Override
	public void operation()
	{
		System.out.println("参见皇上，我是御前侍卫，我武功很好！");
	}
}