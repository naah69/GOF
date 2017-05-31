package GOF.观察者模式_Observer_watcher;

/**
 * 观察者模式-观察者接口
 * 2017年5月26日 下午2:07:15
 * 
 */
public abstract class Observer
{
	protected String name;
	protected Subject sub;

	public Observer(String name,Subject sub)
	{
		super();
		this.name = name;
		this.sub = sub;
	}

	public abstract void update();
}
