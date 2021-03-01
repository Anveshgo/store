package com.store.serviceimpl;


import com.store.entity.Expense;
import com.store.entity.Invoice;
import com.store.repository.InvoiceRepository;
import com.store.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Transactional
    public Invoice save(Invoice invoice) {
        Invoice createResponse = invoiceRepository.save(invoice);
        return createResponse;
    }

    @Transactional
    public Invoice getInvoice(Long id) {
        Optional<Invoice> response = invoiceRepository.findById(id);
        Invoice getResponse = response.get();
        return getResponse;
    }
}

