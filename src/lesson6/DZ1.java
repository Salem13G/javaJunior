package lesson6;

public class DZ1 {
    public static void main(String[] args) {
        int[][] nums = {{1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}};
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums[i].length -1; j < i; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
