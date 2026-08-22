import java.util.Scanner;

public class ArrayConstructionProblems {

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String op : operations) {
            if (op.equals("++X") || op.equals("X++")) {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }

        public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }

    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] + nums[i];
        }
        return ans;
    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("TASK 67 - ARRAY CONSTRUCTION LEETCODE SET");

        System.out.println("\nLC 2011 - Final Value After Performing Operations");
        String[] operations = {"--X", "X++", "X++"};
        System.out.println("Operations: --X, X++, X++");
        System.out.println("Final value: " + finalValueAfterOperations(operations));

        System.out.println("\nLC 1920 - Build Array from Permutation");
        int[] permInput = {0, 2, 1, 5, 3, 4};
        System.out.print("Input: ");
        printArray(permInput);
        System.out.print("Output: ");
        printArray(buildArray(permInput));

        System.out.println("\nLC 1929 - Concatenation of Array");
        int[] concatInput = {1, 2, 1};
        System.out.print("Input: ");
        printArray(concatInput);
        System.out.print("Output: ");
        printArray(getConcatenation(concatInput));

        System.out.println("\nLC 1480 - Running Sum of 1D Array");
        int[] runningInput = {1, 2, 3, 4};
        System.out.print("Input: ");
        printArray(runningInput);
        System.out.print("Output: ");
        printArray(runningSum(runningInput));

        sc.close();
    }
}