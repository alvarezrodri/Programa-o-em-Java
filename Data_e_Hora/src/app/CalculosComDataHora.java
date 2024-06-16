package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosComDataHora {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2022-07-20");						//Tranfere a em texto
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

		LocalDate PastWeekLocalDate = d04.minusDays(7); //instanciando uma nova data, que seria o d04 -7 dias, minus = menos
		LocalDate NextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("PastWeekLocalDate = " + PastWeekLocalDate);
		System.out.println("NextWeekLocalDate = " + NextWeekLocalDate);
		
		LocalDateTime PastWeekLocalDateTime = d05.minusDays(7); //instanciando uma nova data, que seria o d04 -7 dias, minus = menos
		LocalDateTime NextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("pastWeekLocalDateTime = " + PastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + NextWeekLocalDateTime);
		
		Instant PastWeekInstant = d06.minus(7, ChronoUnit.DAYS);	//modificar a data atras do instant
		Instant NextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("PastWeekInstant = " + PastWeekInstant);
		System.out.println("NextWeekInstant = " + NextWeekInstant);
		
		
		Duration t1 = Duration.between(PastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());	//Converte no inicio do dia
		Duration t2 = Duration.between(PastWeekLocalDateTime, d05); //do dia 13 ao dia vinte, qual foi a duração
		Duration t3	= Duration.between(PastWeekInstant, d06);
		Duration t4	= Duration.between(d06, PastWeekInstant) ; // ficou negativo, pq a primeira data era posterior a segunda data
		
		System.out.println("T1 dias = " + t1.toDays());
		System.out.println("T2 dias = " + t2.toDays());
		System.out.println("T3 dias = " + t3.toDays());
		System.out.println("T4 dias = " + t4.toDays());
		
		
	}

}
