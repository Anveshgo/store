package com.store.serviceimpl;

import java.util.List;
import java.util.Optional;

import com.store.entity.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.store.repository.ExpenseRepository;
import com.store.service.ExpenseService;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	private ExpenseRepository expenseRepository;

	@Transactional
	public Expense getExpense(String productId) {
		Optional<Expense> response = expenseRepository.findAllByProductId(productId);
		Expense getResponse = response.get();
		return getResponse;
	}

	@Transactional
	public List<Expense> getAllExpense() {
		List<Expense> response = expenseRepository.findAll();
		return response;
	}

}
