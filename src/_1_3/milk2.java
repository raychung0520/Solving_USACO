/*
ID: raychun2
LANG: JAVA
TASK: milk2
*/
package _1_3;

import java.util.*;
import java.io.*;

public class milk2 {

	static Scanner in;
	static PrintWriter out;
	static String inFile = "./input_output/milk2.in";
	static String outFile = "./input_output/milk2.out";
	// static StringBuilder result;
	static String result = "";

	// Input Variables

	static class milking implements Comparable<milking> {

		int in;
		int out;

		public milking(int in, int out) {
			this.in = in;
			this.out = out;
		}

		@Override
		public int compareTo(milking that) {
			// TODO Auto-generated method stub
			return this.in - that.in;
		}
	}

	static int N;
	static milking[] list;

	public static void main(String[] args) {

		try {

			// Initialize in & out
			in = new Scanner(new File(inFile));
			out = new PrintWriter(new File(outFile));

			init();
			result = solve();

			// Write out file
			out.println(result);
			System.out.println(result);

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
		list = new milking[N];

		for (int i = 0; i < N; i++) {
			String[] temp = in.nextLine().split(" ");

			list[i] = new milking(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
		}

		Arrays.sort(list);
//		for(milking m: list) {
//			System.out.println(m.in + " " + m.out);
//		}

	}

	private static String solve() {
		// Process and Output
		int maxConti = 0;
		int maxIdle = 0;
		
		int start = list[0].in;
		int end = list[0].out;
		
		for(int i = 0; i < list.length; i++) {
			
			int currIn = list[i].in;
			int currOut = list[i].out;
			
			if(currOut <= end) {
				
				continue;
				
			}else if(currIn <= end) {
				
				end = currOut;
			}else {
				
				int idle = currIn - end;
				
				if(idle > maxIdle) {
					maxIdle = idle;
				}
				
				int conti = end - start;
				
				if(conti > maxConti)
					maxConti = conti;
				
				start = currIn;
				end = currOut;
				
			}
			
			int conti = end - start;
			if(conti > maxConti)
				maxConti = conti;
			
			result += maxConti + " " + maxIdle;
		}

		return result;

	}

	// Algorithm methods
//	private static int change(String s) {
//
//		
//	}

}
