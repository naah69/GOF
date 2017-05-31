package GOF.命令模式_Command;

/**
 * 命令模式-接收者类
 * 2017年5月29日 上午10:12:30
 * 
 */
public class Barbecuer {

	public void BakeMutton() {
		System.out.println("烤羊肉串！");
	}

	public void BakeChickenWing() {
		System.out.println("烤鸡翅！");
	}
}
