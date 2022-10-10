public class max_subarray_sum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 9, 10, 14, 23 };

        System.out.print(max_sum(arr));
    }
    static int max_sum(int arr[]){
        int maxOfMax=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            max=max + arr[i];
            if(maxOfMax<max){
                maxOfMax=max;
            }
            else if(maxOfMax<0){
                maxOfMax=0;
            }
        }
        return maxOfMax;
    }
}
