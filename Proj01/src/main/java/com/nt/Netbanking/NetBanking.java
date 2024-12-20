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
	public String closeAccount2() {
		return "account2 closed successfully";
	}
	
	public void end() {
		System.out.
		println("hello iam from netbanking stash");
	}	
	public void abc() {
		System.out.println("abc");
	}
}
