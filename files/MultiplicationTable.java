public class MultiplicationTable{
    public static void main(String[] args){
        Matrix mtr = new Matrix();
        mtr.matrix();
        Table table = new Table(mtr);
        table.table();
        table.print();
    }
}
class Matrix{
    int[][] matrix = new int[12][2];
    void matrix(){
        for(int i = 0; i < 12; i++){
           matrix[i][0] = i + 1;
           matrix[i][1] = i + 1;
        }
    }
}
class Table{
    Matrix mtr;
    public Table(Matrix mtr){
        this.mtr = mtr;
    }
    int[] results = new int[144];
    void table(){
        int index = 0;
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                results[index] = mtr.matrix[i][0] * mtr.matrix[j][0];
                index++;
            }
        } 
    }
    void print(){
        int index = 0;
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                System.out.println(mtr.matrix[i][0]+" X "+mtr.matrix[j][1]+" = "+results[index]+" \t");
                index++;
            }
        }
    }
}
