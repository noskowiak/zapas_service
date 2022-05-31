package pl.zapas.zapas_service.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import pl.zapas.zapas_service.entity.MonthlySale;

public interface MonthlySaleRepository extends JpaRepository<MonthlySale, String> {
   // Optional<Product> findProductBySymbol(String symbol);

    MonthlySale findMonthlySaleBySymbol(String symbol);

}
