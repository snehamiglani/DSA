public class countPrimes{
    public static void main(String[] args) {
        // what is prime sieve?
        // the prime sieve is an algo to efficiently generate all the prime numbers up to a specified limit
        //Steps:
        //Create a boolean array isPrime[] where each index represent 
        // initially mark all the numbers from 2 to n as true

        int l=10;
        int r=30;
        int ans=countP(l,r);
        System.out.print(ans);
        
       
    
    }
    public static int countP(int l, int r){
        int[] primes=new int[r+1];
        for(int i=0;i<=r;i++){
            primes[i]=1;
        }
        primes[0]=primes[1]=0;
        for(int i=2;i*i<=r;i++){
            if(primes[i]==1){
                for(int j=i*i;j<=r;j+=i){
                    primes[j]=0;

                }
            }
        }
        int count=0;
        for(int i=l;i<=r;i++){
            if(primes[i]==1){
                count++;
            }
        }
        return count;

    }
}