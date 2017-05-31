package GOF.里氏代换原则_lishidaihuan;

/**
 *里氏代换原则-实现
 * 2017年5月23日 上午10:18:24
 *长方形
 */
public class Rectangle implements Quadrangle
{
	private long width;
	private long height;

	@Override
	public long getWidth()
	{
		return width;
	}

	public void setWidth(long width)
	{
		this.width = width;
	}

	@Override
	public long getHeight()
	{
		return height;
	}

	public void setHeight(long height)
	{
		this.height = height;
	}
}
