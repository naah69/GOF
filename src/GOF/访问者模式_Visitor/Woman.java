package GOF.访问者模式_Visitor;

/**
 * 访问者模式-具体元素实现类
 * 2017年5月29日 下午4:23:55
 * 
 */
public class Woman extends Person {
	protected final String name = "女人";

	@Override
	public void Accept(Action visitor) {
		visitor.getWomanConclusion(this);
	}

}
