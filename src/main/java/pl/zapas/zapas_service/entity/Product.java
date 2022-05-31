package pl.zapas.zapas_service.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vw_krzymark_marcin_towary")
public class Product {

    @Id
    @Column(name = "tw_Id")
    private int id;
    @Column(name = "tw_Symbol")
    private String symbol;
    @Column(name = "tw_Nazwa")
    private String name;

}
