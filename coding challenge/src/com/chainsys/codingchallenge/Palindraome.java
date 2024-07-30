package com.chainsys.codingchallenge;

import java.util.Scanner;

public class Palindraome {

	public static void main(String[] args) {		
		 Scanner sc = new Scanner(System.in);
		    String input = sc.next();
		    String output = "";

		    for(int i = 0; i<input.length(); i++){
		        output = input.charAt(i) + output;
		    }
		    System.out.println(output);
		    if(input.equals(output)){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		    
	}

}
