package org.at.schoolar.curriculum.config;

import com.google.common.collect.Sets;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@EnableSwagger2
@Configuration
public class SpringFoxConfig {
    @Bean
    public Docket curriculumApi() {
        return new Docket(DocumentationType.SWAGGER_2).useDefaultResponseMessages(true)
                .select()
                .apis(RequestHandlerSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("org.at.schoolar.curriculum"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(swaggerStaticInfo())
                .consumes(Sets.newHashSet("application/json"))
                .produces(Sets.newHashSet("application/json"));
    }

    private ApiInfo swaggerStaticInfo(){
        return new ApiInfoBuilder()
                .description("Basic API for CV for testings porpuses")
                .title("CV AT Application")
                .build();
    }
}
