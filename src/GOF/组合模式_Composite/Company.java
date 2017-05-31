package GOF.组合模式_Composite;

/**
 * 组合模式-组合接口
 * 2017年5月28日 下午6:48:35
 * 公司接口
 */
public abstract class Company {
	protected String name;

	public Company(String name) {
		super();
		this.name = name;
	}

	public abstract void Add(Company c);

	public abstract void Remove(Company c);

	public abstract void Display(int depth);

	public abstract void LineOfDuty();
}
