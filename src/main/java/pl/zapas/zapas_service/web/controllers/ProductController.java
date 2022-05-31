package pl.zapas.zapas_service.web.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.zapas.zapas_service.dtos.ProductDto;
import pl.zapas.zapas_service.entity.Product;
import pl.zapas.zapas_service.service.ProductService;


import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

private  final ProductService productService;

    @GetMapping
    public ResponseEntity<List<ProductDto>> gatAllProducts() {
        return ResponseEntity.ok(productService.findAll());
    }

    @GetMapping("/{symbol}")
    public ResponseEntity<Product> getProductBySymbol(@PathVariable String symbol) {
        return ResponseEntity.ok(productService.loadProductBySymbol(symbol));
    }

}
