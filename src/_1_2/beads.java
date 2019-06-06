/*
ID: raychun2
LANG: JAVA
TASK: beads
*/
package _1_2;
import java.util.*;
import java.io.*;

public class beads {

	static Scanner in;
	static PrintWriter out;
	static String inFile = "./input_output/beads.in";
	static String outFile = "./input_output/beads.out";
	//static StringBuilder result;
	static String result = "";
	
	//Input Variables
	static int N;
	static String b;
	
	public static void main(String[] args) {
		
		try {
			
			//Initialize in & out
			in = new Scanner(new File(inFile));
			out = new PrintWriter(new File(outFile));
			
			init();
			result = solve();
			
			//Write out file
			out.println(result);
			System.out.println(result);
			
			out.close();
			in.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		

	}
	
	private static void init() {
		//Get data 
		//Initialize Input Variables
		N = Integer.parseInt(in.nextLine());
		b = in.nextLine();
		
	}


	private static String solve() {
		// Process and Output
		
		int max = 0;
		b += b;

		
		for(int i = 0; i < b.length()/2; i++) {
			int c = 1;
			char start = b.charAt(i);
			
			if(start == 'w') {
				c = Math.max(recur(i, 'r'), recur(i, 'b'));
			}else
				c = recur(i, start);
			

			
			if(max < c)
				max = c;
		
			
		}
		
		
		result = ""+max;
				
		return result;
		
	}
	
	//Algorithm methods
	private static int recur(int i, char c) {
		boolean flag = false;
		int idx = i+1;
		int count = 2;
		
		while(count < b.length()/2) {
			
			char curr = b.charAt(idx);
	
			
			if(!flag) {
				if(curr == c || curr == 'w')
					count++;
				else
					flag = true;
			}else {
				if(curr != c || curr == 'w')
					count++;
				else
					break;
				
			}
			idx++;
		}

		return count;
		
	}




}
