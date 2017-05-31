package GOF.状态模式_state;

/**
 * 状态模式-实现类
 * 2017年5月27日 上午8:51:08
 * 休息
 */
public class RestState implements State {

	@Override
	public void WriteProgram(Work w) {
		System.out.println("当前时间:" + w.getHour() + "点,下班回家！");
	}

}
