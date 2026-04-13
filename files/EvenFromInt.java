import java.util.*;
public class EvenFromInt{
    public static void main(String[] args){
        getEvenFromInt gf = new getEvenFromInt();
        int d = gf.integer();
        System.out.println("In "+gf.n+" , there're "+gf.getEven()+" even numbers.");
    }
}
class getEvenFromInt{
    int n;
    Scanner sc = new Scanner(System.in);
    int integer(){
        System.out.println("Enter an integer: ");
        n = sc.nextInt();
        return n;
    }
    int getEven(){
        int cp = n;
        int y = 0;
        while(cp != 0){
            int res = cp % 10;
            if(res %2 == 0)
                y ++;
            cp /= 10;
        }
        return y;
    }
}
