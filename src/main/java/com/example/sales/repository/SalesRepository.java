package com.example.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sales.entity.Sales;

public interface SalesRepository extends JpaRepository<Sales, Long> {
}