package com.example.Products.models;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productid;
    @Column(name = "productname")
    private String productname;
    @Column(name = "productdescription")
    private String description;
    @Column(name = "price")
    private int price;
    @Column(name = "discount")
    private int discount;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="supplierid")
    private Supplier supplier;

    public Product(String productname, String description, int price, int discount) {
        this.productname = productname;
        this.description = description;
        this.price = price;
        this.discount = discount;

    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }


}
