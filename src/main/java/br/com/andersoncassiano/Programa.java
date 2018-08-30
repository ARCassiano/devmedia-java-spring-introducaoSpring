package br.com.andersoncassiano;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.com.andersoncassiano.domain.Pessoa;

@Configuration
@ComponentScan
public class Programa {
	public static void main(String[] args) {
		// Iniciando o container do Spring
		ApplicationContext context = new AnnotationConfigApplicationContext(Programa.class);
		
		// Instanciar Objeto Pessoa sem a necessidade do new
		Pessoa pessoa = context.getBean(Pessoa.class);
		
		pessoa.setNome("Eduardo");
		pessoa.setIdade(32);
		
		System.out.println(pessoa);
	}
}
