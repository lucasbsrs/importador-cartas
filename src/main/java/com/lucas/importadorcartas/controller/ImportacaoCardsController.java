package com.lucas.importadorcartas.controller;

import com.lucas.importadorcartas.integration.response.ImportacaoCartaResponse;
import com.lucas.importadorcartas.service.ImportacaoCardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/importacao")
public class ImportacaoCardsController {

    @Autowired
    private ImportacaoCardsService importacaoCardsService;

    @GetMapping("/card")
    public ResponseEntity<ImportacaoCartaResponse> importarTodasCartas() {
        ImportacaoCartaResponse cartasImportadas = importacaoCardsService.importarTodasCartas();

        return ResponseEntity.ok().body(cartasImportadas);
    }

}