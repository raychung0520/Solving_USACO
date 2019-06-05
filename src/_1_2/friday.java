package _1_2;
/*
ID: raychun2
LANG: JAVA
TASK: ride
*/


import java.util.*;
import java.io.*;

public class friday {

	static Scanner in;
	static PrintWriter out;
	static String inFile = "./input_output/friday.in";
	static String outFile = "./input_output/friday.out";
	//static StringBuilder result;
	static String result = "";
	
	//Input Variables
	static String [] list;
	
	public static void main(String[] args) {
		
		try {
			
			//Initialize in & out
			in = new Scanner(new File(inFile));
			out = new PrintWriter(new File(outFile));
			
			init();
			result = solve();
			
			//Write out file
			out.println(result);
			
			out.close();
			in.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		

	}
	
	private static void init() {
		//Get data 
		//Initialize Input Variables
		

		
	}


	private static String solve() {
		// Process and Output
		
		
				
		return result;
		
	}
	
	//Algorithm methods
//	private static int change(String s) {
//
//		
//	}




}
