
/*
ID: raychun2
LANG: JAVA
TASK: ride
*/
import java.util.*;
import java.io.*;



public class template {

	static Scanner in;
	static PrintWriter out;
	static String inFile = "xxx.in";
	static String outFile = "xxx.out";
	//static StringBuilder result;
	static String result = "";
	
	//Input Variables
	
	
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

		
	}


	private static String solve() {
		// Process and Output
		
		
				
		return result;
		
	}
	
	//Algorithm methods
	private static int change(String s) {

		
	}




}
