package co.edu.umanizales.jugoo.model;

import lombok.Data;
import java.util.List;

@Data
public abstract class Bebida {
    private List<Ingrediente> ingredientes;
    private boolean azucar;

    public Bebida(List<Ingrediente> ingredientes, boolean azucar) {
        this.ingredientes = ingredientes;
        this.azucar = azucar;
    }

    public abstract String preparar();
}

