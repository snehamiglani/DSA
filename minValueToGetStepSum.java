public class minValueToGetStepSum{
    public static void main(String[] args) {
        int[] nums={-3,2,-3,4,2};
        int sum=0;
        int minSum=0;

       for(int i:nums){
        sum+=i;
        minSum=Math.min(minSum,sum);
       }
       System.out.print(1-minSum);
    }

}