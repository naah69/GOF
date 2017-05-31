package GOF.策略模式_Strategy;

/**
 *
 * 2017年5月19日 下午3:23:48
 *
 */
public class Main {

	public static void main(String[] args) {
		int select = OpreaSum.select();
		double totle = OpreaSum.opera();

		CaseContext context = new CaseContext(
				CaseSimpleFactory.CaseFactory(select));
		System.out.println("共计:" + context.getResult(totle));
	}

}
