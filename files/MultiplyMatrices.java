import java.io.*;
public class MultiplyMatrices{
    public static void main(String[] args) throws IOException{
        fromUser user = new fromUser();
        user.prompt(); 
    }
}
class fromUser{
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    void prompt() throws IOException{
        int rowNum,columnNum,RowNum,ColumnNum;

        System.out.println("Enter the rows and columns of matrix A: ");
   
        System.out.print("Number of rows: ");
        rowNum = Integer.parseInt(buf.readLine());

        System.out.print("number of columns: ");
        columnNum = Integer.parseInt(buf.readLine());

        System.out.println("Enter the rows and columns of matrix B: ");

        System.out.print("number of rows: ");
        RowNum = Integer.parseInt(buf.readLine());

        System.out.print("number of columns: ");
        ColumnNum = Integer.parseInt(buf.readLine());

        int[][] matrixA = new int[rowNum][columnNum];
        int[][] matrixB = new int[RowNum][ColumnNum];
        int[][] productMatrix = new int[rowNum][ColumnNum];
        int sum = 0;
        if(columnNum != RowNum){
            System.out.println("Sorry! rows of A must be equal to columns of B.");
        }
        else{
            System.out.println("Enter elements of matrix A:");
            for(int i = 0; i < rowNum; i++){
                for(int j = 0; j < columnNum; j++){
                    matrixA[i][j] = Integer.parseInt(buf.readLine());
                }
                System.out.println( );
            }

            System.out.println("Enter elements of matrix B:");
            for(int i = 0; i < RowNum; i++){
                for(int j = 0; j < ColumnNum; j++)
                    matrixB[i][j] = Integer.parseInt(buf.readLine());
                System.out.println( );
            }

            for(int i = 0; i < rowNum; i ++){
                for(int j = 0; j < ColumnNum; j++){
                    for(int k = 0; k < columnNum; k++)
                        sum += matrixA[i][k] * matrixB[k][j];
                    productMatrix[i][j] = sum;
                    sum = 0;
                }
            }
            System.out.println("Matrix A:");
            for(int i = 0; i < rowNum; i++){
               for(int j = 0; j < columnNum; j++)
                   System.out.print(matrixA[i][j] + "  ");
              
               System.out.println( );
            }
            System.out.println("Matrix B:");
            for(int i = 0; i < RowNum; i++){
                for(int j = 0; j < ColumnNum; j++)
                    System.out.print(matrixB[i][j] + "  ");
                System.out.println( );
            }
            System.out.println("productMatrix:");
            for(int i = 0; i < rowNum; i++){
                for(int j = 0; j < ColumnNum; j++)
                    System.out.print(productMatrix[i][j] + "  ");
   
                System.out.println( );
            }
        }
    }
}
