package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		//DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now(); //Horario de Londres GMT
		
		LocalDate d04 = LocalDate.parse("2024-04-15");
		LocalDateTime d05 = LocalDateTime.parse("2024-04-15T01:20:26");
		Instant d06 = Instant.parse("2024-04-15T01:20:26Z");
		//Instant d07 = Instant.parse("2024-04-15T01:20:26-3:00");
		
		LocalDate d08 = LocalDate.parse("20/07/2022",  DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDateTime d09 = LocalDateTime.parse("20/07/2024 01:30", fmt2);
		
		LocalDate d10 = LocalDate.of(2024, 04, 16);
		LocalDateTime d11 = LocalDateTime.of(2024, 04, 16, 2, 22);
		
		System.out.println("d01 " + d01.toString());
		System.out.println("d02 " + d02.toString());
		System.out.println("d03 " + d03.toString());
		System.out.println("d04 " + d04.toString());
		System.out.println("d05 " + d05.toString());
		System.out.println("d06 " + d06.toString());
		//System.out.println("d07 " + d07.toString());
		System.out.println("d08 " + d08.toString());
		System.out.println("d09 " + d09.toString());
		System.out.println("d10 " + d10.toString());
		System.out.println("d11 " + d11.toString());
	}

}
