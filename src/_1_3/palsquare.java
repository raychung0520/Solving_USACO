/*
ID: raychun2
LANG: JAVA
TASK: ride
*/
package _1_3;

import java.util.*;
import java.io.*;

public class palsquare {

	static Scanner in;
	static PrintWriter out;
	static String inFile = "./input_output/palsquare.in";
	static String outFile = "./input_output/palsquare..out";
	// static StringBuilder result;
	static String result = "";

	// Input Variables
	static int N;
	static String[] list;

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
		N = Integer.parseInt(in.nextLine());

	}

	private static String solve() {
		// Process and Output

		for (int i = 1; i <= 300; i++) {

			String temp = "";
			int t = i;
			
			if (t < N)
				temp += "%"+t;
			else {
				while (t > 1) {

					int res = t % N;
					System.out.println(res + "    " + convert(res));
					
					if(res > 9)
						temp += convert(res);
					else
						temp += res;
					
					t /= N;

				}
				if(t != 0)
					temp += t;
				
			}
			
			
			System.out.print(i + "   :    ");
			for(int j = temp.length()-1; j >= 0; j--)
				System.out.print(temp.charAt(j));
			
			System.out.println("");
			

		}

		return result;

	}

	private static boolean isPanlindrome(String s) {

		int idx = s.length() - 1;

		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(idx))
				return false;
			idx--;

		}
		return true;

	}

	// Algorithm methods
//	private static int change(String s) {
//
//		
//	}

	private static char convert(int n) {
		
		return (char)(n+65);
		
		
	}

}
