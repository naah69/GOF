package GOF.建造者模式_builder;

/**
 * 建造者模式-指挥者类
 * 2017年5月26日 下午12:59:01
 * 教师类
 */
public class Teacher {
	private Student a;

	public Teacher(Student a) {
		super();
		this.a = a;
	}

	public Student getA() {
		return a;
	}

	public void setA(Student a) {
		this.a = a;
	}

	public void zhiHui() {
		a.prepareEx();
		a.writeTitle();
		a.writeAuthor();
		a.writeContent();
	}
}
