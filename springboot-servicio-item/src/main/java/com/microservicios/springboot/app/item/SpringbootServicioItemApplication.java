package com.microservicios.springboot.app.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

// No hace falta ribbon ahora que tenemos Eureka ya que va integrado en este ultimo, esto era para el caso sin Eureka
// @RibbonClient(name = "servicio-productos")
@EnableFeignClients
@SpringBootApplication
@EnableEurekaClient
public class SpringbootServicioItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioItemApplication.class, args);
	}

}
