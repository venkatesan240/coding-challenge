package com.chainsys.codingchallenge;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

	public static void main(String[] args) {
			    Scanner scan = new Scanner(System.in);
			    double n = scan.nextDouble();
			    String us = NumberFormat.getCurrencyInstance(Locale.US).format(n);

			    String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(n);
			    String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(n);
			    String india = NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(n);
			    System.out.println("US: "+us);
			    System.out.println("India: "+india);
			    System.out.println("China: "+china);
			    System.out.println("France: "+ france);
			

	}

}
