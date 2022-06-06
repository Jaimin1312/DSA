public class BinarySerach {
    public static int Search(int[] arr , int target){
        int start = 0;
        int end = arr.length;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
