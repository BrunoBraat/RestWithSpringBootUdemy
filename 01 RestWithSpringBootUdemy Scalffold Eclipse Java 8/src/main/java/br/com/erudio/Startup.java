package br.com.erudio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Annotation, nao se pode ter espaço entre o oq é chamado no @ e no public 
@SpringBootApplication
public class Startup {

	public static void main(String[] args) {
		SpringApplication.run(Startup.class, args);
	}
	
	
}
