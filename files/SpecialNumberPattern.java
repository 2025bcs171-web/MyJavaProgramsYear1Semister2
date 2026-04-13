import java.util.Scanner;
class SpecialNumberPattern{
    void pattern(int N){
        for(int i =1; i <= N; i++){
            for(int j = 1; j <= N -i; j++)
                System.out.print("   ");
            for(int k = 0; k < i; k++)
                System.out.printf("%3d",(i + k));
            for(int m = i - 2; m >= 0; m--)
                System.out.printf("%3d",(i + m));
            System.out.println();
        }
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    SpecialNumberPattern sp = new SpecialNumberPattern();
    System.out.print("Enetr N, the number of rows: ");
    while(!sc.hasNextInt()){
        System.out.print("Sorry! it should be an integer please.Try again: ");
        sc.next();
    }
    int N = sc.nextInt();
    sp.pattern(N);

    }
}
