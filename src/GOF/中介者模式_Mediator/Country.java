package GOF.中介者模式_Mediator;

/**
 * 中介者模式-同事接口或抽象类
 * 2017年5月29日 下午12:51:33
 * 
 */
public abstract class Country {
	protected UnitedNation mediator;

	public Country(UnitedNation mediator) {
		super();
		this.mediator = mediator;
	}

}
