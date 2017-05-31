package GOF.访问者模式_Visitor;

/**
 * 
 * 2017年5月29日 下午4:32:39
 * 
 */
public class Main {

	public static void main(String[] args) {
		ObjectStructure o = new ObjectStructure();
		o.Attach(new Man());
		o.Attach(new Woman());

		Success v1 = new Success("成功");
		o.Display(v1);
	}

}
