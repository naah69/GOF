package GOF.命令模式_Command;

/**
 * 命令模式-操作实现类
 * 2017年5月29日 上午10:16:01
 * 
 */
public class BakeCheckenWingCommand extends Command {

	public BakeCheckenWingCommand(Barbecuer receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ExcuteCommand() {
		receiver.BakeChickenWing();
	}

	@Override
	public String toString() {
		return "命令模式.烤鸡翅";
	}

}
