import java.util.Scanner;
public class SumOfFirst_N_FibonacciNumbers{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of N to find the sum of the first N Fibonacci numbers: ");
    while(!sc.hasNextInt()){
        System.out.print("Sorry! it should be an integer please.Try again: ");
        sc.next();
    }

    int N = sc.nextInt();
    System.out.println("The sum of the first "+N+" Fibonacci numbers = "+sumFib(N));
    }
    public static int sumFib(int N){
        if(N == 0)return 0;
        if(N == 1)return 1;
        N += 2;
        int prev1 = 1,prev2 = 0,current = 0;
        for(int i = 2; i <= N; i++){
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current - 1;
    }
}
