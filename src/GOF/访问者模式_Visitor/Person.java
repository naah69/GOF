package GOF.访问者模式_Visitor;

/**
 * 访问者模式-元素接口
 * 2017年5月29日 下午4:20:56
 * 
 */
public abstract class Person {
	public abstract void Accept(Action visitor);
}
