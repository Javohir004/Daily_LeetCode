package uz.jvh.daily_leetcode;

public class Day_6 {

    // Name: String
    // Type: medium
    // Num : 5.Longest palindromic substring


    public static void day_6(){
        String s = "babad";
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                boolean isPal = true;
                for (int l = i, r = j; l < r; l++, r--) {
                    if (s.charAt(l) != s.charAt(r)) {
                        isPal = false;
                        break;
                    }
                }
                if (isPal && (j - i + 1) > longest.length()) {
                    longest = s.substring(i, j + 1);
                }
            }
        }

        System.out.println(longest);
    }

//    public static void day_6(){
//
//        String s = "babad";
//
//        String longest = "";
//        for (int i = 0; i < s.length(); i++) {
//
//            for (int j = i + 1; j <= s.length(); j++) {
//                String sub = s.substring(i, j);
//                String reversed = new StringBuilder(sub).reverse().toString();
//
//                /// bu yerdan reverse ga teng va oldinggisan uzun bo'lsin sharti bor
//                if (sub.equals(reversed) && sub.length() > longest.length()) {
//                    longest = sub;
//                }
//
//            }
//        }
//        System.out.println(longest);
//    }



}
