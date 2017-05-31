package GOF.适配器模式_Adapter;

/**
 * 适配器模式-抽象类
 * 2017年5月28日 下午5:09:14
 * 球星
 */
public abstract class Player {
	private String Name;

	public Player(String name) {
		super();
		Name = name;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public abstract void Attack();

	public abstract void Defense();
}
