package GOF.里氏代换原则_lishidaihuan;

/**
 *里氏代换原则-实现
 * 2017年5月23日 上午10:19:17
 *正方形
 */
public class Square implements Quadrangle
{
	private long side;

	public long getSide()
	{
		return side;
	}

	public void setSide(long side)
	{
		this.side = side;
	}

	@Override
	public long getWidth()
	{
		return getSide();
	}

	@Override
	public long getHeight()
	{
		return getSide();
	}
}
