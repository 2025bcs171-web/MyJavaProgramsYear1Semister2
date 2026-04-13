public class Binary_search1 {
    static int search(int[] arr,int key){
        int lo = 0,hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if(key == arr[mid]){
                return (mid + 1);
            }
            else if(key < arr[mid]){
                hi = mid - 1;
            }
            else if(key > arr[mid]){
                lo = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int key = 0;
        if(search(array,key) != -1){
            System.out.println("found at position "+ search(array,key));
        }
        else{
            System.out.println("Not found");
        }
    }
}
