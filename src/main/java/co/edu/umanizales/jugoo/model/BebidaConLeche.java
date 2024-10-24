package co.edu.umanizales.jugoo.model;

import java.util.List;

public class BebidaConLeche extends Bebida {

    public BebidaConLeche(List<Ingrediente> ingredientes, boolean azucar) {
        super(ingredientes, azucar);
    }

    @Override
    public String preparar() {
        return "Bebida con leche y ingredientes: " + getIngredientes() + " y " + (isAzucar() ? "con" : "sin") + " azúcar.";
    }
}

