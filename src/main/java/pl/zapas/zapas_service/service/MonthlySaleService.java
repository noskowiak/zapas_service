package pl.zapas.zapas_service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pl.zapas.zapas_service.dtos.MonthlySaleDto;
import pl.zapas.zapas_service.mapper.MonthlySaleMapper;
import pl.zapas.zapas_service.repository.MonthlySaleRepository;


import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MonthlySaleService {

    private final MonthlySaleRepository monthlySaleRepository;
    private final MonthlySaleMapper monthlySaleMapper;


    public List<MonthlySaleDto> findAll() {
        return monthlySaleRepository.findAll()
                .stream()
                .map(monthlySaleMapper::toDto)
                .collect(Collectors.toList());
    }

    public MonthlySaleDto loadMonthlyBySymbol(final String symbol) {
        return monthlySaleMapper.toDto(monthlySaleRepository.findMonthlySaleBySymbol(symbol));
    }

   /* public String loadProductBySymbol(final String symbol) {
        return monthlySaleRepository.findProductBySymbol(symbol)
                .map(Product::getSymbol)
                .orElseThrow();
    }*/

}
