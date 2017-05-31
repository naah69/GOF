package GOF.解释器模式_interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 2017年5月29日 下午4:01:33
 * 
 */
public class Main {

	public static void main(String[] args) {
		Expression expression;
		Context messContext1 = new Context();
		Context messContext2 = new Context();
		Context messContext3 = new Context();

		messContext1.setMessage("你好，小面，你的简历经过了我们的赛选，请来参见面试！");
		messContext2.setMessage("儿子，妈怕你钱不够花，给你汇款来了了！");
		messContext3.setMessage("嘿，还记得我吗？我是老王啊，最近手头紧，给我汇款到123456789");

		List<Context> message = new ArrayList<Context>();
		message.add(messContext1);
		message.add(messContext2);
		message.add(messContext3);

		for (Context context : message) {
			if (context.getMessage().contains("汇款")) {
				System.out.println("疑似收到诈骗短信：" + context.getMessage());
				expression = new RubbishMessage();
				expression.Interpret(context);
			} else {
				System.out.println("收到正常短信：" + context.getMessage());
				expression = new NomalMessage();
				expression.Interpret(context);
			}
		}
	}

}
