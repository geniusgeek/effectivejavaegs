// Service provider framework sketch

// Noninstantiable class for service registration and access - Pages 8-9
package org.effectivejava.examples.chapter02.item01;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services {
	private Services() {
	} // Prevents instantiation (Item 4)

	// Maps service names to services
	private static final Map<String, ProviderImplements> providers = new ConcurrentHashMap<String, ProviderImplements>();
	public static final String DEFAULT_PROVIDER_NAME = "<def>";

	// Provider registration API
	public static void registerDefaultProvider(ProviderImplements p) {
		registerProvider(DEFAULT_PROVIDER_NAME, p);
	}

	public static void registerProvider(String name, ProviderImplements p) {
		providers.put(name, p);
	}

	// Service access API
	public static Service newInstance() {
		return newInstance(DEFAULT_PROVIDER_NAME);
	}

//	public static Service newInstance(String name) {
//		Provider p = providers.get(name);
//		if (p == null)
//			throw new IllegalArgumentException(
//					"No provider registered with name: " + name);
//		return p.newService();
//	}
        
        public static Service newInstance(String name) {
		ProviderImplements p = providers.get(name);
		if (p == null)
			throw new IllegalArgumentException(
					"No provider registered with name: " + name);
		return p;
	}
}
