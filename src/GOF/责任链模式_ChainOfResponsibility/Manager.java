package GOF.责任链模式_ChainOfResponsibility;

/**
 * 责任链模式-处理接口或处理抽象类
 * 2017年5月29日 上午11:09:03
 * 
 */
public abstract class Manager {
	protected String name;
	protected Manager superior;

	public Manager(String name) {
		super();
		this.name = name;
	}

	public void setSuperior(Manager superior) {
		this.superior = superior;
	}

	abstract public void RequestApplications(Request request);
}
