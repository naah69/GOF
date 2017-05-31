package GOF.命令模式_Command;

/**
 * 命令模式-操作实现类
 * 2017年5月29日 上午10:16:01
 * 
 */
public class BakeMuttonCommand extends Command {

	public BakeMuttonCommand(Barbecuer receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ExcuteCommand() {
		receiver.BakeMutton();
	}

	@Override
	public String toString() {
		return "命令模式.烤羊肉串";
	}

}
