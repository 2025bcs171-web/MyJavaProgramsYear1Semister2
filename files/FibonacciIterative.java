import java.util.Scanner;
public class FibonacciIterative{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int x = sc.nextInt();
    int temp = x;
    int y = fibonacci(x);
    System.out.println("Fibonacci of "+temp+" = "+y);
    }
    public static int fibonacci(int x){
        if(x == 0)return 0;
        if(x == 1)return 1;
        int FirstPrevious = 1;
        int SecondPrevious = 0;
        int current = 0;
        for(int i = 2; i <= x; i++){
            current = FirstPrevious + SecondPrevious;
            SecondPrevious = FirstPrevious;
            FirstPrevious = current;
        }
        return current;
    }
}
