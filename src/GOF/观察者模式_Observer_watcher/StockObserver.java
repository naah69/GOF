package GOF.观察者模式_Observer_watcher;

/**
 * 观察者模式-观察者实现类
 * 2017年5月26日 下午2:14:44
 * 
 */
class StockObserver extends Observer
{

	public StockObserver(String name,Subject sub)
	{
		super(name, sub);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update()
	{
		System.out.println(sub.getAction() + super.name + "关闭了股票,继续工作");
	}

}

class NBAObserver extends Observer
{

	public NBAObserver(String name,Subject sub)
	{
		super(name, sub);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update()
	{
		System.out.println(sub.getAction() + super.name + "关闭了NBA,继续工作");
	}

}
