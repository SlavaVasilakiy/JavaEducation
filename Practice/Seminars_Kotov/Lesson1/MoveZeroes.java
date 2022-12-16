
class OutputPrint {
    public void outputPrint() {
        int[] nums = new int[]{1, 2, 0, 0, 12};
        int[] result = new SolutionZeroes().moveZeroes(nums);
        for (int v : result) {
            System.out.print(v + " ");
        }
    }

}
class SolutionZeroes {
    public int[] moveZeroes(int[] nums) {
        int copyIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[copyIndex++] = nums[i];
                //copyIndex++;
            }
        }
        while (copyIndex < nums.length) {
            nums[copyIndex++] = 0;
        }
        return nums;
    }
}

public class MoveZeroes {
    public static void main(String[] args) {
        new OutputPrint().outputPrint();

        System.gc();
    }
}
