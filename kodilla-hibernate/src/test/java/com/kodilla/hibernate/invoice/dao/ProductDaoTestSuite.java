/*
package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductDaoTestSuite {

    @Autowired
    private ProductDao productDao;

    @Test
    public void testProductDaoSave() {
        //Given
        Product mirror = new Product("mirror");
        Product table = new Product("table");
        Product chair = new Product("chair");

        //When
        productDao.save(mirror);
        int mirrorId = mirror.getId();
        productDao.save(table);
        int tableId = table.getId();
        productDao.save(chair);
        int chairId = chair.getId();

        //Then
        Assert.assertNotEquals(0,mirrorId);
        Assert.assertNotEquals(0,tableId);
        Assert.assertNotEquals(0,chairId);

        //Cleanup
        */
/*try {
            productDao.deleteById(mirrorId);
            productDao.deleteById(tableId);
            productDao.deleteById(chairId);
        } catch (Exception e) {
            //do nothing
        }*//*

    }
}
*/
