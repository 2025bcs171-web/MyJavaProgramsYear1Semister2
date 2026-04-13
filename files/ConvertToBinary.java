import java.util.Scanner;
public class ConvertToBinary{
    public static void Binary(int x){
        if(x == 0){
            System.out.println(x+" in binary = "+x);
            return;
        }
        int temp = x;
        int[] binary = new int[32];
        int i = 0;
        while(x > 0){
            binary[i++] = x % 2;
            x /= 2;
       }
       System.out.print(temp+" in binary = ");
       for(int j = i -1; j >= 0; j--)
           System.out.print(binary[j]+" ");
       System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Enter an Integer: ");
        x = sc.nextInt();
        Binary(x);
    }
}
