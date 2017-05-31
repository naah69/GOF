package GOF.备忘录模式_Memento;

/**
 * 
 * 2017年5月28日 下午6:20:40
 * 
 */
public class Main {

	public static void main(String[] args) {
		GameRole lixiaoyao = new GameRole();
		lixiaoyao.InitState();

		RoleStateCaretaker state = new RoleStateCaretaker();
		state.setMemento(lixiaoyao.SaveState());

		lixiaoyao.Fight();

		lixiaoyao.RecoveryState(state.getMemento());
	}

}
