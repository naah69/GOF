package GOF.观察者模式_Observer_watcher;

/**
 * 观察者模式-通知者接口
 * 2017年5月26日 下午1:18:12
 *
 */
public interface Subject
{
	void attach(Observer observer);

	void detach(Observer observer);

	void Notify();

	String getAction();

	void setAction(String action);
}
