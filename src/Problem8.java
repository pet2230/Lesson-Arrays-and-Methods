public class Problem8 extends ConsoleProgram {
    @Override
    public void run() {
        int [] arr = {3, 7, 1, 9};
        for(int i = 0; i< arr.length; i++){
            print(arr[i]+" ");
        }
        println();
    for(int i = 0; i< arr.length; i++){
            print(reverseCopy(arr)[i]+" ");
        }
    }

    public int[] reverseCopy(int[] arr){
        int [] copy = new int[arr.length];
        for(int i = 0; i< arr.length; i++){
            copy[i] = arr[arr.length -1-i];
        }
        return copy;
    }

}
