package com.lucas.importadorcartas.integration.client;

import com.lucas.importadorcartas.integration.response.ImportacaoCartaResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "ygopro", url = "${ygopro.url}")
public interface YgoProClient {

    @GetMapping
    ImportacaoCartaResponse buscarTodasCartas();

}
