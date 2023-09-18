package co.edu.uniquindio.tienda.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter

public class Mensaje implements Serializable {

    @Id
    private int codigo;
    private LocalDateTime fechaCreacion;
    private String mensaje;

    @ManyToOne
    private PQRS msjPQRS;

   /* @ManyToOne
    private Cuenta codCuenta;*/

}
