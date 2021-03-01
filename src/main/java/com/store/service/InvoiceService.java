package com.store.service;

import com.store.entity.Expense;
import com.store.entity.Invoice;
import org.springframework.stereotype.Component;

@Component
public interface InvoiceService {
    public Invoice save(Invoice invoice);
    public Invoice getInvoice(Long  id);
}
