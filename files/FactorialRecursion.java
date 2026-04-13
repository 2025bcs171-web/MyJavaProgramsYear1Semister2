import java.util.Scanner;
public class FactorialRecursion{
    public static long factorial(long x){
        return (x == 0)? 1 : x * factorial(x - 1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long x = sc.nextLong();
        long temp = x;
        long z = factorial(x);
        System.out.println(temp+"! = "+z);
    }
}
