package GOF.简单工厂_SimpleFactory;

//利用多态去完成计算

public class Operation
{
	private double numberA,numberB;

	public double getResult()
	{
		return 0;
	}

	public double getNumberA()
	{
		return numberA;
	}

	public void setNumberA(double numberA)
	{
		this.numberA = numberA;
	}

	public double getNumberB()
	{
		return numberB;
	}

	public void setNumberB(double numberB)
	{
		this.numberB = numberB;
	}

}

class OperationAdd extends Operation
{

	@Override
	public double getResult()
	{
		// TODO Auto-generated method stub
		return getNumberA() + getNumberB();
	}

}

class OperationSub extends Operation
{

	@Override
	public double getResult()
	{
		// TODO Auto-generated method stub
		return getNumberA() - getNumberB();
	}

}

class OperationMul extends Operation
{

	@Override
	public double getResult()
	{
		// TODO Auto-generated method stub
		return getNumberA() * getNumberB();
	}

}

class OperationDiv extends Operation
{

	@Override
	public double getResult()
	{
		if (getNumberB() == 0)
		{
			try
			{
				throw new RuntimeException("除数为0！");
			}
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
				return 0;
			}
		}
		// TODO Auto-generated method stub
		return getNumberA() + getNumberB();
	}

}