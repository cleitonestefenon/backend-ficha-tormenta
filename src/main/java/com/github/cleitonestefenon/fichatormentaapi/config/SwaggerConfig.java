package com.github.cleitonestefenon.fichatormentaapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private static final String BASE_PACKAGE = "com.github.cleitonestefenon.fichatormentaapi";
    private static final String TITULO_API = "Api ficha online Tormenta 20";
    private static final String DESCRICAO_API = "Api para gerenciar multiplas fichas de RPG Tormenta 20";
    private static final String VERSAO_API = "1.0.0";
    private static final String CONTATO_NOME = "Cleiton Estefenon";
    private static final String CONTATO_GITHUB = "https://github.com/CleitonEstefenon";
    private static final String CONTATO_EMAIL = "cleitonestefenon@gmail.com";

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(buildApiInfo());
    }

    private ApiInfo buildApiInfo() {
        return new ApiInfoBuilder()
                .title(TITULO_API)
                .description(DESCRICAO_API)
                .version(VERSAO_API)
                .contact(new Contact(CONTATO_NOME, CONTATO_GITHUB, CONTATO_EMAIL))
                .build();
    }
}
