package uz.jvh.daily_leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import static uz.jvh.daily_leetcode.Day_1.day1;
import static uz.jvh.daily_leetcode.Day_2.day_2;
import static uz.jvh.daily_leetcode.Day_29.day_29;
import static uz.jvh.daily_leetcode.Day_4.day_4;
import static uz.jvh.daily_leetcode.Day_6.day_6;
import static uz.jvh.daily_leetcode.Day_8.day_8;
import static uz.jvh.daily_leetcode.Day_9.day_9;

@SpringBootApplication
public class DailyLeetCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DailyLeetCodeApplication.class, args);
		// day1();
		// day_2();
		// day_4();
		// day_6();
		// day_8();
		// day_9();

		day_29();
	}

}
