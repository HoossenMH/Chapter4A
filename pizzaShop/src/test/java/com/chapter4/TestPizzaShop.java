package com.chapter4;


import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class TestPizzaShop
{
    private SmallBusiness business;
    private PizzaShop shop;

    @Before
    public void setUp()
    {

        business = new PizzaShop("Hasan","132", 50);
    }

    @Test
    public void testAmount()
    {
            Assert.assertEquals(50, business.getLoanAmount(), 0.0f);
    }

    @Test
    public void testLoan()
    {
        Assert.assertEquals(2.5, business.LoanAmount(), 0.0f);
    }
}