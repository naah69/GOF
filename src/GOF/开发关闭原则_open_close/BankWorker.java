package GOF.开发关闭原则_open_close;

/**
 *
 * 2017年5月19日 下午4:42:47
 *
 */
class SavingBankWorker implements BankWorkerInterface
{

	@Override
	public void operation()
	{
		System.out.println("进行存款操作");
	}

}

class DrawingBankWorker implements BankWorkerInterface
{

	@Override
	public void operation()
	{
		System.out.println("进行取款操作");
	}

}

class ZhuanZhangBankWorker implements BankWorkerInterface
{

	@Override
	public void operation()
	{
		System.out.println("进行转账操作");
	}

}

class JiJinBankWorker implements BankWorkerInterface
{

	@Override
	public void operation()
	{
		System.out.println("进行基金操作");
	}

}
