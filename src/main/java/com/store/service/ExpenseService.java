package com.store.service;

import com.store.entity.Expense;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ExpenseService {
	public Expense getExpense(String  productId);
	public List<Expense> getAllExpense();
}
