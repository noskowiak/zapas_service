package pl.zapas.zapas_service.mapper;


import org.springframework.stereotype.Component;
import pl.zapas.zapas_service.dtos.StockSubiektDto;
import pl.zapas.zapas_service.entity.StockSubiekt;

@Component
public class StockSubiektMapper {
    public StockSubiektDto toDto(StockSubiekt stockSubiekt) {
        return new StockSubiektDto(
                stockSubiekt.getSymbol(),
                stockSubiekt.getName(),
                stockSubiekt.getStock()
        );
    }
}
