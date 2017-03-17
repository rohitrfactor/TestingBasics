package com.nagpal.garorasu.testingbasics;

/**
 * Created by garorasu on 17/3/17.
 */
public class Calculator {

    public double sum(double a, double b){
        return a+b;
    }

    public double subtract(double a, double b){
        return a-b;
    }

    public double divide(double a, double b){
        if(b!=0){
            return a/b;
        }
        return 0;
    }

    public double multiply(double a, double b){
        return a*b;
    }
}
