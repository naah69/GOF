package GOF.观察者模式_Observer_watcher;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式-通知者实现类
 * 2017年5月26日 下午2:10:21
 * 
 */
public class Boss implements Subject
{
	private List<Observer> observers = new ArrayList<Observer>();
	private String action;

	@Override
	public void attach(Observer observer)
	{
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer)
	{
		observers.remove(observer);
	}

	@Override
	public void Notify()
	{
		for (Observer o : observers)
		{
			o.update();
		}
	}

	public String getAction()
	{
		return action;
	}

	public void setAction(String action)
	{
		this.action = action;
	}

}
