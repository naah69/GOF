package GOF.命令模式_Command;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * 命令模式-请求者类
 * 2017年5月29日 上午10:17:32
 * 
 */
public class Waiter {
	private List<Command> orders = new ArrayList<Command>();

	public void setOrders(Command command) {
		if (command.toString() == "命令模式.烤鸡翅") {
			System.out.println("服务员：鸡翅没有了，请点别的烧烤");
		} else {
			orders.add(command);
			System.out.println("增加订单:"
					+ command.toString()
					+ "  时间:"
					+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
							.format(new Timestamp(System.currentTimeMillis())));
		}
	}

	public void Notify() {
		for (Command cmd : orders) {
			cmd.ExcuteCommand();
		}
	}
}
