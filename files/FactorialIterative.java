import java.util.Scanner;
public class FactorialIterative{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        long x = sc.nextLong();
        long temp = x;
        long y = factorial(x);
        System.out.println(temp+"! = "+y);
    }
    public static long factorial(long x){
        long res = 1;
        int i;
        for(i = 2; i <= x; i++)
            res *= i;
        return res;
    }
}

