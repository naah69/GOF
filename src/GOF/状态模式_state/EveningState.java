package GOF.状态模式_state;

/**
 * 状态模式-实现类
 * 2017年5月27日 上午8:46:49
 * 晚上
 */
public class EveningState implements State {

	@Override
	public void WriteProgram(Work w) {
		if (w.isFinish()) {
			w.setCurrent(new RestState());
			w.WriteProgram();
		} else {
			if (w.getHour() < 21) {
				System.out.println("当前时间：" + w.getHour() + "点,加班哦，疲累之极");
			} else {
				w.setCurrent(new SleepingState());
				w.WriteProgram();
			}
		}

	}

}
