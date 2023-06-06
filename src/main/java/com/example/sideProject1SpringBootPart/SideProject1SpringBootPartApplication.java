package com.example.sideProject1SpringBootPart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.sideProject1SpringBootPart.Certificates")
public class SideProject1SpringBootPartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SideProject1SpringBootPartApplication.class, args);
	}

}
