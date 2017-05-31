package GOF.亨元模式_Flyweight;

/**
 * 亨元模式-亨元实现类
 * 2017年5月29日 下午1:41:47
 * 
 */
public class ConcreteWebSite extends WebSite {
	private String name = "";

	public ConcreteWebSite(String name) {
		super();
		this.name = name;
	}

	@Override
	public void Use(GOF.亨元模式_Flyweight.User user) {
		System.out.println("网站分类：" + name + " 用户：" + user.getName());
	}

}
