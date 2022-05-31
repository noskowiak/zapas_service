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
@Table(name = "vw_krzymark_sprz_asort_30")
public class MonthlySale {

    @Column(name = "Nazwa")
    private String name;
    @Id
    @Column(name = "Symbol")
    private String symbol;
    @Column(name = "Grupa")
    private String group;
    @Column(name = "Ilość")
    private BigDecimal sales;
    @Column(name = "Brutto")
    private BigDecimal brutto;
    @Column(name = "Netto")
    private BigDecimal netto;



}
