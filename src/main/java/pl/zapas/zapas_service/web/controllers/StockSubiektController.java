package pl.zapas.zapas_service.web.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.zapas.zapas_service.dtos.StockSubiektDto;
import pl.zapas.zapas_service.service.StockSubiektService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/stock-subiekt")
public class StockSubiektController {

    private final StockSubiektService stockSubiektService;

    @GetMapping
    public ResponseEntity<List<StockSubiektDto>> gatAllStockSubiekt() {return ResponseEntity.ok(stockSubiektService.findAll());}


}
