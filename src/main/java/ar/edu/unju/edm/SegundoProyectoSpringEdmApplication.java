package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.controller.CalculadoraController;

@SpringBootApplication
public class SegundoProyectoSpringEdmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SegundoProyectoSpringEdmApplication.class, args);
		
		CalculadoraController operacion = new CalculadoraController();
		operacion.resolverOperaciones();
	}

}
