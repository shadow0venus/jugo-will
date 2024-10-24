package co.edu.umanizales.jugoo.controller;

import co.edu.umanizales.jugoo.service.BebidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.Data;

import java.util.List;

@RestController
@RequestMapping("/api/bebida")
public class BebidaController {

    @Autowired
    private BebidaService bebidaService;

    @PostMapping("/preparar")
    public String prepararBebida(@RequestBody BebidaRequest request) {
        return bebidaService.prepararBebida(request.getIngredientes(), request.getBase(), request.isAzucar());
    }

    @Data
    static class BebidaRequest {
        private List<String> ingredientes; // lista de ingredientes
        private String base; // "agua" o "leche"
        private boolean azucar; // si quiere azúcar o no
    }
}

