public class Binary_search {
    public static void main(String[] args) {
        int key = 20;int[] arr = {1,3,5,7,9,11,13,15,17,19,21};
        int lo = 0, N = arr.length,hi = N - 1;
        boolean found = false;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(key == arr[mid]){
                System.out.println("Found at position " + (mid + 1));
                found = true;
                
                break;
            }
            else if(key < arr[mid]){
                hi = mid - 1;
            }
            else if(key > arr[mid]){
                lo = mid + 1;
            }
        }
        if(!found){
            System.out.println("Not found");
        }
        
    }

    
}
