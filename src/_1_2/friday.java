package _1_2;
/*
ID: raychun2
LANG: JAVA
TASK: friday
*/

import java.util.*;
import java.io.*;

public class friday {

	static Scanner in;
	static PrintWriter out;
	static String inFile = "./input_output/friday.in";
	static String outFile = "./input_output/friday.out";
	// static StringBuilder result;
	static int N;
	static String result = "";

	// Input Variables
	static int[] list;
	static int[] dates = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static int date = 0;

	public static void main(String[] args) {

		try {

			// Initialize in & out
			in = new Scanner(new File(inFile));
			out = new PrintWriter(new File(outFile));

			init();
			result = solve();

			// Write out file
			out.println(result);

			out.close();
			in.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private static void init() {
		// Get data
		// Initialize Input Variables
		N = Integer.parseInt(in.nextLine()) + 1900;

		list = new int[7]; // MON - SUN

	}

	private static String solve() {
		// Process and Output

		for (int i = 1900; i < N; i++) {
			
			for (int j = 1; j <= 12; j++) {
				list[(date+13)%7]++;
				
				if(j == 2) {
					if(isLeaf(i) && !isCentury(i))    // explain with condition has isCentury
						date += 29;
					else
						date += 28;
				}else {
					date += dates[j];
				}
				
				
				
			
			}
		}
		
		result += list[6] + " ";
		for(int i = 0; i < 6; i++) {
			if(i == 5)
				result += list[i];
			else
				result += list[i] + " ";
		}
		//In this problem, there are 7 values for the answer, so we may not need to use for loop
		//result = list[6] + " " list[0] + " " + list[1] + " "....

		return result;

	}

	// Algorithm methods
	private static boolean isLeaf(int y) {

		return y % 4 == 0;
	}
	
	private static boolean isCentury(int y) {
		
		if(y % 100 == 0) {
			if( y % 400 == 0)
				return false;
			return true;
		}else{
			return false;
		}
	}

}
