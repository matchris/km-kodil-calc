package com.kodilla.kalkulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class Calculator {

    double a;
    double b;

    public void addNumbers(double a, double b){
        System.out.println("Adding two numbers " + a + " and " + b);
        System.out.println("The sum is: " + a+b);
    }

    public void substrNumbers(double a, double b){
        System.out.println("Substract two numbers " + a + " and " + b);
        System.out.println("The difference of two numbers: " + (a-b));
    }

    public static void main(String[] args) {
        SpringApplication.run(Calculator.class, args);}{

        a=3444.33;
        b=2223.11;
        addNumbers(a,b);
        substrNumbers(a,b);
    }

}




