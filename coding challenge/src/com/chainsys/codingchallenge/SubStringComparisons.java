package com.chainsys.codingchallenge;

import java.util.Scanner;

public class SubStringComparisons {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s = scan.nextLine().trim();
        scan.close();
        
        if(s.length() != 0 ){
            args = s.split("[ !,?._'@]+");
            System.out.println(args.length);
            for (String string : args) {
                System.out.println(string);
            }
        }
        else{
            System.out.println(0);
        }
    }

}
