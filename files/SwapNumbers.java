import java.util.Scanner;
public class SwapNumbers{
    //This swapping technique isn't memory efficient because the array used consumes memory. 
    /*public static int[] swap(int x, int y){
        return new int[]{y, x};
    }*/
    //This method uses bitwise 0XOR, it's very efficient because no extra memory requirement.
    public static void Swap(int x, int y){
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swaping, X = "+x+" and Y = "+y);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = 0;int y = 0;
        System.out.println("Enter two numbers: ");
        for(int i = 0; i < 2; i++){
            System.out.print("Enter number "+(i + 1)+" : ");
            if(i == 0)
              x = sc.nextInt();
            else
              y = sc.nextInt();
        }
        System.out.println("Original X = "+x+" and original Y = "+y);
        //int[] result = swap(x, y);
        //System.out.println("After swaping, X = "+result[0]+" and Y = "+result[1]);
        Swap(x, y);
    }
}
