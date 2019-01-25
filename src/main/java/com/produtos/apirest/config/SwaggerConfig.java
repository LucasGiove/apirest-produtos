package com.produtos.apirest.config;


import java.util.ArrayList;
import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors; 
import springfox.documentation.builders.RequestHandlerSelectors; 
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact; 
import springfox.documentation.service.VendorExtension; 
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2; 

@Configuration 
@EnableSwagger2 

public class SwaggerConfig { 
	
	@Bean 
	public Docket productApi(){ 
		return new Docket(DocumentationType.SWAGGER_2) 
				.select() 				
				.apis(RequestHandlerSelectors.basePackage("com.produtos.apirest")) 
				.paths(PathSelectors.regex("/api.*")) 
				.build()
		        .apiInfo(metaInfo()); 
		
	} 
	
	@SuppressWarnings("rawtypes")
				
			private ApiInfo metaInfo() { 
					return new ApiInfo("REST Api Documentation", 
							"REST Api Documentation", "1.0", 
							"urn:tos", new Contact("Lucas Giove", "http//youtube.com.br",
									"lucas@wf21.com.br"),
							"Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", 
							new ArrayList<VendorExtension>());
					} 
				}