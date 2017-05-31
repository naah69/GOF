package GOF.访问者模式_Visitor;

/**
 * 访问者陌陌上-访问者接口
 * 2017年5月29日 下午4:19:15
 * 
 */
public abstract class Action {
	protected String name;

	public Action(String name) {
		super();
		this.name = name;
	}

	public abstract void getManConclusion(Man man);

	public abstract void getWomanConclusion(Woman woman);
}
