package com.india.echo;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello This is India Information");
		India ind=new India();
		ind.setPm("Narendra Modi");
		ind.setPr("Murmu");
		ind.setCap("Rohit Sharma");
		System.out.println(ind.sayPm());
		System.out.println(ind.sayPr());
		System.out.println(ind.sayCap());
		

	}

}
