package com.nt.Netbanking;

public class NetBanking {
	
	public String accountOpen(String full, String aadharNo, String contact) {
		return "account created successfully";
	}
	public String transferMoney(String srcAcno, String destAcno, long amnt) {
		return amnt+" money trasferred from "+srcAcno+" to "+destAcno;
	}
	public String receiveMoney(String destAcno, String srcAcno, long amnt) {
		return amnt+" money received from "+destAcno+" to "+srcAcno;
	}
	public String closeAccount() {
		return "account closed successfully";
	}

}
