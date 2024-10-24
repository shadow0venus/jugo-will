package co.edu.umanizales.jugoo.model;

import java.util.List;

public class BebidaConAgua extends Bebida {

    public BebidaConAgua(List<Ingrediente> ingredientes, boolean azucar) {
        super(ingredientes, azucar);
    }

    @Override
    public String preparar() {
        return "Bebida con agua y ingredientes: " + getIngredientes() + " y " + (isAzucar() ? "con" : "sin") + " azúcar.";
    }
}

