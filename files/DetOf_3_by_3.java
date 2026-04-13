import java.util.*;
public class DetOf_3_by_3{
    public static void main(String[] args){
        GetElements gt = new GetElements();
        gt.Elements();
        calDet dt = new calDet(gt);
        System.out.println("The matrix you created is: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++)
                System.out.print(gt.arr[i][j] + " ");
            System.out.println();
        }
        System.out.println("It's determinant = "+dt.Det());
    }
}
class GetElements{
    Scanner sc = new Scanner(System.in);
    int[][] arr = new int[3][3];
    void Elements(){
        System.out.println("Enter Elements of the 3 by 3 matrix: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("Enter element at ["+i+"]"+"["+j+"] "+ "index: " );
                arr[i][j] = sc.nextInt();
            }
        }
    }
}
class calDet{
    GetElements gt;
    public calDet(GetElements gt){
        this.gt = gt;
    }
    int Det(){
        int x,y,z,det;
        x = (gt.arr[0][1] * gt.arr[2][2]) - (gt.arr[0][2] * gt.arr[2][1]);
        y = (gt.arr[0][0] * gt.arr[2][2]) - (gt.arr[2][0] * gt.arr[0][2]);
        z = (gt.arr[0][0] * gt.arr[2][1]) - (gt.arr[0][1] * gt.arr[2][0]);
        det = (gt.arr[1][1] * y) - (gt.arr[1][2] * z)-(gt.arr[1][0] * x);
        return det;
    }
}
