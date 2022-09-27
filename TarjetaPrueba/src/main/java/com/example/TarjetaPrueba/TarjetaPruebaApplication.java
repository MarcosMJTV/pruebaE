package com.example.TarjetaPrueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.TarjetaPrueba.api.RestServices;

@SpringBootApplication
@ComponentScan(basePackageClasses=RestServices.class )
public class TarjetaPruebaApplication {

	public static void main(String[] args) {
		System.setProperty("server.port", "26526");
		SpringApplication.run(TarjetaPruebaApplication.class, args);
		
	}

	
}
