package com.example.sbd_modul4_kel19;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.*")
public class SbdModul4Kel19Application {

	public static void main(String[] args) {
		SpringApplication.run(SbdModul4Kel19Application.class, args);
	}

}
