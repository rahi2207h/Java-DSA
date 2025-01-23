public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
               return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(nums, target); 
        if (result != null) { 
            System.out.println("Indices: " + result[0] + ", " + result[1]); 
        }
        else { 
            System.out.println("No solution found."); 
        }
    }
}
