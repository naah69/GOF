package GOF.中介者模式_Mediator;

/**
 * 中介者模式-中介实现类
 * 2017年5月29日 下午12:55:52
 * 
 */
public class UnitedNationsSecurityCouncil extends UnitedNation {
	private USA usa;
	private Iraq iraq;

	@Override
	public void Declare(String message, Country colleague) {
		if (colleague == usa) {
			iraq.getMessage(message);
		} else {
			usa.getMessage(message);
		}
	}

	public USA getUsa() {
		return usa;
	}

	public void setUsa(USA usa) {
		this.usa = usa;
	}

	public Iraq getIraq() {
		return iraq;
	}

	public void setIraq(Iraq iraq) {
		this.iraq = iraq;
	}

}
