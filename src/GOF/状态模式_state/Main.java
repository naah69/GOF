package GOF.状态模式_state;

/**
 * 
 * 2017年5月27日 上午8:53:11
 * 
 */
public class Main {
	public static void main(String[] args) {
		Work project = new Work();
		project.setCurrent(new ForenoonState());
		for (int i = 9; i < 22; i++) {
			project.setHour(i);
			project.WriteProgram();

		}
	}
}
