package org.arr;

public class ArrayDetails {
	
	public static void main(String[] args) {
		
	String s="Welcome to java class";
	
	String[] si = s.split(" ");
	
	System.out.println(si[0]);
	System.out.println(si[1]);
	System.out.println(si[2]);
	System.out.println(si[3]);
	
		int il = si.length;
		System.out.println(il);
		
		for(int i=0;i<il;i++) {
			System.out.println(si[i]);
		}
		for(String x:si) {
			System.out.println(x);
		}
	}

}
