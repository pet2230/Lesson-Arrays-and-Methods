public class Problem6 extends ConsoleProgram {
    @Override
    public void run() {
        int[] arr = {2,4,6};
        int factor  = readInt("whdafdfsa ");
        multiplyAll(arr, factor);
    }
    public void multiplyAll(int[] arr, int factor){
        int[] mult = new int[3];
        for (int i = 0; i<arr.length; i++){
            mult[i] = arr[i]*factor;
        }
        print("Before ");
        for (int i = 0; i<arr.length; i++){
            print(arr[i]+" ");
        }
        println();
        print("After ");
        for (int i = 0; i<arr.length; i++){
            print(mult[i]+" ");
        }
    }
}
