package GOF.命令模式_Command;

/**
 * 命令模式-操作接口或抽象类
 * 2017年5月29日 上午10:14:23
 * 
 */
public abstract class Command {
	protected Barbecuer receiver;

	public Command(Barbecuer receiver) {
		super();
		this.receiver = receiver;
	}

	abstract public void ExcuteCommand();

}
