package com.vishal.strings;

import java.util.HashMap;
import java.util.Map;

public class SubStringDemo {

	public static void main(String[] args) {
		String ransomNote = "aab";
		String magazine = "baa";
		
        for(int i = 0; i < ransomNote.length() ; i++)
        {
            char charOfRansomNot = ransomNote.charAt(i);
            System.out.println("charOfRansomNot = " + charOfRansomNot);
            
            int indexOfMagazine = magazine.indexOf(charOfRansomNot);
            System.out.println("indexOfMagazine = " + indexOfMagazine);
            
            if(indexOfMagazine == -1)
                System.out.println("false");
            
            System.out.println("magazine = " + magazine);
            System.out.println("magazine.substring(0, i) = " + magazine.substring(0, indexOfMagazine));
            System.out.println("magazine.substring(i + 1) = " + magazine.substring(indexOfMagazine + 1));
            magazine = magazine.substring(0, indexOfMagazine) + magazine.substring(indexOfMagazine + 1);
            
            System.out.println("magazine = " + magazine);
        }
        
        System.out.println("false");
        
        Map<Character, Integer> letters = new HashMap<>();
        
        for(int i = 0; i < magazine.length() ; i++)
        {
            char charOfMagazine = magazine.charAt(i);
            
            
        }
        
        String s = "IV";

            {
                Map<Character, Integer> romans = new HashMap<Character,Integer>();
                
                romans.put('I',1);
                romans.put('V',5);
                romans.put('X',10);
                romans.put('L',50);
                romans.put('C',100);
                romans.put('D',500);
                romans.put('M',1000);
                
                int result;
                int value=0;
                
                for(int i = 0; i < s.length() ; i++)
                {
                    
                    char temp = s.charAt(i);
                    if(temp == 'I' || temp == 'X' || temp == 'C')
                    {
                        char nextChar = s.charAt(i+1);
                        if(temp == 'I')
                        {
                            if(nextChar=='V')
                                value=4;
                            if(nextChar=='X')
                                value=9;
                        }
                        else 
                            value=1;
                        
                        if(temp == 'X')
                        {
                            if(nextChar=='L')
                                value=40;
                            if(nextChar=='C')
                                value=90;
                        }
                        else
                            value=10;
                        
                        if(temp == 'C')
                        {
                            if(nextChar=='D')
                                value=400;
                            if(nextChar=='M')
                                value=900;
                        }  
                        else
                            value=100;
                    }
                    else
                    {
                        value = romans.get(temp);
                    }
                    value += value;
                }
            }
	}
}
