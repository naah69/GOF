package GOF.亨元模式_Flyweight;

/**
 * 
 * 2017年5月29日 下午1:48:28
 * 
 */
public class Main {

	public static void main(String[] args) {
		WebSiteFactory f = new WebSiteFactory();

		WebSite fx = f.getWebSite("产品展示");
		fx.Use(new User("小菜"));

		WebSite fy = f.getWebSite("产品展示");
		fx.Use(new User("大鸟"));

		WebSite fz = f.getWebSite("产品展示");
		fx.Use(new User("娇娇"));

		WebSite fl = f.getWebSite("博客");
		fx.Use(new User("张三"));

		WebSite fm = f.getWebSite("博客");
		fx.Use(new User("李四"));

		WebSite fn = f.getWebSite("博客");
		fx.Use(new User("王五"));

		System.out.println("得到网站分类总数为：" + f.getWebSiteCount());

	}

}
