import java.io.*;
public class Practice{
    public static void main(String [] args)throws IOException{
        Prompt p = new Prompt();
        p.add(); 
       // p.sub(); 
       // p.CaseConvertName();
      

    }
}
class Prompt{
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    public void add() throws IOException{
        int arr[] = new int[2];
        System.out.println("Enter two integers: ");
        for(int i = 0;i<2;i++){
            System.out.println("Integer " + (i + 1) + ": ");
            arr[i] = Integer.parseInt(buf.readLine());
        }
        int sum  = arr[0] + arr[1];
        System.out.println("The sum of "+arr[0]+" and "+arr[1]+" is "+sum);
    }
    public void sub() throws IOException{
        double arr[] = new double[2];
        System.out.println("Enter two doubles: ");
        for(int i = 0;i<2;i++){
            System.out.println("Double " + (i + 1) + ": ");
            arr[i] = Double.parseDouble(buf.readLine());
        }
        double sub  = arr[0] -  arr[1];
        System.out.println("The difference of "+arr[0]+" and "+arr[1]+" is "+sub);

    }
    public void CaseConvertName() throws IOException{
        System.out.println("Enter your Name in lower case: ");
        String name = buf.readLine();
        name = name.toUpperCase();
        System.out.println("Your name in Upper Case is " + name);
    } 
   
}
