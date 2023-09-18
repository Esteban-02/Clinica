package co.edu.uniquindio.tienda.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
public class Atencion implements Serializable {

    @Id
    private int codigo;
    private String diagnotisco;
    private String tratamiento;
    private String notasMedicas;

    @OneToOne
    private Cita codCita;
}
