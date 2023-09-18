package co.edu.uniquindio.tienda.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Medico extends Usuario implements Serializable {

    @Id
    private int codigo;

    @OneToMany(mappedBy = "codigoMedico")
    private List<Horario> listahorarios;

    @OneToMany(mappedBy = "codMedicoCita")
    private List<Cita> listaCitas;

    @OneToMany(mappedBy = "codMedicoDia")
    private List<DiaLibre> diaLibres;

}
