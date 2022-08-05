package com.vishal.utils;


import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class CalLocalDateFormat {
	
	public static void main(String[] args) {
		
		Date today = new Date();
		
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(today);
		gc.set(Calendar.DAY_OF_MONTH, gc.get(Calendar.DAY_OF_MONTH)-1);
		
		System.out.println("Today : " + today);
		System.out.println("Greg Cal : " + gc.getTime());
		System.out.println();
		
		GregorianCalendar birthday = new GregorianCalendar(1960,12,19);
		Date birthdayDate = birthday.getTime();
		
		System.out.println("Today : " + today);
		System.out.println("Birthday " + birthday);
		System.out.println("Birthday Date" + birthdayDate);
		System.out.println();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		String pretty = sdf.format(birthdayDate);
		System.out.println("Formatted Birthday date : " + pretty);
		System.out.println();
		
		LocalDateTime ldt1 = LocalDateTime.now();
		LocalDateTime ldt2 = LocalDateTime.of(2022,07,23,17,31);
		
		LocalDate somed = LocalDate.from(ldt1);
		LocalTime somet = LocalTime.from(ldt2);
		
		System.out.println("ldt1 : " + ldt1);
		System.out.println(ldt1.format(DateTimeFormatter.ofPattern("YY-MM-dd hh:mm")));
		System.out.println("somed : " + somed);
		System.out.println("somet : " + somet);
		System.out.println();
		
		LocalDate yesterday = LocalDate.now().minusDays(1);
		LocalDate mybday = LocalDate.of(1987, 3, 20);
		
		Period period = Period.between(mybday, yesterday);
		
		System.out.println("Years : " + period.getYears() + " Months : " + period.getMonths() +
				" Days : " + period.getDays());
		System.out.println("yesterday : " + yesterday);
		System.out.println("mybday : " + mybday);
	}

}
