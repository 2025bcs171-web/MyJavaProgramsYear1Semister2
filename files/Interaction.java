import java.io.*;
public class Interaction{
  public static void main(String [] args) throws IOException{
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    String Names[] = new String[4];
    for(int i =0;i<4; i++){
       System.out.println("Enter your Name:  ");
       Names[i] = buf.readLine();
} 
    for (int i = 0;i<4;i++)
      System.out.print(Names[i] + " ");
  }
}
    
