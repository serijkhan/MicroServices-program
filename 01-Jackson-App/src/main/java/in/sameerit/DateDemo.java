package in.sameerit;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class DateDemo {
	
	public static void main(String[] args) throws Exception {

		Date date = new Date();
		System.out.println(date);

		// Converting Date to String
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		String format1 = sdf1.format(date);
		System.out.println(format1);

		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");
		String format2 = sdf2.format(date);
		System.out.println(format2);

		// Convert String to Date
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
		Date parsedDate = sdf3.parse("2022-12-20");
		System.out.println(parsedDate);
		
		Duration duration = Duration.between(LocalTime.parse("18:00"), LocalTime.now());
		System.out.println(duration);
		
		Period period = Period.between(LocalDate.parse("1991-05-20"), LocalDate.now());
		System.out.println(period);
		
	}

}
