package uz.jvh.daily_leetcode;

import java.util.Arrays;

public class Day_2 {

    /** 28-AVGUST 2025-YIL.
     * Array , 26. Remove Duplicates from Sorted Array **/
    public static int day2(){

     int[] nums = {0,0,1,1,1,2,2,3,3,4};
     int k = 1; // chunki massiv 0 dan boshlanadi
        if (nums.length == 0) return 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
