package GOF.访问者模式_Visitor;

/**
 * 访问者模式-具体元素实现类
 * 2017年5月29日 下午4:22:26
 * 
 */
public class Man extends Person {
	protected final String name = "男人";

	@Override
	public void Accept(Action visitor) {
		visitor.getManConclusion(this);
	}

}
