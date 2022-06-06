public class SearchInsert {


//    Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//    You must write an algorithm with O(log n) runtime complexity.
//https://leetcode.com/problems/search-insert-position/

    public int searchInsertFindPosition(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        int pos = 0;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
                pos = start;
            }else{
                end = mid - 1;
                pos = mid;
            }
        }
        return pos;
    }
}
