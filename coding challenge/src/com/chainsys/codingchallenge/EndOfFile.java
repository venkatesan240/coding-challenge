package com.chainsys.codingchallenge;

import java.util.Scanner;

public class EndOfFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int i=1;
	        while(sc.hasNext()){
	            String line=sc.nextLine();
	            System.out.println(i+" "+line);
	            i++;
	        }
	}

}
