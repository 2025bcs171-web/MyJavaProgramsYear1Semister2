import java.util.Scanner;
public class FibonacciRecursion{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int x = sc.nextInt();
    int temp = x;
    int y = fibonacci(x);
    System.out.println("Fibonacci of "+temp+" = "+y);
    }
    public static int fibonacci(int x){
        return (x == 0)? 0 : (x == 1)? 1 : fibonacci(x -1) + fibonacci(x -2);
    }
}
