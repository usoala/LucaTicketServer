package com.example.spring.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Project LucaTicketCompra
 *
 * @ClassName SwaggerConfig
 *
 * @author Sara Silvo
 *
 * @date 7 jul. 2021
 * 
 * @version 1.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build().apiInfo(getApiInfo());
	}

	/**
	 * Permite personalizar la informacion que se muestra en la API
	 */
	private ApiInfo getApiInfo() {
		return new ApiInfo("Order Service API", "Order Service API Description", "1.0", "http://lucaticket.es/terms",
				new Contact("LucaTicket.SL", "lucaticket", "lucaticket@luca.es"), "LICENSE", "LICENSE URL",
				Collections.emptyList());
	}

}
