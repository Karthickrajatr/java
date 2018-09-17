import java.util.Scanner;
  
class GetASCII
{
    public static void main(String args[])
    {
        char ch;
        short asciiValue;
         
        Scanner SC=new Scanner(System.in);
         
        System.out.print("Enter a character: ");
        ch=SC.next().charAt(0);
         
        asciiValue= (short)ch;
        System.out.println("The ASCII value of " + ch + " is " + asciiValue);
         
    }
}