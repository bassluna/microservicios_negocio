package inicio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages={"controller","dao","entity","service",})
@EntityScan(basePackages= {"entity"})
@EnableJpaRepositories(basePackages={"dao"})
@SpringBootApplication
public class MicroserviciosNegocioApplication implements CommandLineRunner{

//	@Autowired
//	private ClienteJpaSpring repoCliente;
//	
//	@Autowired
//	private PersonaJpaSpring repoPersona;
	
	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosNegocioApplication.class, args);
	}
	
	public void run(String... args) throws Exception{
		System.out.println("Ejemplos de Spring Data JPA");
//		guardar();
	}

	/*
	private void guardar() {
		/*
		Persona persona =  new Persona();
		persona.setNombre("Maria Lemus");
		persona.setDireccion("Independencia 1506");
		persona.setGenero("femenino");
		persona.setEdad(28);
		persona.setTelefono("7080708070");

		repoPersona.save(persona);
		System.out.println("contenido Persona:" + persona);
	
	*/
	
//	private void modificar() {
//		Optional<Cliente> clientes = repoCliente.findById(3);
//		if(clientes.isPresent()) {
//			Cliente tmpCliente=clientes.get();
//			tmpCliente.setEstado(0);
//			tmpCliente.setPassword("xyz");
//			repoCliente.save(tmpCliente);
//			System.out.println(clientes.get());
//		}else {
//			System.out.println("Fallo en actualizacion");
//		}
//	}


}
