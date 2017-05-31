package GOF.访问者模式_Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式-对象结构
 * 2017年5月29日 下午4:29:32
 * 
 */
public class ObjectStructure {
	private List<Person> elements = new ArrayList<Person>();

	public void Attach(Person element) {
		elements.add(element);
	}

	public void Detach(Person element) {
		elements.remove(element);
	}

	public void Display(Action visitor) {
		for (Person e : elements) {
			e.Accept(visitor);
		}
	}
}
