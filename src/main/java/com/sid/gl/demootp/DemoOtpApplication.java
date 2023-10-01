package com.sid.gl.demootp;

import io.github.seyeadamaUASZ.service.OTPConfiguration;
import io.github.seyeadamaUASZ.service.OTPManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class DemoOtpApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoOtpApplication.class, args);
	}

	@Bean
	public OTPConfiguration getConf(){
		return new OTPManager();
	}

}
