import java.util.*;
class GetElements{
    Scanner sc = new Scanner(System.in);
    int n;
    int[][] arr;
    void elements(){
        System.out.print("Enter the dimension of the matrix whose determinant you wanna find: ");
        n = sc.nextInt();
        arr = new int[n][n];
        System.out.println("Enter the elements of the "+n+" by "+n+" matrix created: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.println("Enter element at ["+i+"]"+"["+j+"]"+":");
                arr[i][j] = sc.nextInt();
            }
        }
    }
}
class determinant{
    GetElements gt;
    public determinant(GetElements gt){
        this.gt = gt;
    } 
    int det(int[][] arr,int n){
        if(n == 1)
            return arr[0][0];
        if(n == 2)
            return (arr[0][0] * arr[1][1]) - (arr[0][1] * arr[1][0]);
        int d = 0;
        for(int col = 0; col < n; col++){
            int[][] minor = new int[n - 1][n -1];
            int subrow = 0;
            for(int r = 0; r < n; r++){
                if(r == 0)
                    continue;
                int subcol = 0;
                for(int k = 0; k < n; k++){
                    if(k == col)
                        continue;
                    minor[subrow][subcol++] = arr[r][k];
                }
                subrow++;
            }
            int sign = ((0 + col) %2 == 0)?1 : -1;
            d += sign * arr[0][col] * det(minor,n - 1);
       }
       return d; 
    }
}
public class DetOf_n_by_n{
    public static void main(String[] args){
        GetElements gt = new GetElements();
        gt.elements();
        System.out.print("Matrix A = \n");
        for(int i = 0; i < gt.n; i++){
            for(int j = 0; j < gt.n; j++)
                System.out.print(gt.arr[i][j] + " ");
            System.out.println(); 
        }
        determinant dt = new determinant(gt);
        int result = dt.det(gt.arr,gt.n);
        System.out.println("determinant(A) = "+result);
   }
}
