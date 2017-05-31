package GOF.简单工厂_SimpleFactory;

public class OperationSimpleFactory
{ //简单工厂类根据需求生成实例返回
	public static Operation createOpreation(String operate)
	{
		Operation opera = null;
		switch (operate)
		{
			case "+":
				opera = new OperationAdd();
				break;
			case "-":
				opera = new OperationSub();
				break;
			case "*":
				opera = new OperationMul();
				break;
			case "/":
				opera = new OperationDiv();
				break;
			default:
				try
				{
					throw new RuntimeException("不支持的运算！");
				}
				catch (Exception e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
		}
		return opera;
	}
}
