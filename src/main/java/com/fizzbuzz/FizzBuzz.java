package com.fizzbuzz;

public class FizzBuzz {
    
    public void main(String[] args) {
        
        for (int i = 1; i <= 100; i++) {
            System.out.println(getFizzBuzz(i));
        }
    }
    
    public String getFizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } if (number % 3 == 0) {
            return "Fizz";
        } if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    } 

}
