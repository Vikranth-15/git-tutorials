public class MaxConsecutiveBits {
    public static int maxConsecutiveOnes(int[] arr) {
        int maxCount = 0; // To keep track of the maximum count of consecutive 1s
        int currentCount = 0; // To keep track of the current count of consecutive 1s
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]){
                currentCount++; 
            }else{
                currentCount=1;
            }
            maxCount=Math.max(maxCount,currentCount);
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,1,0,0,0};
        int result = maxConsecutiveOnes(arr);
        System.out.println("Maximum number of consecutive 1s: " + result); // Output: 4
    }
}
