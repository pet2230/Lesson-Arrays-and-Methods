public class Problem7 extends ConsoleProgram {
    @Override
    public void run() {
        int[] arr = {5, 8, 2, 8, 1};
        int target = 81;
        print(findIndex(arr, target));
    }
    public int findIndex(int[] arr, int target){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }   

}
