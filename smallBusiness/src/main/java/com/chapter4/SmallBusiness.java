package com.chapter4;

public abstract class SmallBusiness
{
    private String name;
    private String regNum;
    private double loanAmount;

    public SmallBusiness(String nm, String regNum, double amount)
    {
        name = nm;
        this.regNum = regNum;
        loanAmount = amount;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public abstract double LoanAmount();

}
