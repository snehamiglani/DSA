public class kadanesAlgo{
    public static void main(String[] args) {
        
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        if(arr==null || arr.length==0){
            System.out.print(0);
        }
        int sum=0;
        int maxSum=arr[0];

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>maxSum){
                maxSum=sum;

            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.print(maxSum);

    }
}