package org.bank.partial;

public class SbiBank extends BankDetails {

	@Override
	public void saving() {
		System.out.println("9%");
		
	}
	
	@Override
	public void deposit() {
		System.out.println("10%");
		
	}
	
	@Override
	public void fixed() {
		System.out.println("20%");
		
	}
	
	public void loan() {
		System.out.println("10%");

	}
	
	public static void main(String[] args) {
		SbiBank s=new SbiBank();
		s.saving();
		s.deposit();
		s.fixed();
		s.loan();
	}
}
