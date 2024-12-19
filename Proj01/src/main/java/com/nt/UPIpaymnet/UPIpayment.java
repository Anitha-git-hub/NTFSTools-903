package com.nt.UPIpaymnet;


public class UPIpayment {
	public String withdrawl(String acno, long amnt) {
		return amnt+"is withdrawl successfully from the"+acno;
	}
	public String deposit(String acno, long amnt) {
		return amnt+"is deposited successfully into the"+acno;
	}
	
}
