import java.util.Scanner;
public class PascalsTriangle1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of lines of The pascal's triangle you want: ");
        while(!sc.hasNextInt()){
            System.out.print("Sorry! it should be an integer please.Try again: ");
            sc.next();
        }

        int N = sc.nextInt();
        triangle(N);
    }
    public static int factorial(int n){
        int res = 1;
        for(int j = 2; j <= n; j++)
            res *= j;
        return res;
    }
    public static int combinaton(int n, int r){
        return  factorial(n)/(factorial(n - r) * factorial(r));
    }
    public static void triangle(int N){
        for(int i = 0; i <= N; i++){
            for(int j = 0; j <= N - i; j++)
                System.out.print("  ");
            for(int k = 0; k <= i; k++)
                System.out.printf("%4d",combinaton(i, k));
            System.out.println();
        }
    } 
}
