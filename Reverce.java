import java.util.*;
class Reverce
{
	public static void main (String[] args)
	{
		String s;
Scanner ka=new Scanner(System.in);
System.out.println("enter the char");
s=ka.next();
		char[] chars = new StringBuilder(s).reverse().toString().toCharArray();
		for (char ch : chars) {
			System.out.print(ch);
		}
	}
}