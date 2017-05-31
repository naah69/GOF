package GOF.责任链模式_ChainOfResponsibility;

/**
 * 
 * 2017年5月29日 上午11:43:34
 * 
 */
public class Main {

	public static void main(String[] args) {
		Manager jingli = new CommonManager("金利");
		Manager zongjian = new Majordomo("宗剑");
		Manager zongjingli = new GeneralManager("钟净利");
		jingli.setSuperior(zongjian);
		zongjian.setSuperior(zongjingli);

		Request request = new Request();
		request.setRequestType("请假");
		request.setRequestContent("小菜请假");
		request.setNumber(1);
		jingli.RequestApplications(request);

		Request request2 = new Request();
		request2.setRequestType("请假");
		request2.setRequestContent("小菜请假");
		request2.setNumber(4);
		jingli.RequestApplications(request2);

		Request request3 = new Request();
		request3.setRequestType("加薪");
		request3.setRequestContent("小菜加薪");
		request3.setNumber(500);
		jingli.RequestApplications(request3);

		Request request4 = new Request();
		request4.setRequestType("加薪");
		request4.setRequestContent("小菜加薪");
		request4.setNumber(1000);
		jingli.RequestApplications(request4);

	}
}
