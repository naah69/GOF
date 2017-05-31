package GOF.观察者模式_Observer_watcher;

/**
 * 
 * 2017年5月26日 下午2:16:05
 * 
 */
public class Main
{

	public static void main(String[] args)
	{
		Boss hhs = new Boss();
		StockObserver a1 = new StockObserver("甲", hhs);
		NBAObserver a2 = new NBAObserver("乙", hhs);
		hhs.attach(a1);
		hhs.attach(a2);
		hhs.detach(a2);
		hhs.setAction("我胡汉三有回来了！");
		hhs.Notify();
	}

}
