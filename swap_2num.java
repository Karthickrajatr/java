import java.util.*;
import java.io.*;  
class Main
{ 
    public static void main(String args[]) 
    { 
      Scanner ka=new Scanner(System.in);
        int firstNumber, secondNumber, temporaryVariable;
       firstNumber=ka.nextInt();
       secondNumber=ka.nextInt();
      temporaryVariable = firstNumber;
      firstNumber = secondNumber;
      secondNumber = temporaryVariable;
      System.out.println(""+firstNumber);
      System.out.println(""+ secondNumber);

    } 
} 