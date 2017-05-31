package GOF.命令模式_Command;

/**
 * 
 * 2017年5月29日 上午10:18:38
 * 
 */
public class Main {

	public static void main(String[] args) {
		Barbecuer boy = new Barbecuer();
		Command bakeMutton1 = new BakeMuttonCommand(boy);
		Command bakeMutton2 = new BakeMuttonCommand(boy);
		Command bakeChickenWing = new BakeCheckenWingCommand(boy);
		Waiter girl = new Waiter();

		girl.setOrders(bakeMutton1);
		girl.setOrders(bakeMutton2);
		girl.setOrders(bakeChickenWing);

		girl.Notify();
	}

}
