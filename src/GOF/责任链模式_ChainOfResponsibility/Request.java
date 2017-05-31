package GOF.责任链模式_ChainOfResponsibility;

/**
 * 责任链模式-请求类
 * 2017年5月29日 上午11:11:54
 * 请求
 */
public class Request {
	private String requestType;
	private String requestContent;
	private int number;

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getRequestContent() {
		return requestContent;
	}

	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
