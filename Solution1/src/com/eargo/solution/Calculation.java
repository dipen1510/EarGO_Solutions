package com.eargo.solution;

import java.util.LinkedHashMap;

public class Calculation {
	
public static LinkedHashMap<String,Integer> calculateChange(int amount){
        
        /* LinkedHashMap for order*/
        LinkedHashMap<String,Integer> ans = new LinkedHashMap<String,Integer>();
         
        if(amount >= 25){
            ans.put("quaters",amount/25);
            amount = amount%25 > 0 ? amount%25 : amount;
        }
        else
            ans.put("quaters",0);
        
        if(amount >= 10){
            ans.put("dimes",amount/10);
            amount = amount%10 > 0 ? amount%10 : amount;
        }else
            ans.put("dimes",0);
        
        if(amount >=5){
            ans.put("nickels",amount/5);
            amount = amount%5 > 0 ? amount%5 : amount;
        }else
            ans.put("nickels",0);
        
        if(amount>=1){
            ans.put("pennies",amount);
        }else
            ans.put("pennies",0);
        
        return ans;
    }

}
