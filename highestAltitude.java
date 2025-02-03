public class highestAltitude{
    public static void main(String[] args) {
        int[] gain={-5,1,5,0,-7};
        
        int sum=0;
        int maxAltitude=0;
        
        for(int i:gain){

            sum+=i;
            maxAltitude=Math.max(maxAltitude,sum);

        }
        
        System.out.print(maxAltitude);
        
    }
}
