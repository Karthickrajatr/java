import java.util.*;
public class Amstrong_between_2intervel{
    public static void main(String[] args) {
      Scanner ka=new Scanner(System.in);
        int low, high;
        low=ka.nextInt();
        high=ka.nextInt();
        for(int number = low + 1; number < high; ++number)
        {
            int digits = 0;
            int result = 0;
            int originalNumber = number;
            while (originalNumber != 0) {
                originalNumber /= 10;
                ++digits;
            }
            originalNumber = number;
            while (originalNumber != 0) {
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, digits);
                originalNumber /= 10;
            }
            if (result == number)
                System.out.print(number + " ");
        }
    }
}