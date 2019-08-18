package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("2019/WA/LK");

        Product mirror = new Product("mirror");
        Product table = new Product("table");
        Product chair = new Product("chair");

        Item mirrorItem = new Item(new BigDecimal("123998"), 10, new BigDecimal(1239980));
        mirrorItem.setProduct(mirror);
        mirrorItem.setInvoice(invoice);

        Item tableItem = new Item(new BigDecimal("12094"), 1, new BigDecimal(12094));
        tableItem.setProduct(table);
        tableItem.setInvoice(invoice);

        Item chairItem = new Item(new BigDecimal("321099"), 100, new BigDecimal(32109900));
        chairItem.setProduct(chair);
        chairItem.setInvoice(invoice);

        productDao.save(mirror);
        productDao.save(table);
        productDao.save(chair);

        mirror.getItems2().add(mirrorItem);
        table.getItems2().add(tableItem);
        chair.getItems2().add(chairItem);

        invoice.getItems().add(mirrorItem);
        invoice.getItems().add(tableItem);
        invoice.getItems().add(chairItem);

        //When
        invoiceDao.save(invoice);

        //Then
        int id = invoice.getId();
        Optional<Invoice> readInvoice = invoiceDao.findById(id);
        Assert.assertTrue(readInvoice.isPresent());

        //Cleanup
        invoiceDao.deleteById(id);
        productDao.deleteAll();
    }

}
