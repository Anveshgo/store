package com.store.entity;


import javax.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Entity
@Data
@Table(name="invoice")
public class Invoice implements Serializable {
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

    @Column(name = "total")
    private Double total;


}


