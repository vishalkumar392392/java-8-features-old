package LocalDate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeDemo {

	public static void main(String[] args) {

		// present Date
		LocalDate d = LocalDate.now();

		System.out.println(d);

		LocalDate d1 = LocalDate.of(1989, 8,15);

		System.out.println(d1);
		
		LocalDate d2 = LocalDate.of(1989,Month.JANUARY,26);

		System.out.println(d2);
		
		// DateAndTime
		LocalDateTime ldt = LocalDateTime.now();// human readable
		System.out.println(ldt);
		
		Instant i = Instant.now();//Machine readable
		System.out.println(i);
		
		// present Time
		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		LocalTime t1 =LocalTime.of(16,15,20);
		System.out.println(t1);
		
		LocalTime t2 =LocalTime.now(ZoneId.of("Asia/Kuwait"));
        System.out.println(t2);
        
        

	}

}
