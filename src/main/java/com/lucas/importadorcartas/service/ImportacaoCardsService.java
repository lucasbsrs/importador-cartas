package com.lucas.importadorcartas.service;

import com.lucas.importadorcartas.integration.client.YgoProClient;
import com.lucas.importadorcartas.integration.response.ImportacaoCartaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImportacaoCardsService {

    @Autowired
    private YgoProClient ygoProClient;

    public ImportacaoCartaResponse importarTodasCartas() {
        ImportacaoCartaResponse cartasImportadas = ygoProClient.buscarTodasCartas();

        return cartasImportadas;
    }

}