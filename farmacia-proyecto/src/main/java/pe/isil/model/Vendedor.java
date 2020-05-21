package pe.isil.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Vendedor {

    private Long id;
    private String nombre;
    private String lastNameFather;
    private String lastNameMother;
    private String cargo;
    private String direccion;
    private String telefono;



}
