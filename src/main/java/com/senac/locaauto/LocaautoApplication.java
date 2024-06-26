package com.senac.locaauto;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Loca Auto", version = "1.0", description = "Documentation of API v1.0"))
public class LocaautoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocaautoApplication.class, args);
	}

}
