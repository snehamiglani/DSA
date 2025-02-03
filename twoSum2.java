public class twoSum2 {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 19;
        int l = 0;
        int r = numbers.length - 1;

        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum == target) {
                System.out.println("Indices: " + (l + 1) + ", " + (r + 1)); 
                return; 
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }

        System.out.println("No valid pair found"); 
    }
}
