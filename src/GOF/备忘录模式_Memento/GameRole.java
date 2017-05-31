package GOF.备忘录模式_Memento;

/**
 * 备忘录模式-发起人类
 * 2017年5月28日 下午6:13:30
 * 游戏角色类
 */
public class GameRole {
	private int vit;
	private int atk;
	private int def;

	public RoleStateMemento SaveState() {
		return new RoleStateMemento(vit, atk, def);
	}

	public void RecoveryState(RoleStateMemento memento) {
		this.vit = memento.getVit();
		this.atk = memento.getAtk();
		this.def = memento.getDef();
		System.out.println("恢复后数据：");
		showState();
	}

	public void InitState() {
		this.vit = 100;
		this.atk = 100;
		this.def = 100;
		System.out.println("初始化数据：");
		showState();
	}

	public void Fight() {
		this.vit = 0;
		this.atk = 0;
		this.def = 0;
		System.out.println("战斗后数据：");
		showState();
	}

	public void showState() {

		System.out.println("生命力：" + this.vit);
		System.out.println("攻击力：" + this.atk);
		System.out.println("防御力：" + this.def);
	}

	public int getVit() {
		return vit;
	}

	public void setVit(int vit) {
		this.vit = vit;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

}
