package GOF.解释器模式_interpreter;

/**
 * 解释器模式-解释器具体实现类
 * 2017年5月29日 下午3:50:22
 * 
 */
public class RubbishMessage extends Expression {

	@Override
	public void Operate(String message) {
		if (message.contains("儿子")) {
			System.out.println("这是老妈发来的短信，不是骗子：" + message);

		} else {
			System.out.println("骗子短信太猖獗了，系统自动过滤！");
		}
	}

}
