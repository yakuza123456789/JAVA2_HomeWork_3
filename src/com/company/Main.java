package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAzamat = new BankAccount();
        bankAzamat.deposit(10000);

        while (true){
            try {
                bankAzamat.withDraw(5000);
                System.out.println("Ваш баланс состовляет: " + bankAzamat.getAmount());
            } catch (LimitException le){
                System.out.println("На вашем балансе: " + bankAzamat.getAmount());
                double amount = bankAzamat.getAmount();
                if (bankAzamat.getAmount() >= bankAzamat.getAmount())
                    System.out.println("Вы сняли остаток суммы "+amount);
                    amount = le.getRemainigAmount() - le.getRemainigAmount();
                System.out.println("Ваш баланс составляет:" + amount);
                break;
            }
        }
    }
}
