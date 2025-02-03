import java.util.*;
public class maxLen{
    public static void main(String[] args) {
        int target=3;
        int[] arr={1,2,3};
        Map<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int maxLen=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==target){
                maxLen=Math.max(maxLen,i+1);
            }
            int rem=sum-target;
            if(map.containsKey(rem)){
                int len=i-map.get(rem);
                maxLen=Math.max(maxLen,len);
            }


        }
        System.out.print(maxLen);

    }
}