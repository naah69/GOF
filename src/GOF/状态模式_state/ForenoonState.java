package GOF.状态模式_state;

/**
 * 状态模式-实现类 
 * 2017年5月27日 上午8:40:10 
 * 上午
 */
public class ForenoonState implements State {

	@Override
	public void WriteProgram(Work w) {
		if (w.getHour() < 12) {
			System.out.println("当前时间：" + w.getHour() + "点,上午工作，精神百倍");
		} else {
			w.setCurrent(new NoonState());
			w.WriteProgram();
		}
	}

}
