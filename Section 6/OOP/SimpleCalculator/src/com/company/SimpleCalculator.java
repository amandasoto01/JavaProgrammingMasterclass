package com.company;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;


    public void setFirstNumber(double first){
        this.firstNumber = first;
    }

    public void setSecondNumber(double second){
        this.secondNumber = second;
    }
    public double getFirstNumber(){
        return this.firstNumber;
    }

    public double getSecondNumber(){
        return this.secondNumber;
    }

    public double getAdditionResult(){
        return this.firstNumber+this.secondNumber;
    }

    public double getSubtractionResult(){
        return this.secondNumber - this.firstNumber;
    }

    public double getMultiplicationResult(){
        return this.secondNumber*this.firstNumber;
    }

    public double getDivisionResult(){
        if(this.secondNumber==0){
            return 0;
        }
        return this.firstNumber/this.secondNumber;
    }
}
