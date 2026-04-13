import java.util.Scanner;
class StarRectangle{
    void rectangle(int r, int c){
        for(int x = 1; x <= r; x++){
            for(int y = 1; y <= c; y++){
                if(x == 1 || x == r || y == 1 || y == c)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StarRectangle rec = new StarRectangle();
        System.out.print("Enter the length of the rectangle: ");
        int c = sc.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int r = sc.nextInt();
        rec.rectangle(r, c);

    }
}
