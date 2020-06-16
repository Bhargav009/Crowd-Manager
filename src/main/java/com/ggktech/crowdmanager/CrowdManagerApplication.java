package com.ggktech.crowdmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class CrowdManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrowdManagerApplication.class, args);
	}

}
