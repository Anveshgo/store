package com.store.repository;


import java.io.Serializable;
import java.util.Optional;

import com.store.entity.Expense;
import com.store.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Serializable> {
    Optional<Invoice> findById(Long id);
}

