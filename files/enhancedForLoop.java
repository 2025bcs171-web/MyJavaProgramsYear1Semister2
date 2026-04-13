import java.io.*;
public class enhancedForLoop{
  public static void main(String[] args) throws IOException{
    Prompt prompt = new Prompt();
    prompt.getAndPrintName(); 
  }
}
class Prompt{
  void getAndPrintName() throws IOException{
   BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
   String[] names = new String[4];
   System.out.print("Enter any four names: \n");
   for(int i = 0; i< names.length; i++){
    System.out.print((i + 1) + " : ");
    names[i] = buf.readLine();
   }
   System.out.print("The names entered are: ");
   for(String x : names)
    System.out.print(x + "  ");
   System.out.println();
  }
}
