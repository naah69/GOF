package GOF.状态模式_state;

/**
 * 状态模式-实现类
 * 2017年5月27日 上午8:49:53
 * 睡觉
 */
public class SleepingState implements State {

	@Override
	public void WriteProgram(Work w) {
		System.out.println("当前时间:" + w.getHour() + "点 ,不行了，睡着了");
	}

}
