package com.chainsys.codingchallenge;

import java.util.Scanner;

public class JavaLoops {
		public static void main(String []argh){
	        Scanner sc= new Scanner(System.in);
	        int t=sc.nextInt();
	        for(int i=0;i<t;i++){
	            int a = sc.nextInt();
	            int b = sc.nextInt();
	            int n = sc.nextInt();
	              for (int j = 0; j < n; j++) {
	                int term = a;
	                for (int k = 0; k <= j; k++) {
	                    term += (int) Math.pow(2, k) * b;
	                }
	                System.out.print(term + " ");
	            }
	            System.out.println();
	             
	        }
	        sc.close();
	}

}
