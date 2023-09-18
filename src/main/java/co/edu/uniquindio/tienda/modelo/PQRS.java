package co.edu.uniquindio.tienda.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class PQRS implements Serializable {

    @Id
    private int codigo;
    private LocalDateTime fechaCreacion;
    private String tipo;
    private String motivo;

    @ManyToOne
    private Cita codCita;

    @OneToMany(mappedBy ="msjPQRS")
    private List<Mensaje> listMensajes;


}
