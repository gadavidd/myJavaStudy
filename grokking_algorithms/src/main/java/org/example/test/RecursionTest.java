package org.example.test;

import org.example.main.Recursion;
import org.example.main.SelectionSort2;
import org.junit.Test;

import java.util.Arrays;

public class RecursionTest {

    @Test
    public void testRecursion1(){
        Recursion recursion = new Recursion();

        System.out.print(recursion.countdown(5));
    }
}
