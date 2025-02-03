import java.util.*;
public class defuseBomb{
    int [] code={5,7,1,4};
    int n=code.length;
    int k=3;
        int[]  result=new int[n];
        if(k==0){
            System.out.print(result);
        }
        int start,end,step;
        if(k>0){
            start=1;
            end=k;
            step=1;
        }
        else{
            start=-1;
            end=k;
            step=-1;
            k=-k;
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=1;j<=k;j++){
                int index=(i+(j*step)+n)%n;
                sum+=code[index];
            }
            result[i]=sum;
        }
        System.out.print(result);
}