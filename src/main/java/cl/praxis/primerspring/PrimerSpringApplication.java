package cl.praxis.primerspring;

import cl.praxis.primerspring.entities.Persona;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimerSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrimerSpringApplication.class, args);
        Persona persona = new Persona("AlumnoNombre","AlumnoApellido",20);
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Apellido: "+persona.getApellido());
        System.out.println("Edad: "+persona.getEdad());
    }

}
