public class Problem3 extends ConsoleProgram {
    @Override
    public void run() {
        int limit = readInt("Enter limit: ");
        int[] arr = {8,12,3,14,6};
        print(countAbove(arr, limit));
    }
    public int countAbove(int[] arr, int limit){
        int total  = 0;
        for(int i = 0; i<arr.length;i++){
            if (arr[i]>limit){
                total++;
            }
        }
        return total;
    }

}
