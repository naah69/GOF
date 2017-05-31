package GOF.备忘录模式_Memento;

/**
 * 备忘录模式-备忘录类
 * 2017年5月28日 下午6:15:43
 * 数据存储箱类
 */
public class RoleStateMemento {
	private int vit;
	private int atk;
	private int def;

	public RoleStateMemento(int vit, int atk, int def) {
		super();
		this.vit = vit;
		this.atk = atk;
		this.def = def;
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
