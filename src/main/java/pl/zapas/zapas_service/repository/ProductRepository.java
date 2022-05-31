package pl.zapas.zapas_service.repository;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.zapas.zapas_service.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

    Product findProductBySymbol(String symbol);
}
