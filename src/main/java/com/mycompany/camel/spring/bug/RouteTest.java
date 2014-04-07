package com.mycompany.camel.spring.bug;

import org.apache.camel.builder.RouteBuilder;
import org.apache.log4j.Logger;


public class RouteTest extends RouteBuilder {

	Logger LOG = Logger.getLogger(RouteTest.class);
	
	public void configure() throws Exception {
		
		from("file://C:/Users/EJEALEB/Desktop/POUBELLE/2/camel-spring-test/src/main/resources/input?noop=true")
			.log("start process ${file:name}")
			.split()
				.tokenize("\n")
				 .to("log:bugz")
				 .end()
			.log("end process ${file:name}")
			.end();
	}
}
