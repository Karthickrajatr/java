import java.util.*;
 class Main {
    public static void main(String[] args) {
        int first,second;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first value");
        first=sc.nextInt();
        System.out.println("enter the second value");
        second=sc.nextInt();
        System.out.println("before swap");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
        int temporary = first;
        first = second;
        second = temporary;
        System.out.println("After swap");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}