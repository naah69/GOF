package GOF.适配器模式_Adapter;

/**
 * 适配器模式-继承类
 * 2017年5月28日 下午5:11:20
 * 中锋
 */
public class Center extends Player {

	public Center(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Attack() {
		System.out.println(super.getName() + "进攻");
	}

	@Override
	public void Defense() {
		System.out.println(super.getName() + "防守");
	}

}
