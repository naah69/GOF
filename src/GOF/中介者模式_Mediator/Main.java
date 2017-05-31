package GOF.中介者模式_Mediator;

/**
 * 
 * 2017年5月29日 下午12:57:47
 * 
 */
public class Main {

	public static void main(String[] args) {
		UnitedNationsSecurityCouncil UNSC = new UnitedNationsSecurityCouncil();

		USA usa = new USA(UNSC);
		Iraq iraq = new Iraq(UNSC);

		UNSC.setUsa(usa);
		UNSC.setIraq(iraq);

		usa.Declare("不准研制核武器，否则发动战争！");
		iraq.Declare("我们没有研制核武器，我们也不怕侵略");
	}

}
