package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataTimeJava {
	

	public static void main(String[] args) {
		
		//https://docs.oracle.com/javase/jp/18/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");			//Para o formatar o padrão da data
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");	//Formatando data-hora no padrão ISO 8601
		
		LocalDate d01 = LocalDate.now();											//data e hora local
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();												//Data-hora global, gera o horário de londres
		
		LocalDate d04 = LocalDate.parse("2022-07-20");								//Tranfere a em texto
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); 						//Padrao UTC, no horario de londres
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");  					//Formato ISO 8601 - 3horas a mais de são paulo
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);	
		
		LocalDate d10 = LocalDate.of(2022, 07, 20);									//Passar dia, mes e ano isoladamente
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		
		
		System.out.println("d01 = " + d01.toString());		//Só mandar o toString que vira o padrao ISO 8601
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());								// Z sigfica a data-hora GMT
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());
		
		//VARIAS FORMAS DE INSTANCIAR A DATA-HORA, É IMPORTANTE PARA BANCO DE DADOS E API, TER CONHECIMENTO DISSO.
		
	}

}
