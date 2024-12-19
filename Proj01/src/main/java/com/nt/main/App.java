package com.nt.main;

public class App {
	public int sum(int x,int y) {
		return x+y;
	}
<<<<<<< HEAD
	public int div(int x,int y) {
		return x-y;
=======
	public int mul(int x,int y) {
		return x*y;
>>>>>>> branch 'master' of https://github.com/Anitha-git-hub/NTFSTools-903.git
	}
    public static void main(String[] args) {
        System.out.println("Hello World!");
        App ap=new App();
        int result=ap.sum(10,20);
        System.out.println("sum is::"+result);
    }
}
