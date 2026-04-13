import java.util.Scanner;
public class AddTwoNumbers{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int x = 0;int y = 0;
        System.out.println("Enter two integers: ");
        for(int i = 0; i < 2; i++){
             System.out.print("Enter integer "+(i + 1)+" : ");
             if(i == 0)
                  x = sc.nextInt();
             else
                  y = sc.nextInt();
        }
        System.out.println("The sum of "+x+" and "+y+" = "+ (x + y));
    }
}
