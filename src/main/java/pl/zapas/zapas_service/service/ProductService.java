package pl.zapas.zapas_service.service;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pl.zapas.zapas_service.dtos.ProductDto;
import pl.zapas.zapas_service.entity.Product;
import pl.zapas.zapas_service.repository.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<ProductDto> findAll() {
        return productRepository.findAll()
                .stream()
                .map(product -> new ProductDto(
                        product.getName(),
                        product.getSymbol()))
                .collect(Collectors.toList());
    }

    public Product loadProductBySymbol(final String symbol) {
        return productRepository.findProductBySymbol(symbol);
    }

}
