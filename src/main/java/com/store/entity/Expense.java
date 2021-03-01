package com.store.entity;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name="expense")
public class Expense  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "productid")
    private String productId;

    @Column(name = "unitprice")
    private Double unitPrice;

    @Column(name = "qty")
    private Double qty;


}

