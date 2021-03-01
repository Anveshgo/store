package com.store.controller;

import com.store.entity.Expense;
import com.store.entity.Invoice;
import com.store.repository.ExpenseRepository;
import com.store.repository.InvoiceRepository;
import com.store.service.ExpenseService;
import com.store.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/invoice")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @Autowired
    private InvoiceRepository invoiceRepository;

    @GetMapping("/{id}")
    public Invoice getInvoice(@PathVariable Long id) {
        Invoice getReponse = invoiceService.getInvoice(id);
        return getReponse;
    }

    @PostMapping("/save")
    public Invoice saveInvoice(@RequestBody Invoice invoice) {
        Invoice createResponse = invoiceService.save(invoice);
        return createResponse;
    }

}
