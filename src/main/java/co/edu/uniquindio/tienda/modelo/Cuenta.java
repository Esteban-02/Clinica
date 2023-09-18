package co.edu.uniquindio.tienda.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Cuenta implements Serializable {

    @Id
    private int codigo;
    private String correo;
    private String contrasenia;

    /*@OneToMany(mappedBy = "codCuenta")
    private Mensaje listMensaje;*/




}
