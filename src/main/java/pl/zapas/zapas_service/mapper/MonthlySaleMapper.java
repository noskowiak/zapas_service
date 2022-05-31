package pl.zapas.zapas_service.mapper;


import org.springframework.stereotype.Component;
import pl.zapas.zapas_service.dtos.MonthlySaleDto;
import pl.zapas.zapas_service.entity.MonthlySale;

@Component
public class MonthlySaleMapper {
    public MonthlySaleDto toDto(MonthlySale monthlySale) {
         return new MonthlySaleDto(
                 monthlySale.getSymbol(),
                 monthlySale.getName(),
                 monthlySale.getSales()
         );
    }
}
