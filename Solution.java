import java.util.Scanner;

class Solution {
    public static void main(String A[]){
                //  0 1 2 3
        int[] nums={1,3,5,6};
        int target=88;

        Scanner sobj = new Scanner(System.in);

        System.out.println(searchInsert(nums,target));
    }
    public static int searchInsert(int[] nums, int target) {
         
         for(int i=0;i<nums.length;i++)
         {
            if(nums[i] == target)
            {
                return  i;
            }
         }
        return nums.length;
    }
}