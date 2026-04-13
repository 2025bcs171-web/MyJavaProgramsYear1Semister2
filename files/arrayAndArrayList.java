import java.io.*;
import java.util.*;
public class arrayAndArrayList{
  public static void main(String[] args) throws IOException{
    String[] names = new String[4];
    int marks[] = new int[10];
    ArrayList<Integer> Marks = new ArrayList<Integer>();
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    String allow;
    /*System.out.println("Enter four Students' names:  ");
    for (int i = 0; i< names.length;i++){
      System.out.println("name "+(i + 1)+" :");
      names[i] = buf.readLine(); 
    }
    System.out.println("The names you have entered are: ");
    for (int i = 0; i< names.length;i++){
       System.out.println(names[i]);
    }
    System.out.println("Enter marks of 10 students: ");
    for (int i = 0; i < marks.length; i++){
       System.out.println(" For Student "+(i +1)+" :");
       marks[i] = Integer.parseInt(buf.readLine());
    }
    System.out.println("The marks you have entered are: ");
    for (int i = 0; i < marks.length; i++){
       System.out.print(marks[i] + " ");
    }*/
    boolean value = true;
    while(value){
       System.out.println("Enter Students' marks:  ");
       Marks.add(Integer.parseInt(buf.readLine()));
       System.out.println("Do you want to enter the next value (y/n): ");
       allow = buf.readLine();
       if(allow.equalsIgnoreCase("n"))
         value = false;
    
    }
    System.out.println("The marks you have entered are: ");
    for (int i = 0 ; i < Marks.size(); i++){
       System.out.print(Marks.get(i) + " ");
    }



  }
}
