package Seminars_Kotov;
class SolutionRemoveElement {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            } else i++;
        }
        return n;
    }
}
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = new int[] {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(new SolutionRemoveElement().removeElement(nums, val));
        for (int v : nums) {
            System.out.print(v + " ");
        }
    }
}
