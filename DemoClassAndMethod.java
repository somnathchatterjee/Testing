package com.demo;

public class DemoClassAndMethod {
	
	int demo_variable;
	
	public DemoClassAndMethod() {
		System.out.println("Non parameterize Constructor");
	}
	
	public DemoClassAndMethod(int a, String b) {
		System.out.println("parameterize Constructor a, b");
	}
	
	public DemoClassAndMethod(int t, String k, double d) {
		System.out.println("parameterize Constructor t, k, d");
	}
	
	public DemoClassAndMethod(String name, String address, int ph, int amt) {
		String n = name;
		String adr = address;
		int phone = ph;
		int amount = amt;
		
		System.out.println("Your name is : " + n +"Your address is : " + adr);
		System.out.println("Your phone no is : " + phone +"Your deposit amt is : " + amount);
	}
	
	
	public void studentdata() {
		int i;
		
	    for(i=1;i<=10;i++){ 
	    	
	    	for(int j=1;j<=10;j++){
	    		
	            System.out.println(i+" ----- "+j);  
	    	} 
	    } 
	}
	public String studentmarks() {
		
		return "marks";
	}
	public int studentroll() {
		
		return 1;
	}
	public float studentstrength() {
		
		return (float) 4.3;
	}
}
