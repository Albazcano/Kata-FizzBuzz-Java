package com.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;


public class FizzBuzzTest {
    
    @Test
    public void test_fizzbuzz_example() {
        assertEquals(2, 2);
    }

    @Test
    public void test_divisibleBy3(){
     FizzBuzz divisor = new FizzBuzz(); 
     String message =  divisor.getFizzBuzz(3);
     assertEquals("Fizz",message);  
    }
    
    @Test
    public void test_divisibleBy5(){
     FizzBuzz divisor = new FizzBuzz(); 
     String message =  divisor.getFizzBuzz(5);
     assertEquals("Buzz",message);  
    }

    @Test
    public void test_divisibleBy3and5(){
     FizzBuzz divisor = new FizzBuzz(); 
     String message =  divisor.getFizzBuzz(15);
     assertEquals("FizzBuzz",message);  
    }

    @Test
    public void not_divisible(){
     FizzBuzz divisor = new FizzBuzz(); 
     String message =  divisor.getFizzBuzz(8);
     assertEquals("8",message);  
    }
}

