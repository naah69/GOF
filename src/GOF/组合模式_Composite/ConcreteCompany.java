package GOF.组合模式_Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式-枝节点类
 * 2017年5月28日 下午6:51:26
 * 公司
 */
public class ConcreteCompany extends Company {
	private List<Company> children = new ArrayList<Company>();

	public ConcreteCompany(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Add(Company c) {

		children.add(c);

	}

	@Override
	public void Remove(Company c) {
		children.remove(c);
	}

	@Override
	public void Display(int depth) {
		for (int i = 0; i < depth; i++) {
			System.out.print("-");
		}
		System.out.println(name);
		for (Company compant : children) {
			compant.Display(depth + 2);
		}
	}

	@Override
	public void LineOfDuty() {
		for (Company compant : children) {
			compant.LineOfDuty();
		}
	}

}
