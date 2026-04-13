import java.util.Scanner;
public class MergeSort{
    public static void main(String[] args){
    Merge mg = new Merge();
    Divide dv = new Divide(mg);
    Scanner sc = new Scanner(System.in);
    int[] array = new int[10];
    System.out.println("Enter array elements(10): ");
    for(int i = 0; i < 10; i++)
        array[i] = sc.nextInt();
    sc.close();
    int left = 0,right = array.length - 1;
    dv.divide(array, left,right);
    System.out.print("\n*****Sorted Array*****\n");
    for(int i : array)
        System.out.print(i+" ");
    System.out.println(); 
    }
}
class Merge{
    public void merge(int[] arr, int left, int mid, int right){
        //find sizes of left and right sub-arrays
        int n1 = mid - left + 1;
        int n2 = right - mid;
        //create temporary sub-arrays.
        int[] L = new int[n1];
        int[] R = new int[n2];
        //copy elements in the left and right sub-arrays into L[] and R[] respectively
        for(int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for(int i = 0; i < n2; i++)
            R[i] = arr[mid + 1 + i];
        //combining the sub-arrays and writing them back into the original array.
        int i = 0,j = 0, k = left;
        while(i < n1 && j < n2){
            if(L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }
        //copy remaining elements from L if any
        while(i < n1)
            arr[k++] = L[i++];
        //copy remaining elements from R if any
        while(j < n2)
            arr[k++] = R[j++];

    }
}
class Divide{
    Merge mg;
    public Divide(Merge mg){
        this.mg = mg;
    }
    public void divide(int[] arr, int left, int right){
        if(left < right){
            int mid = left + (right - left)/2;
            divide(arr, left, mid);
            divide(arr, mid + 1, right);
            mg.merge(arr, left, mid, right);
        }

    }
}
