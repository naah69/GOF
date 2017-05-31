package GOF.解释器模式_interpreter;

/**
 * 解释器模式-解释器具体实现类
 * 2017年5月29日 下午3:52:43
 * 
 */
public class NomalMessage extends Expression {

	@Override
	public void Operate(String message) {
		if (message.contains("面试")) {
			System.out.println("恭喜，收到了面试通知：" + message);
		} else {
			System.out.println("普通短信：" + message);
		}
	}

}
