import java.util.Scanner;
public class AddComplexNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two complex Numbers: ");
        int m = 0; int n = 0; int x = 0; int y = 0;
        for(int i = 0; i < 4; i++){
            if(i == 0){
                System.out.print("Enter real part for complex number 1: ");
                m = sc.nextInt();
            }
            if(i == 1){
                System.out.print("Enter imaginay part for complex number 1: ");
                n = sc.nextInt();
            }
            if(i == 2){
                System.out.print("Enter real part for complex number 2: ");
                x = sc.nextInt(); 
            }
            if(i == 3){
                System.out.print("Enter imaginay part for complex number 2: ");
                y = sc.nextInt();
            }
        }
        AddComplexNumbers c1 = new AddComplexNumbers(m, n);
        AddComplexNumbers c2 = new AddComplexNumbers(x, y);
        System.out.print("Your first complex number = ");
        c1.show();
        System.out.print("Your second complex number = ");
        c2.show();
        AddComplexNumbers res = add(c1, c2);
        System.out.print("Their sum = ");
        res.show();
    }
    int real,imaginary;
    public AddComplexNumbers(int n, int m){
        this. real = n;
        this.imaginary = m;
    }
    public static AddComplexNumbers add(AddComplexNumbers x, AddComplexNumbers y){
        return new AddComplexNumbers(x.real + y.real, x.imaginary + y.imaginary);
    }
    void show(){
        System.out.println(this.real+ "+"+this.imaginary+"i");
    }
}
