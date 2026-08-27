package uz.jvh.daily_leetcode;


import java.util.Arrays;

public class Day_1 {

    /** 27-AVGUST 2025-YIL.
     * Array , 1.Two Sum **/
    public static void day1(){
        int[] nums = {2,7,11,15};
        int target = 9;

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length-1 ; j++) {
             if (nums[i] + nums[j] == target) {
                 System.out.println(Arrays.toString(new int[] {i, j}));
             return;
             }
            }
        }
        System.out.println(Arrays.toString(new int[] {}));
    }
}
