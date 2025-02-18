public class quicksort {
    public static void swap (int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition (int[] arr, int start, int end){
        int pivot = arr[end];
        int pindex = start;
        for(int i = start; i<end; i++){
            if(arr[i] <pivot){
                swap(arr,pindex,i);
                pindex++;
            }
        }
        swap(arr,end,pindex);
        return pindex;
    }

    public static void Quicksort(int[] arr, int start, int end) {
        if(start<end){
            int pindex = partition(arr, start, end);
            Quicksort( arr, start, pindex-1);
            Quicksort( arr, pindex+1, end);
        }
    }

    public static void display(int[] arr){
        System.out.print("The sortest element are : ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        int[] nums = {7,1,4,9,5,8,2,6};
        int size = nums.length;
        Quicksort(nums,0, size-1);
        display(nums);
    }
}
