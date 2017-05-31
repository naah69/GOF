package GOF.组合模式_Composite;

/**
 * 
 * 2017年5月28日 下午6:59:35
 * 
 */
public class Main {

	public static void main(String[] args) {
		ConcreteCompany root = new ConcreteCompany("北京总公司");
		root.Add(new Department("总公司人力资源部"));
		root.Add(new FinanceDepartment("总公司财务部"));

		ConcreteCompany comp = new ConcreteCompany("上海华东分公司");
		comp.Add(new Department("华东分公司人力资源部"));
		comp.Add(new FinanceDepartment("华东分公司财务部"));
		root.Add(comp);

		ConcreteCompany comp1 = new ConcreteCompany("南京办事处");
		comp1.Add(new Department("南京办事处人力资源部"));
		comp1.Add(new FinanceDepartment("南京办事处财务部"));
		comp.Add(comp1);

		ConcreteCompany comp2 = new ConcreteCompany("杭州办事处");
		comp2.Add(new Department("杭州办事处人力资源部"));
		comp2.Add(new FinanceDepartment("杭州办事处财务部"));
		comp.Add(comp2);

		System.out.println("结构图");
		root.Display(1);

		System.out.println("职责");
		root.LineOfDuty();

	}

}
