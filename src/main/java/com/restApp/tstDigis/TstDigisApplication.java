package com.restApp.tstDigis;

import com.restApp.tstDigis.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EnableAutoConfiguration(exclude = {
		ErrorMvcAutoConfiguration.class
})
public class TstDigisApplication {

	public static void main(String[] args) {
		SpringApplication.run(TstDigisApplication.class, args);
	}


}
