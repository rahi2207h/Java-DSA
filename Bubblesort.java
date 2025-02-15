public class bubbolsort {
    public static void Bubblesort(int[] nums){
        int n = nums.length;
        boolean swapped;
        for(int i = 0; i<n-1; i++){
            swapped = false;
            for(int j = 0; j < n-1-i; j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped)break;
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,5,3,7,4,8,6,9};
        Bubblesort(nums);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
