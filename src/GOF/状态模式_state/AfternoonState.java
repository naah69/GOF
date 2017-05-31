package GOF.状态模式_state;

/**
 * 状态模式-实现类
 * 2017年5月27日 上午8:45:26
 * 下午
 */
public class AfternoonState implements State {

	@Override
	public void WriteProgram(Work w) {
		if (w.getHour() < 17) {
			System.out.println("当前时间：" + w.getHour() + "点,下午状态，继续努力");
		} else {
			w.setCurrent(new EveningState());
			w.WriteProgram();
		}
	}

}
