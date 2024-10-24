package co.edu.umanizales.jugoo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ingrediente {
    private String nombre;
    private String tipo; // "agua" o "leche"
}

