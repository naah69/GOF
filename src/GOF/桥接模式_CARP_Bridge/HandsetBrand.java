package GOF.桥接模式_CARP_Bridge;

/**
 * 合成聚合-抽象类
 * 2017年5月29日 上午9:47:24
 * 
 */
public abstract class HandsetBrand {
	protected HandsetSoft soft;

	public void setSoft(HandsetSoft soft) {
		this.soft = soft;
	}

	public abstract void Run();
}
