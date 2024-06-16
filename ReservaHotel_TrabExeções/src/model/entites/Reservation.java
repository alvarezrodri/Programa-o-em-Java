package model.entites;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	//static
	
	public Reservation() {
		
	}
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date ");	//programação defensiva
		}	
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}


	public Integer getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}


	public Date getCheckIn() {
		return checkIn;					//apaguei a set checkou e checkin, por que eu nao vou modificar as datas, sempre
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public long duration() {		//usei long que é o inteiro mais longo
		long diff = checkOut.getTime() - checkIn.getTime();	//recebe em milisegundo
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);	//converte o milisegundo para dias 
	}
	public void updatedDates(Date checkIn, Date checkOut){	//agora meu metodos DamainException pode lanãr um exceção
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Reservation dates for update must be future dates"); //throw - lançar
		}									
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date ");
		}									//IllegalArgumentException(); usa-se quando os argumentos dos metodos sao invalidados
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	@Override
	public String toString() {
		return "Room "	
			+roomNumber
			+", check-in: "
			+sdf.format(checkIn)
			+", check-out: "
			+", "
			+duration()
			+" nights";
	}
}
