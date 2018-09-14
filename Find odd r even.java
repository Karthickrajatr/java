import java.util.*;

class Find odd r even{

    public static void main(String[] args) {

        Scanner ka= new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = ka.nextInt();

        if(num % 2 == 0)
        {
            System.out.println(num + " is even");
        }
        else
          {
              System.out.println(num + " is odd");
          }
    }
}


