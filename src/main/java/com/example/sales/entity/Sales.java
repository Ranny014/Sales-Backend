package com.example.sales.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "sales_data")
public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String invoice;
    private LocalDate date;
    private String customer;

    @Column(name = "item_code")
    private String itemCode;

    private Integer sales;

    // ✅ WAJIB ADA
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getInvoice() { return invoice; }
    public void setInvoice(String invoice) { this.invoice = invoice; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getCustomer() { return customer; }
    public void setCustomer(String customer) { this.customer = customer; }

    public String getItemCode() { return itemCode; }
    public void setItemCode(String itemCode) { this.itemCode = itemCode; }

    public Integer getSales() { return sales; }
    public void setSales(Integer sales) { this.sales = sales; }
}