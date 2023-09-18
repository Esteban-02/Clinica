package co.edu.uniquindio.tienda.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter

public class DiaLibre implements Serializable {

    @Id
    private int codigo;
    private LocalDate dia;

    @ManyToOne
    private Medico codMedicoDia;

}
