import java.util.Scanner;
class AskUserName{
    String[] names = {"Amy", "Buffy", "Cathy", "Elroy", "Fred", "Graham"};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        AskUserName ask = new AskUserName();
        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        if(name.equals(ask.names[0]) || name.equals(ask.names[1]) || name.equals(ask.names[2]))
            System.out.println("Ms."+name);
        else if(name.equals(ask.names[3]) || name.equals(ask.names[4]) || name.equals(ask.names[5]))
            System.out.println("Mr."+name);
        else
            System.out.println(name);
    }
}

