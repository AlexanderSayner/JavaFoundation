package org.sayner.sandbox.awesome.push;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PushApplication {

	public static void main(String[] args) {
		SpringApplication.run(PushApplication.class, args);
	}

}
