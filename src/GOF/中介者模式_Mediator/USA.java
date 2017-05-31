package GOF.中介者模式_Mediator;

/**
 * 中介者模式-同事实现类
 * 2017年5月29日 下午12:52:21
 * 
 */
public class USA extends Country {

	public USA(UnitedNation mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	public void Declare(String message) {
		mediator.Declare(message, this);
	}

	public void getMessage(String message) {
		System.out.println("美国获得对方信息：" + message);
	}

}
