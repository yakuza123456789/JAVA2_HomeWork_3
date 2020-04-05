package com.company;

public class BankAccount {
    private double amount;

    public double getAmount(){
        return amount;
    }


    public double deposit(double sum){
        amount = amount + sum;
        System.out.println("Вы положили в банк " + amount);
        System.out.println("Ваш счет в банке "+ amount);
        return amount;
    }

    public int withDraw(int sum) throws LimitException{
        System.out.println("Вы сняли " + sum);
        amount = amount - sum;
        if (sum > amount){
            throw new LimitException("Не хватает денежных стредств ", getAmount());
        }
        return sum;
    }

}
