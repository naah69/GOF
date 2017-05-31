package GOF.责任链模式_ChainOfResponsibility;

/**
 * 责任链模式-处理实现类
 * 2017年5月29日 上午11:13:38
 * 总经理
 */
public class GeneralManager extends Manager {

	public GeneralManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void RequestApplications(Request request) {
		if (request.getRequestType() == "请假") {

			System.out.println(super.name + ":" + request.getRequestContent()
					+ "数量" + request.getNumber() + "被批准");
		} else if (request.getRequestType() == "加薪"
				&& request.getNumber() <= 500) {
			System.out.println(super.name + ":" + request.getRequestContent()
					+ "数量" + request.getNumber() + "被批准");

		} else if (request.getRequestType() == "加薪"
				&& request.getNumber() > 500) {
			System.out.println(super.name + ":" + request.getRequestContent()
					+ "数量" + request.getNumber() + "再说吧");

		}

	}

}
