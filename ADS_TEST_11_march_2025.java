import java.util.*;
public class ADS_TEST_11_march_2025{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        move(arr);
        System.out.print(Arrays.toString(arr));

    }
    public static void move(int[] arr){
        int zeroCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[zeroCount++]=arr[i];
            }
        }
        while(zeroCount<arr.length){
            arr[zeroCount++]=0;
        }
    }
    
}