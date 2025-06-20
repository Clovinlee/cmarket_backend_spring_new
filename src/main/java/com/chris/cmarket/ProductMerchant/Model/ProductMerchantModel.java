package com.chris.cmarket.ProductMerchant.Model;

import com.chris.cmarket.Merchant.Model.MerchantModel;
import com.chris.cmarket.Product.Model.ProductModel;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "products_merchants")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductMerchantModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_product", referencedColumnName = "id")
    private ProductModel product;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_merchant", referencedColumnName = "id")
    private MerchantModel merchant;
}
