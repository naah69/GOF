package GOF.备忘录模式_Memento;

/**
 * 备忘录模式-管理者类
 * 2017年5月28日 下午6:20:01
 * 角色状态管理类
 */
public class RoleStateCaretaker {
	private RoleStateMemento memento;

	public RoleStateMemento getMemento() {
		return memento;
	}

	public void setMemento(RoleStateMemento memento) {
		this.memento = memento;
	}

}
