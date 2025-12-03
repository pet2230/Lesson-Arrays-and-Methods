public class Problem2 extends ConsoleProgram {
    @Override
    public void run() {
        int bonus  = 2;
        int[] marks = {10, 7, 8,9,6};
        addBonus(marks, bonus);
    }
    public void addBonus(int[] marks, int bonus){
        print("origional: ");
        for(int i =0; i< marks.length; i++){
            print(marks[i] + " " );
        }
        println();
        print("After ");
        for(int i =0; i< marks.length; i++){
            print(marks[i]+bonus + " " );
        }
    }
}
