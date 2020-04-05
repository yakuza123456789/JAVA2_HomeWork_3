package com.company;

public class BankAccount {
    private double amount;

    public double getAmount(){
        return amount;
    }


    public double deposit(double sum){
        amount = amount + sum;
        return amount;
    }

    public int withDraw(int sum) throws LimitException{

        if (sum > amount){
            throw new LimitException("Не хватает денежных стредств "+sum, amount);
        }
        amount = amount - sum;
        return sum;
    }

}
