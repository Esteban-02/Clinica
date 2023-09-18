package co.edu.uniquindio.tienda.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class Paciente extends Usuario implements Serializable {

    @Id
    private int codigo;
    private LocalDate fechaNacimiento;
    private String alergias;

    @OneToMany(mappedBy = "listPaciente")
    private List<Cita> lisCita;

}
