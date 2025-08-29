package uz.jvh.daily_leetcode;

public class Day_4 {

    /** Name: Math
     type: easy
     Num: 415. Add Strings **/
    public static void day_4(){
        String num1 = "11";
        String num2 = "123";
        StringBuilder ans = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int a = 0;
            int b = 0;
            if (i >= 0) {
                a = num1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                b = num2.charAt(j) - '0';
                j--;
            }
            int sum = a + b + carry;
            ans.append(sum % 10);  // oxirgi raqamni yozamiz
            carry = sum / 10;      // qolganini carry qilib olamiz
        }
        System.out.println(ans.reverse().toString());
    }
}
