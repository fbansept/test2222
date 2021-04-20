package edu.ifa.ifachat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class IfachatApplication {

	public static void main(String[] args) {
		SpringApplication.run(IfachatApplication.class, args);
	}

}
