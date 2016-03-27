package com.chapter4;

public class PizzaShop extends SmallBusiness
{
    public PizzaShop(String nm, String regNum, double amount)
    {
        super(nm, regNum, amount);

    }

    @Override
    public double LoanAmount()
    {
        return super.getLoanAmount() * 0.05;
    }

}
