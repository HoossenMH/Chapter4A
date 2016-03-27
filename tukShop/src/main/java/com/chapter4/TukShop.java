package com.chapter4;

public class TukShop extends SmallBusiness
{
    public TukShop(String nm, String regNum, double amount)
    {
        super(nm, regNum, amount);

    }

    @Override
    public double LoanAmount()
    {
        return super.getLoanAmount() * 0.10;
    }

}