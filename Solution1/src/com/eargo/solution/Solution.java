package com.eargo.solution;

import java.util.LinkedHashMap;

public class Solution {
    
    public static void main(String[] args) {
        
        LinkedHashMap<String,Integer> ans = new LinkedHashMap<String,Integer>();
        
        ans = Calculation.calculateChange(83);
        System.out.print("Amount 83cent : ");
        ans.forEach((key,value) -> {
            if(key == "quaters")
                System.out.print(value + " " + key);
            else if(key == "pennies")
                System.out.println(", and " + value + " " + key);
            else
                System.out.print(", " + value + " " + key);
        });
        
        ans = Calculation.calculateChange(189);
        System.out.print("Amount 189cent : ");
        ans.forEach((key,value) -> {
            if(key == "quaters")
                System.out.print(value + " " + key);
            else if(key == "pennies")
                System.out.println(", and " + value + " " + key);
            else
                System.out.print(", " + value + " " + key);
        });
        
        ans = Calculation.calculateChange(0);
        System.out.print("Amount 0cent : ");
        ans.forEach((key,value) -> {
            if(key == "quaters")
                System.out.print(value + " " + key);
            else if(key == "pennies")
                System.out.println(", and " + value + " " + key);
            else
                System.out.print(", " + value + " " + key);
        });
        
        ans = Calculation.calculateChange(9);
        System.out.print("Amount 9cent : ");
        ans.forEach((key,value) -> {
            if(key == "quaters")
                System.out.print(value + " " + key);
            else if(key == "pennies")
                System.out.println(", and " + value + " " + key);
            else
                System.out.print(", " + value + " " + key);
        });
        
    }
}