package com.chapter4;


import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class TestTukShop
{
    private SmallBusiness business;
    private TukShop shop;

    @Before
    public void setUp()
    {

        business = new TukShop("Hoossen","123", 50);
    }

    @Test
    public void testAmount()
    {
        Assert.assertEquals(50, business.getLoanAmount(), 0.0f);
    }

    @Test
    public void testLoan()
    {
        Assert.assertEquals(5, business.LoanAmount(), 0.0f);
    }
}