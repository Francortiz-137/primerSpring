package cl.praxis.primerspring.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Persona {
    @Id
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String spellido, int edad) {
        this.nombre = nombre;
        this.apellido = spellido;
        this.edad = edad;
    }
}
