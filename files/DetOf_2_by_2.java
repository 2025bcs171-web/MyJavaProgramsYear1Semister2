import java.util.*;
public class Determinant{
    public static void main(String[] args){
        getElements gt = new getElements();
        gt.elements();
        printMatrix pt = new printMatrix(gt);
        pt.print();
        calculateDeterminant cal = new calculateDeterminant(gt);
        int result = cal.determinant(); 
        System.out.println("The determinant is = "+result);
     }
}
class getElements{
    Scanner sc = new  Scanner(System.in);
    int[][] matrix =  new int[2][2];
    void elements(){
     int i,j;
     System.out.println("Enter Elements of the 2 by 2 matrix: ");
     for(i = 0; i < 2; i++){
         for(j = 0; j < 2; j++){
             System.out.println("Enter Element [" + i + "]["+ j + "]: ");
             matrix[i][j] = sc.nextInt();
         }
     }
    }
}
class calculateDeterminant{
    getElements gt;
    calculateDeterminant(getElements gt){
        this.gt =  gt;
    }
    int determinant(){
        int det = (gt.matrix[0][0] * gt.matrix[1][1]) - (gt.matrix[0][1] * gt.matrix[1][0]);
    return det;
    }
}
class printMatrix{
    getElements gt;
    printMatrix(getElements gt){
        this.gt = gt;
    }
    void print(){
        System.out.println("This is the matrix you created: ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++)
                System.out.print(gt.matrix[i][j] + " ");
            System.out.println();
        }

    }
}
