public class Problem9 extends ConsoleProgram {
    @Override
    public void run() {
        int[] arr = {-3, 4, -1, 7};
        replaceNegatives(arr);
    }
    public void replaceNegatives(int[] arr){
        print("Updated: ");
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<1){
                arr[i] = 0;
            }
            print(arr[i]+" ");
        }
    }

}
