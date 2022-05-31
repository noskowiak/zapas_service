package pl.zapas.zapas_service.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class MonthlySaleDto {
    private String symbol;
    private String name;
    private BigDecimal sale30Days;

}
