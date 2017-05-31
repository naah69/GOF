package GOF.访问者模式_Visitor;

/**
 * 访问者模式-具体访问者实现类
 * 2017年5月29日 下午4:22:08
 * 
 */
public class Success extends Action {

	public Success(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getManConclusion(GOF.访问者模式_Visitor.Man man) {
		System.out.println(man.name + this.name + "时，背后多半有一个伟大的女人");
	}

	@Override
	public void getWomanConclusion(Woman woman) {
		System.out.println(woman.name + this.name + "时，背后大多有一个不成功的男人");
	}

}
