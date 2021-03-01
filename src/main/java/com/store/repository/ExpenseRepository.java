package com.store.repository;


import com.store.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Optional;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {

   Optional<Expense> findAllByProductId(String productId);

}
