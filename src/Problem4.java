public class Problem4 extends ConsoleProgram {
    @Override
    public void run() {
        int[] arr = {4,1,9};
        for (int i = 0; i<arr.length; i++){

            print(arr[i]+" ");
        }
        println();
        int[]copy = copyArray(arr);
        for (int i = 0; i<arr.length; i++){
            print(copy[i]+" ");
        }
    }
    public int[] copyArray(int[] arr){
        int[] copy  = new int[arr.length];
        for (int i = 0; i<arr.length; i++){
            copy[i] = arr[i];
        }
        return copy;
    }

}
