package GOF.简单工厂_SimpleFactory;

import java.util.Scanner;

//2017年5月19日 下午2:41:24
public class Main
{

	public static void main(String[] args)
	{
		double a,b;
		String o;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入运算符（+、-、*、/）！");
		o = input.nextLine();
		System.out.println("请输入第一个数字！");
		a = input.nextDouble();
		System.out.println("请输入第二个数字！");
		b = input.nextDouble();

		Operation opera = OperationSimpleFactory.createOpreation(o);
		opera.setNumberA(a);
		opera.setNumberB(b);
		System.out.println("结果为:" + opera.getResult());
	}
}
