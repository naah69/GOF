package GOF.策略模式_Strategy;

import java.util.Scanner;

/**
 * 
 * 2017年5月30日 下午10:46:31
 * 
 */
public class OpreaSum {
	public static double opera() {
		Scanner input = GetScanner.getInput();
		double totle = 0;
		double one;
		int num;
		System.out.println("进入计算系统(-1退出):");
		do {
			System.out.print("请输入单价:");
			one = input.nextDouble();
			if (one == -1) {
				break;
			}
			System.out.print("请输入原价:");
			num = input.nextInt();
			if (num == -1) {
				break;
			}
			totle = totle + one * num;

		} while (one != -1 && num != -1);

		return totle;
	}

	public static int select() {
		Scanner input = GetScanner.getInput();
		System.out.println("1.正常模式");
		System.out.println("2.打折模式");
		System.out.println("3.满减模式");
		System.out.print("请选择模式：");
		int select = input.nextInt();
		return select;

	}
}
