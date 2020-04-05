package com.company;

public class LimitException extends Exception{

    private double remainigAmount;

    public LimitException(String message, double remainigAmount){
    super(message);
    this.remainigAmount = remainigAmount;
    }

    public double getRemainigAmount(){
        return remainigAmount;
    }

}
