class RotateArrayInGroups {
    // Function to rotate array in groups of size k
    public static void rotateInGroups(int[] arr, int n, int k) {
        // Traverse the array in chunks of size k
        int len=arr.length;
        if(k>=len){
            reverse(arr,0,len-1);
            return;
        }else{
            for(int i=0;i<len;i+=k){
                int start=i;
                int end=start+k-1;
                if(end<len){
                    reverse(arr,start,end);
                }else{
                    reverse(arr,start,len-1);
                }
            }
        }
    }

    // Helper function to reverse a portion of the array
    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            // Swap elements at left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        int k = 3;

        rotateInGroups(arr, n, k);

        // Print the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}