// Simple test program for service provider framework
package org.effectivejava.examples.chapter02.item01;

import static java.lang.Math.E;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;

public class Test {
	public static void main(String[] args) {
		// Providers would execute these lines
		Services.registerDefaultProvider(DEFAULT_PROVIDER);
		Services.registerProvider("comp", COMP_PROVIDER);
		Services.registerProvider("armed", ARMED_PROVIDER);
		Services.registerProvider("adapter", ADAPTER_TEST);

		// Clients would execute these lines
		Service s1 = Services.newInstance();
                s1.install();
		Service s2 = Services.newInstance("comp");
                s2.install();
                 Service s3 = Services.newInstance("armed");
                s3.install();
                 Service s4 = Services.newInstance("adapter");
                s4.install();
		System.out.printf("%s, %s, %s, %s%n", s1, s2, s3,s4);
  	}

	private static Provider DEFAULT_PROVIDER = new Provider() {
		public Service newService() {
			return new Service() {
				@Override
				public String toString() {
					return "Default service";
				}

                            @Override
                            public void install() {
                                System.out.println("installing "+toString());
                             }
			};
		}
	};

	private static Provider COMP_PROVIDER = new Provider() {
		public Service newService() {
			return new Service() {
				@Override
				public String toString() {
					return "Complementary service";
				}

                            @Override
                            public void install() {
                                System.out.println("installing "+toString());
                            }
			};
		}
	};

	private static Provider ARMED_PROVIDER = new Provider() {
		public Service newService() {
			return new Service() {
				@Override
				public String toString() {
					return "Armed service";
				}

                            @Override
                            public void install() {
                                System.out.println("installing "+toString());
                            }
			};
		}
	};
        
        private static Provider ADAPTER_TEST= new Provider(){

            @Override
            public Service newService() {
                return  AnyThingToServiceAdapter.<Test>newInstance(Test.class, "main");
             }
        
        };

    
}
