package com.chainsys.codingchallenge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;

import javax.naming.spi.DirStateFactory.Result;

public class DayFinder {
	
	public static String findDay(int month, int day, int year) {
	     LocalDate date = LocalDate.of(year, month, day);
	        DayOfWeek dayOfWeek = date.getDayOfWeek();
	        return dayOfWeek.toString();
	    }
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        int month = Integer.parseInt(firstMultipleInput[0]);

	        int day = Integer.parseInt(firstMultipleInput[1]);

	        int year = Integer.parseInt(firstMultipleInput[2]);

	        String res = DayFinder.findDay(month, day, year);

	        bufferedWriter.write(res);
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    
	}
}
