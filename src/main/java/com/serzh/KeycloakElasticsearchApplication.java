package com.serzh;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@Slf4j
@SpringBootApplication
public class KeycloakElasticsearchApplication {

    public static void main(String[] args) {
        Environment env = SpringApplication.run(KeycloakElasticsearchApplication.class, args).getEnvironment();
        log.info("http://127.0.0.1:8080/products");

			/*	String url = env.getProperty("app.url");

		log.info("Access URLs:\n===============================================================\n" +
				"\tApplication URL: \t\t" + url + "\n" +
				"\tSwagger URL: \t\t\t" + url + "/swagger-ui.html\n" +
				"\tActuator URL: \t\t\t" + url + "/actuator\n" +
				"===============================================================");*/
    }

}

