import java.util.Scanner;
public class PascalsTriangle2{
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
    public static void triangle(int N){
        for(int i = 0; i <= N; i++){
            for(int j = 0; j <= N - i; j++)
                System.out.print("  ");
            int C = 1;
            for(int k = 0; k <= i; k++){
                System.out.printf("%4d",C);
                C = C * (i - k)/(k + 1);
            } 
            System.out.println();
        }
    } 
}
