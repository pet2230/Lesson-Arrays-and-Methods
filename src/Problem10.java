public class Problem10 extends ConsoleProgram {
    @Override
    public void run() {
        int[] arr = {4, 6, 2, 5};
        print("Pairwise sums: ");
        for(int i = 0; i<arr.length-1; i++){
            print(pairwiseSums(arr)[i]+" ");
        }
    }
    public int[] pairwiseSums(int[] arr){
        int[] sums = new int[arr.length-1];
        for(int i = 0; i<arr.length-1; i++){
            sums[i] = arr[i]+arr[i+1];
        }
        return sums;
    }

}
