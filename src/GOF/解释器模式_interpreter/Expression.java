package GOF.解释器模式_interpreter;

/**
 * 解释器模式-解释器接口或抽象类
 * 2017年5月29日 下午3:49:10
 * 
 */
public abstract class Expression {

	public void Interpret(Context context) {
		if (context.getMessage().length() == 0) {
			System.out.println("控信息，不做处理");
			return;
		} else {
			Operate(context.getMessage());
		}
	}

	public abstract void Operate(String message);
}
