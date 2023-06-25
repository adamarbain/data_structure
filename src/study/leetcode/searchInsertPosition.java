package study.leetcode;


public class searchInsertPosition {
    
    public int searchInsert(int[] nums, int target) {
        int zero = 0 ; 
        for (int i = 0 ; i < nums.length ; i++){
            if (nums[i] == target)
                return zero;
            if (nums[i] < target)
                zero++;
        }
        return zero;
    }

    public static void main(String[] args){
    
    int[] array = {1,3,5,6};
    int a = 2;

    System.out.print("nums = [");
    for (int i = 0 ; i < array.length ; i++){
        System.out.print(array[i] + " ");
        }
    System.out.print("]");
    System.out.print(",target = " + a + "\n");
    
    searchInsertPosition s = new searchInsertPosition();
    System.out.println(s.searchInsert(array,a));
}
    
    
}
