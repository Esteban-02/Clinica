package co.edu.uniquindio.tienda.modelo;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter

public class Cita implements Serializable {
    @Id
    private int codigo;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaCita;
    private String motivo;

    @ManyToOne
    private Medico codMedicoCita;

    @OneToOne
    private Cita citas;

    @ManyToOne
    private Paciente listPaciente;

    @OneToMany(mappedBy = "codCita")
    private List<PQRS> listPQRS;

}
