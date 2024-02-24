package DataTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTime {

	// java7 paryant ky khas api nahvt so indroduce karav lagal..
	// also callled joda time api

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();

		LocalDate date1 = LocalDate.of(2022, Month.DECEMBER, 5);

		System.out.println(date);

		// get date month year format

		System.out.println(date.getDayOfMonth());
		System.out.println(date.getMonthValue());
		System.out.println(date.getYear());

		// OOORR

		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);

		System.out.println(LocalTime.now());

		datetime.plusDays(10);
		
		//Zones
		
		ZoneId zoneID= ZoneId.systemDefault();
		System.out.println(zoneID);
		
		ZoneId of = ZoneId.of("America/Los_Angeles");
		
		LocalDateTime now = LocalDateTime.now(of);
		
		LocalDateTime now1 = LocalDateTime.now();
		
		System.out.println("Time at los angeles current now : "+now);
		
		ZoneId zoneIDGMT = ZoneId.of("GMT+5:30");
		
		ZonedDateTime now2 = ZonedDateTime.now(zoneIDGMT);
		
		System.out.println(now2);
	
	}
	
}
