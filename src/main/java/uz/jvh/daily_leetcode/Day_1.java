package uz.jvh.daily_leetcode;

import java.util.Arrays;

public class Day_1 {

    /** 8-AVGUST 2025-YIL.
     Array : 4.
     Given two sorted arrays nums1 and nums2 of size m and n respectively,
     return the median of the two sorted arrays.
     The overall run time complexity should be O(log (m+n)). **/
    public static void day1(){
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6, 8};

        int[] array = new int[nums1.length + nums2.length];

        System.arraycopy(nums1,0,array, 0 ,nums1.length);
        System.arraycopy(nums2,0,array, nums1.length ,nums2.length);
        Arrays.sort(array);

        int n = array.length;

        if(n % 2 == 1){
            System.out.println(array[n/2]);
        }else{
            System.out.println((array[n/2] + array[n/2-1])/2);
        }
    }
}
