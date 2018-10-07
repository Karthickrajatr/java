import java.util.*;
public class count_string
 {  
 public static void main(String[] args) 
 {
   Scanner ka=new Scanner(System.in);
		String test;
    test=ka.next();
		count(test);
	}
	public static void count(String x)
  {
		char[] ch = x.toCharArray();
		int letter = 0;
		for(int i = 0; i < x.length(); i++)
    {
			if(Character.isLetter(ch[i]))
      {
				letter ++ ;
			}
		}
		System.out.println("" + letter);
			}
}
