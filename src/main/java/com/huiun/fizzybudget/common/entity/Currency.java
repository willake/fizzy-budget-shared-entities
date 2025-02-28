package com.huiun.fizzybudget.common.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name="currency", schema = "dbo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Currency implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "currency_id")
    private Long id;

    @Column(name = "currency_code", nullable = false, unique = true, length = 10)
    private String currencyCode;

    @Column(name = "currency_name", nullable = false, length = 50)
    private String currencyName;

    @Column(name = "currency_symbol", nullable = false, length = 5)
    private String currencySymbol;
}
