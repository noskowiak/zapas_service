package pl.zapas.zapas_service.repository;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.zapas.zapas_service.entity.StockSubiekt;
@Repository
public interface StockSubiektRepository extends JpaRepository<StockSubiekt, String> {

    StockSubiekt findStockSubiektBySymbol(String symbol);
}
