package com.store.controller;

import java.util.List;

import com.store.entity.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.store.repository.ExpenseRepository;
import com.store.service.ExpenseService;

@RestController
@RequestMapping("/expense")
public class ExpenseController {

	@Autowired
	private ExpenseService expenseService;

	@Autowired
	private ExpenseRepository expenseRepository;

	@GetMapping("/all")
	public List<Expense> getExpense() {
		List<Expense> getReponse = expenseService.getAllExpense();
		return getReponse;
	}

	@GetMapping("/{productId}")
	public Expense getExpense(@PathVariable String productId) {
		Expense getReponse = expenseService.getExpense(productId);
		return getReponse;
	}

}
