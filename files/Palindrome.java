import java.util.*;
class getString{
    char[] arr;
    Scanner sc  =  new Scanner(System.in);
    String str;
    void string(){
        System.out.println("Enter a string: ");
        str = sc.nextLine();
        arr = str.toCharArray();
    }
}
class Reverse{
    getString gs;
    public Reverse(getString gs){
        this.gs = gs;
    }
    String reverse(){
        String result = "";
        for(int i = gs.arr.length - 1; i >= 0; i--)
            result += gs.arr[i];
        return result;
    }
}
public class Palindrome{
    public static void main(String[] args){
        getString gs = new getString();
        gs.string();
        Reverse rv = new Reverse(gs);
        String s = rv.reverse();
        if(gs.str.compareToIgnoreCase(s) == 0){
            System.out.println("Yes,"+gs.str+" is a palindrome.");
        }else{
            System.out.println("No,"+gs.str+" is not a palindrome.");
        }
    }
}
