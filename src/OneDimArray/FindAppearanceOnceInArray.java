package OneDimArray;

import java.util.Arrays;

/**
 * This problem was asked by Facebook.
 *
 * <p>Given an array of integers in which two elements appear exactly once and all other elements
 * appear exactly twice, find the two elements that appear only once.
 *
 * <p>For example, given the array [2, 4, 6, 8, 10, 2, 6, 10], return 4 and 8. The order does not
 * matter.
 */
public class FindAppearanceOnceInArray {

  public static void main(String[] args) {

    int[] nums = {2, 4, 6, 8, 10, 2, 6, 10};
    Arrays.sort(nums);

    System.out.println(Arrays.toString(nums));

    for (int i = 0; i < nums.length; ) {

      if (nums[i] == nums[i + 1]) {
        i += 2;
        continue;
      } else {
        System.out.println(nums[i]);
        i++;
      }
    }
  }
}
