package pl.zapas.zapas_service.service;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pl.zapas.zapas_service.dtos.StockSubiektDto;
import pl.zapas.zapas_service.mapper.StockSubiektMapper;
import pl.zapas.zapas_service.repository.StockSubiektRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StockSubiektService {

    private final StockSubiektRepository stockSubiektRepository;
    private final StockSubiektMapper stockSubiektMapper;

    public List<StockSubiektDto> findAll() {
        return stockSubiektRepository.findAll()
                .stream()
                .map(stockSubiektMapper::toDto)
                .collect(Collectors.toList());

    }

}
