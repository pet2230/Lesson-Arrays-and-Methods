public class Problem1 extends ConsoleProgram {
    @Override
    public void run() {
        int[]arr = {3, 9, 2, 7, 4};
        print(sumArray(arr));
        }
        private int sumArray(int[] arr){
            int total = 0;
            for(int i = 0; i<arr.length; i++){
                total += arr[i];
            }
            return total;
        }
    }
