// @autor: Israel Bejarano
package com.microservicios.springboot.app.item;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

// con esta clase y este bean podemos conectarnos a otros microservicios

@Configuration
public class AppConfig {
	
	@Bean
	public RestTemplate registrarRestTemplate() {
		return new RestTemplate();
	}

}
