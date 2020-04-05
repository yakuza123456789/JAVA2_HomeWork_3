package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAzamat = new BankAccount();
        bankAzamat.deposit(10000);

        while (true){
           try {
               System.out.println("Ваш баланс состовляет: " +bankAzamat.getAmount());
               bankAzamat.withDraw(5000);
           }catch (LimitException le){
               System.out.println(le.getMessage());
               try {
                   bankAzamat.withDraw((int) bankAzamat.getAmount());
               } catch (LimitException l){
                   l.printStackTrace();
               }
               break;
           }

        }

        System.out.println("Остаток "+bankAzamat.getAmount());
    }
}
