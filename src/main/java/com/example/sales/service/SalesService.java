package com.example.sales.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.sales.entity.Sales;
import com.example.sales.repository.SalesRepository;

@Service
public class SalesService {

    private final SalesRepository repo;

    public SalesService(SalesRepository repo) {
        this.repo = repo;
    }

    public List<Sales> getAll() {
        return repo.findAll();
    }
}