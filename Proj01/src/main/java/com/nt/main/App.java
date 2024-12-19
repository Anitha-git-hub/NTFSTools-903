package com.nt.main;

public class App {
	public int sum(int x,int y) {
		return x+y;
	}
	public int div(int x,int y) {
		return x-y;
	}
    public static void main(String[] args) {
        System.out.println("Hello World!");
        App ap=new App();
        int result=ap.sum(10,20);
        System.out.println("sum is::"+result);
    }
}
