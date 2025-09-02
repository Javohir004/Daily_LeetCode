package uz.jvh.daily_leetcode;

public class Day_8 {

    /// Name: Sorting
    /// Type: Easy
    /// Num: 389.Find the difference


    public static void day_8(){
        String s = "absd";
        String t = "absde";
        int sum = 0;

        for (char c : t.toCharArray()) { // t dagi harflarni qo‘shamiz
            sum += c;
        }
        for (char c : s.toCharArray()) { // s dagi harflarni ayiramiz
            sum -= c;
        }

        System.out.println((char) sum);
    }
}
