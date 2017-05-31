package GOF.状态模式_state;

/**
 * 状态模式-实现类
 * 2017年5月27日 上午8:43:43
 * 中午
 */
public class NoonState implements State {

	@Override
	public void WriteProgram(Work w) {
		if (w.getHour() < 13) {
			System.out.println("当前时间：" + w.getHour() + "点,饿了，午饭；犯困，午休");
		} else {
			w.setCurrent(new AfternoonState());
			w.WriteProgram();
		}
	}

}
