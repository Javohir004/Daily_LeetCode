package uz.jvh.daily_leetcode;

public class Day_9 {

    /// Name: Sorting
    /// Type: easy
    /// Num: 506.Relative Rank


    public static void day_9(){
        int[] score = {10,3,8,9,4};
        String[] answer = new String[score.length];

        for(int place = 1 ; place <= score.length ; place++){
            int maxIndex = 0;
            ///  eng kattasini topish
            for(int i = 0 ; i < score.length ; i++){
                if(score[i] > score[maxIndex]){
                    maxIndex = i;
                }
            }
            /// aynan o'sha indexsiga medalni joylaymiz
            if(place == 1)answer[maxIndex] = "Gold Medal";
            else if(place == 2)answer[maxIndex] = "Silver Medal";
            else if(place == 3)answer[maxIndex] = "Bronze Medal";
            else answer[maxIndex] = String.valueOf(score[maxIndex]);

            ///  takrorlanmasligi uchun -1 ga tengash
            score[maxIndex] = -1;
        }
        /// shunchaki javobni ekrangga chiqaryapman
        for(int i = 0 ; i < answer.length ; i++){
            System.out.println(answer[i]);
        }

    }
}
