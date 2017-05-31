package GOF.策略模式_Strategy;

import java.util.Scanner;

/**
 * 单例模式返回Scanner
 * 2017年5月19日 下午3:05:41
 *
 */
public class GetScanner {
	private static Scanner input = new Scanner(System.in);

	private GetScanner() {

	}

	public static Scanner getInput() {
		return input;
	}

}
