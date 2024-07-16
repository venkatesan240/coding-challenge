package com.chainsys.codingchallenge;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        System.out.println(A.length()+B.length());
	        int i=A.compareTo(B);
	        if(i<=0){
	            System.out.println("No");
	        }else {
	        	System.out.println("yes");
	        }
	        char a=A.charAt(0);
	        System.out.print(Character.toUpperCase(a));
	        System.out.print(A.substring(1)+" ");
	        char b=B.charAt(0);
	        System.out.print(Character.toUpperCase(b));
	        System.out.println(B.substring(1));
	    }

	

}
