package GOF.开放封闭原则_open_close;

/**
 *
 * 2017年5月19日 下午4:44:45
 *
 */
public class Main
{

	public static void main(String[] args)
	{
		BankWorkerInterface bankWorker1 = new SavingBankWorker();
		bankWorker1.operation();

		BankWorkerInterface bankWorker2 = new DrawingBankWorker();
		bankWorker2.operation();

		BankWorkerInterface bankWorker3 = new ZhuanZhangBankWorker();
		bankWorker3.operation();

		BankWorkerInterface bankWorker4 = new JiJinBankWorker();
		bankWorker4.operation();
	}

}
