package GOF.适配器模式_Adapter;

/**
 * 适配器模式-适配类
 * 2017年5月28日 下午5:16:52
 * 翻译
 */

public class Translator extends Player {
	private ForeignCenter wjzf = new ForeignCenter();

	public Translator(String name) {
		super(name);
		wjzf.setName(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Attack() {
		wjzf.进攻();
	}

	@Override
	public void Defense() {
		wjzf.防守();
	}

}
