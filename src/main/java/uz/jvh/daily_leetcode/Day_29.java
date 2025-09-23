package uz.jvh.daily_leetcode;

import java.util.Arrays;

public class Day_29 {

    /// Name: Sorting
    /// Type: Medium
    /// Num: 16. 3Sum Closest

    //1. Arrays.sort(nums) → massivni tartiblaydi.
    //2. closestSum → dastlabki 3 ta son yig‘indisi sifatida olinadi.
    //3. Har bir i element uchun:
    //  left = i+1, right = oxirgi indeks.
    //  sum = nums[i] + nums[left] + nums[right].
    //  Agar sum targetga hozirgidan yaqinroq bo‘lsa → closestSum yangilanadi.
    //  sum < target bo‘lsa → left++ (ko‘proq yig‘indi kerak).
    //   * sum > target bo‘lsa → right-- (kamroq yig‘indi kerak).
    //   * sum == target bo‘lsa → to‘g‘ridan-to‘g‘ri shu summani qaytaradi.
    //4. Eng yaqin yig‘indi closestSum sifatida qaytadi.


    public static void day_29() {

        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        Arrays.sort(nums);
        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum;
                }

                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    System.out.println(sum);
                }
            }
        }
        System.out.println(closestSum);
    }

}
