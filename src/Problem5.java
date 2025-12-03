public class Problem5 extends ConsoleProgram {
    @Override
    public void run() {
        int[] nums = {4, 7, 9, 12, 13,13 , 15, 20};
        print("middle: " + middleTwo(nums)[0] + " "+ middleTwo(nums)[1]);
    }
    public int[] middleTwo(int[] nums){
        int[] copy = new int[2];
        int middle = nums.length/2;
        copy[0] = nums[middle-1];
        copy[1] = nums[middle];
        return copy;

    }

}
