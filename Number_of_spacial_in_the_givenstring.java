import java.util.*;
import java.io.*;  
class Number_of_spacial_in_the_givenstring
{ 
    public static void main(String args[]) 
    { 
      Scanner ka=new Scanner(System.in);
        String str;
        str=ka.next();
        int upper = 0, lower = 0, number = 0, special = 0; 
  
        for(int i = 0; i < str.length(); i++) 
        { 
            char ch = str.charAt(i); 
            if (ch >= 'A' && ch <= 'Z') 
                upper++; 
            else if (ch >= 'a' && ch <= 'z') 
                lower++; 
            else if (ch >= '0' && ch <= '9') 
                number++; 
            else
                special++; 
        } 
        System.out.println("" + special); 
    } 
} 