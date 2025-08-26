package uz.jvh.daily_leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static uz.jvh.daily_leetcode.Day_1.day1;
import static uz.jvh.daily_leetcode.Day_2.day_2;

@SpringBootApplication
public class DailyLeetCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DailyLeetCodeApplication.class, args);
		// day1();

       day_2();
	}

}
