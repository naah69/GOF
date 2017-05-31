package GOF.适配器模式_Adapter;

/**
 * 适配器模式-需要适配的类
 * 2017年5月28日 下午5:15:24
 * 外籍中锋
 */
public class ForeignCenter {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void 进攻() {
		System.out.println(getName() + "进攻");
	}

	public void 防守() {
		System.out.println(getName() + "防守");
	}
}
