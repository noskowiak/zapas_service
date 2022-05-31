package pl.zapas.zapas_service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vw_krzymark_marcin_stany")
public class StockSubiekt {

    @Id
    @Column(name = "Id")
    private int id;
    @Column(name = "Stan")
    private BigDecimal stock;
    @Column(name = "Symbol")
    private String symbol;
    @Column(name = "Nazwa")
    private String name;
    @Column(name = "Rezerwacja")
    private BigDecimal booked;

}
