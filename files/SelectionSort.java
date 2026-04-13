import java.util.Scanner;
public class SelectionSort{
    public static void main(String[] args){
        Selection_sort sort = new Selection_sort();
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("You're going to create an integer array and we shall sort it in any the order you like: ");
        System.out.print("Now enter the elements: ");
        for(int i = 0; i < 10; i++){
            while(! sc.hasNextInt()){
                System.out.print("Integer please! Try again: ");
                sc.next();
            }
            array[i] = sc.nextInt();

        }
        System.out.print("Type 'Y' for ascending order and 'N' for descending order: ");
        String choice = sc.next();
        int[] a;
        if(choice.equalsIgnoreCase("y"))
            a = sort.sortAscending(array);
        else if(choice.equalsIgnoreCase("n"))
            a = sort.sortDescending(array);
        else{
            System.out.println("Invalid input! Default to ascending order.");
            a = sort.sortAscending(array);
        }
        System.out.println("The sorted array: ");
        for(int i : a)
            System.out.print(i+" ");
        System.out.println();
    }
}
class Selection_sort{
    int[] sortAscending(int[] arr){
        for(int i = 0; i < arr.length - 1; i++ ){
            int min_idx = i;
            for(int j = i + 1; j < arr.length; j++)
                if(arr[j] < arr[min_idx])
                    min_idx = j;
            if(i != min_idx){
                arr[i] = arr[i] ^ arr[min_idx];
                arr[min_idx] = arr[i] ^ arr[min_idx];
                arr[i] = arr[i] ^ arr[min_idx];
            }
        }
        return arr;

    }
    int[] sortDescending(int[] arr){
        for(int i = 0; i < arr.length - 1; i++ ){
            int max_idx = i;
            for(int j = i + 1; j < arr.length; j++)
                if(arr[j] > arr[max_idx])
                    max_idx = j;
            if(i != max_idx){
                arr[i] = arr[i] ^ arr[max_idx];
                arr[max_idx] = arr[i] ^ arr[max_idx];
                arr[i] = arr[i] ^ arr[max_idx];
            }
        }
        return arr;

    }

}
