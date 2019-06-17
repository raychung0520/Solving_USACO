
/*
ID: raychun2
LANG: JAVA
TASK: namenum
*/
package _1_3;

import java.util.*;
import java.io.*;

public class namenum {

	static Scanner in;
	static PrintWriter out;
	static String inFile = "./input_output/namenum.in";
	static String outFile = "./input_output/namenum.out";
	// static StringBuilder result;
	static String result = "";

	// Input Variables

	static String dic = "./input_output/dict.txt";
	static String input;
	static int digit;
	static ArrayList<String> dict;
	static ArrayList<String> convertedList;
	
	static Scanner inD;

	public static void main(String[] args) {

		try {

			// Initialize in & out
			in = new Scanner(new File(inFile));
			out = new PrintWriter(new File(outFile));
			inD = new Scanner(new File(dic));

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

		input = in.nextLine();
		digit = input.length();
		dict = new ArrayList<String>();
		convertedList = new ArrayList<String>();

		makeDic();

	}

	private static String solve() {
		// Process and Output
		
		char [] name = new char[digit];
		int length = (int)Math.pow(3, digit);
		
		for(int i = 0; i < digit; i++) {
			
			String temp = convert(input.charAt(i));
			
			
			
		
			
			
		}

		result = check();		

		return result;

	}
	
	private static String check() {
	
		
		for(int i = 0; i < convertedList.size(); i++) {
			
			String name = convertedList.get(i);

			if(dict.contains(name))
				return name;
			
		}
		
		return "NONE";
		
		
	}

	private static String convert(char c) {

		if (c == '2')
			return "ABC";
		else if (c == '3')
			return "DEF";
		else if (c == '4')
			return "GHI";
		else if (c == '5')
			return "JKL";
		else if (c == '6')
			return "MNO";
		else if (c == '7')
			return "PRS";
		else if (c == '8')
			return "TUV";
		else
			return "WXY";

	}

	private static void makeDic() {
		
		while(inD.hasNext())
			dict.add(inD.nextLine());


	}



	// Algorithm methods
//	private static int change(String s) {
//
//		
//	}

}
