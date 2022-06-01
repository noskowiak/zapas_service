package pl.zapas.zapas_service.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDto {
    private String symbol;
    private String name;

}
