package GOF.状态模式_state;

/**
 * 状态模式-原型类
 * 2017年5月27日 上午8:35:58
 * 工作
 */
public class Work {
	private State current;
	private double hour;
	private boolean finish = false;

	public void WriteProgram() {
		current.WriteProgram(this);
	}

	public State getCurrent() {
		return current;
	}

	public void setCurrent(State current) {
		this.current = current;
	}

	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}

	public boolean isFinish() {
		return finish;
	}

	public void setFinish(boolean finish) {
		this.finish = finish;
	}

}
