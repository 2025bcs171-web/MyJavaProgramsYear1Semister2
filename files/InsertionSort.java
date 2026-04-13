import java.util.Scanner;
public class InsertionSort{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Insertion_sort st = new Insertion_sort();
    System.out.println("Enter array elements: ");
    int[] array = new int[10];
    for(int i = 0; i < 10; i++)
        array[i] = sc.nextInt();
    int[] sortedArray = st.SortAscending(array);
    System.out.print("\n******Ascending Order******\n");
    for(int i : sortedArray)
        System.out.print(i+" ");
    System.out.println();
    int[] SortedArray = st.SortDescending(array);
    System.out.print("\n******Descending Order******\n");
    for(int i : SortedArray)
        System.out.print(i+" ");
    System.out.println();
    sc.close();
    }
}
class Insertion_sort{
     int[] SortAscending(int[] arr){
         for(int i = 1; i < arr.length; i++){
             int key = arr[i];
             int j;
             for(j = i - 1; j >= 0 && arr[j] > key; j--)
                 arr[j + 1] = arr[j];
             arr[j + 1] = key;
         }
         return arr;

     }
     int[] SortDescending(int[] arr){
         for(int i = 1; i < arr.length; i++){
             int key = arr[i];
             int j;
             for(j = i - 1; j >= 0 && arr[j] < key; j--)
                 arr[j + 1] = arr[j];
             arr[j + 1] = key;
         }
         return arr;

     }

}
