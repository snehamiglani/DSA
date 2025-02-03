import java.util.*;
public class threeSumClosest{
    public static void main(String[] args) {
        int target=1;
        int []nums={-1,2,1,-4};
        Arrays.sort(nums);
        int closestSum=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int currSum=nums[i]+nums[left]+nums[right];
                if(Math.abs(target-currSum)<Math.abs(target-closestSum)){
                    closestSum=currSum;

                }
                if(currSum<target){
                    left++;
                }
                else if(currSum>target){
                    right--;
                }
                else{
                    System.out.print(currSum);
                }
            }
        }
        System.out.print(closestSum);
    }
}
