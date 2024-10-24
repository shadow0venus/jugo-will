package co.edu.umanizales.jugoo.service;

import co.edu.umanizales.jugoo.model.*;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BebidaService {

    public String prepararBebida(List<String> nombresIngredientes, String base, boolean azucar) {
        List<Ingrediente> ingredientes = nombresIngredientes.stream()
                .map(nombre -> {
                    if ("agua".equals(base) && (nombre.equals("banano") || nombre.equals("lulo") || nombre.equals("maracuya"))) {
                        return new Ingrediente(nombre, "agua");
                    } else if ("leche".equals(base) && (nombre.equals("manzana") || nombre.equals("fresa") || nombre.equals("mora"))) {
                        return new Ingrediente(nombre, "leche");
                    } else {
                        throw new IllegalArgumentException("Ingrediente no válido para la base seleccionada.");
                    }
                }).collect(Collectors.toList());

        Bebida bebida;
        if ("agua".equals(base)) {
            bebida = new BebidaConAgua(ingredientes, azucar);
        } else {
            bebida = new BebidaConLeche(ingredientes, azucar);
        }

        return bebida.preparar();
    }
}

