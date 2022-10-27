package com.vishal.strings;

import java.util.HashMap;
import java.util.Map;

class Solution 
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		int res = s.romanToInt("VCMXCIV");
		System.out.println("res =" + res);
	}
	
	 public int romanToInt(String s) 
	    {
	        int result = 0, tempVal=0;
	        char temp;
	        for(int i=0; i<s.length() ; i++)
	        {
	            temp = s.charAt(i);
	            tempVal = getValue(temp);
	            
	            System.out.println("temp and tempVal = "+temp+"  "+" tempVal " + tempVal);
	            
	            if(i < (s.length()-1) && tempVal < getValue(s.charAt(i+1)))
	            {
	                result -= tempVal;
	                System.out.println("iF result and tempVal = " + result +" "+tempVal);
	            }
	            else
	            {
	                result += tempVal;
	                System.out.println("ELSE result and tempVal = " + result +" "+tempVal);
	            }
	            System.out.println("result and tempVal = " + result +" "+tempVal);
	        }
	        return result;
	    }
	    
	    public int getValue(char input)
	    {
	        int returnVal = 0;
	        System.out.println("in func input = " + input);
	        
	        switch (input)
	        {
	             case 'I':
	                 returnVal=1;
	                    break;
	             case 'V':
	                 returnVal=5;
	                    break; 
	              case 'X':
	                returnVal=10;
	                    break; 
	               case 'L':
	                   returnVal=50;
	                    break;
	               case 'C':
	                  returnVal=100;
	                    break;
	               case 'D':
	                returnVal=500;
	                    break;
	              case 'M':
	                returnVal=1000;
	                    break;
	                default:
	                	break;
	                
	        }
	        System.out.println("returnVal = " + returnVal);
	        return returnVal;
	    }
}