package _1_2;

import java.util.*;
import java.io.*;
public class gift1 {

	//
	static Scanner in;
	static PrintWriter out;
	static String inFile = "gift.in";
	static String outFile = "gift.out";

	static String result;

	// Input Variables

	public static void main(String[] args) {
		
		try {
			
			in = new Scanner(new File(inFile));
			out = new PrintWriter(new File(outFile));
			
			init();
			out.println(solve());
			
			in.close();
			out.close();
			
			
		}catch(Exception e){
			System.out.println(e);
		}

	}
	
	private static void init() {
		// TODO Auto-generated method stub
		
	}

	private static String solve() {

		return result;
	}
	
	//Algorithm Methods

	

}
