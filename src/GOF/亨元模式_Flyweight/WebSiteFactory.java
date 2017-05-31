package GOF.亨元模式_Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 亨元模式-亨元工厂
 * 2017年5月29日 下午1:44:24
 * 
 */
public class WebSiteFactory {
	private Map<String, WebSite> flyweights = new HashMap<String, WebSite>();

	public WebSite getWebSite(String key) {
		if (!flyweights.containsKey(key)) {
			flyweights.put(key, new ConcreteWebSite(key));
		}
		return flyweights.get(key);
	}

	public int getWebSiteCount() {
		return flyweights.size();
	}
}
