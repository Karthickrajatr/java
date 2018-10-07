import java.util.*;
class count_number_of_word
{
public static void main(String[] args)
{
  Scanner ka=new Scanner(System.in);
  int word=1;
  String str;
  str=ka.next();
  for(int i=0;i<str.length();++i)
  {
   if(str.charAt(i)==' ')
    word++;
  }
 
  System.out.println(""+word);
}
}