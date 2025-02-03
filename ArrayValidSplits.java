public class ArrayValidSplits{
    public static void main(String[] args) {
        int arr[]={10,4,-8,7};
        int n=4;
        long lsum=0;
        
        long totalSum=0;
        for(int nums:arr){
            totalSum+=nums;

        }
        long validSplit=0;
        for(int i=0;i<arr.length-1;i++){
            lsum+=arr[i];
            long rsum=totalSum-lsum;
            if(lsum>=rsum){
                validSplit++;

            }
        }
        System.out.print(validSplit);
    }

}