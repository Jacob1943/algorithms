package search;

import java.util.Scanner;

/**
 * @author Jacob
 * @date 2018/7/25
 */

public class BinarySearch {

    public static int binarySearch(int[] nums, int target) {

        int low = 0, high = nums.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        int[] nums = new int[] {1, 2, 5, 7, 11, 13, 17, 19};


        while(true) {

            System.out.print("Enter the number you want to search: ");

            Scanner scanner = new Scanner(System.in);

            int target = scanner.nextInt();

            int result = binarySearch(nums, target);

            if (result == -1) {
                System.out.println("This array does not contain " + target);
            } else {
                System.out.println("The index of " + target + " is: " + result);
            }
        }
    }
}
