package GOF.组合模式_Composite;

/**
 * 组合模式-页节点类
 * 2017年5月28日 下午6:51:26
 * 
 */
class Department extends Company {

	public Department(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Add(Company c) {
	}

	@Override
	public void Remove(Company c) {
	}

	@Override
	public void Display(int depth) {
		for (int i = 0; i < depth; i++) {
			System.out.print("-");
		}
		System.out.println(name);
	}

	@Override
	public void LineOfDuty() {
		System.out.println(name + "员工招聘培训管理");
	}

}

class FinanceDepartment extends Company {

	public FinanceDepartment(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Add(Company c) {
	}

	@Override
	public void Remove(Company c) {
	}

	@Override
	public void Display(int depth) {
		for (int i = 0; i < depth; i++) {
			System.out.print("-");
		}
		System.out.println(name);
	}

	@Override
	public void LineOfDuty() {
		System.out.println(name + "公司财务收支管理");
	}

}
