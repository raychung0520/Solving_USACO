package _1_2;
/*
ID: raychun2
LANG: JAVA
TASK: ride
*/
import java.util.*;
import java.io.*;



public class ride {

	static Scanner in;
	static PrintWriter out;
	static String inFile = "ride.in";
	static String outFile = "ride.out";
	//static StringBuilder result;
	static String result = "";
	
	//Input Variables
	
	static String [] list;
	
	
	public static void main(String[] args) {
		
		try {
			
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
		
		//Initialize Input Variables
		//Get data and Initialize 
		list = new String[2];
		
		list[0] = in.nextLine();
		list[1] = in.nextLine();
		
	}


	private static String solve() {
		// Process and Output
		
		int l1 = change(list[0]);
		int l2 = change(list[1]);
		
		if(l1 == l2)
			result = "GO";
		else
			result = "STAY";
				
		return result;
		
	}
	
	private static int change(String s) {
		int num = 1;
		for(int i = 0; i < s.length(); i++) {
			
			num *= (s.charAt(i) - 'A' + 1);
			
		}
		
		return num % 47;
		
	}




}
