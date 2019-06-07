/*
ID: raychun2
LANG: JAVA
TASK: transform
*/
package _1_3;

import java.util.*;
import java.io.*;

public class transform {

	static Scanner in;
	static PrintWriter out;
	static String inFile = "./input_output/transform.in";
	static String outFile = "./input_output/transform.out";
	// static StringBuilder result;
	static String result = "";

	// Input Variables
	static int N;
	static char[][] board;
	static char[][] trans;

	public static void main(String[] args) {

		try {

			// Initialize in & out
			in = new Scanner(new File(inFile));
			out = new PrintWriter(new File(outFile));

			init();
			result = solve();

			// Write out file
			out.println(result);
			//System.out.println(result);

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
		board = new char[N][N];
		trans = new char[N][N];

		for (int i = 0; i < N; i++) {
			String str = in.nextLine();
			for (int j = 0; j < N; j++) {
				board[i][j] = str.charAt(j);

			}
		}

		for (int i = 0; i < N; i++) {
			String str = in.nextLine();
			for (int j = 0; j < N; j++) {
				trans[i][j] = str.charAt(j);

			}
		}


	}

	private static String solve() {
		// Process and Output


		if(isSame(_90deg(board)))
			result += 1;
		else if(isSame(_180deg(board)))
			result += 2;
		else if(isSame(_270deg(board)))
			result += 3;
		else if(isSame(_reflec(board)))
			result += 4;
		else if(isSame(_reflec(_90deg(board))) || isSame(_reflec(_180deg(board))) || isSame(_reflec(_270deg(board))))
			result += 5;
		else if(isSame(board))
			result += 6;
		else
			result += 7;

		return result;

	}

//	Algorithm methods
	
	private static char[][] _90deg(char[][] in){
		
		char [][] res = new char[N][N];
		
		for(int i = 0 ; i < N; i++) {
			for(int j = 0; j < N; j++)
				res[i][j] = in[i][j];
		}
		
		for (int i = 0; i < N / 2; i++) 
	    { 
	        for (int j = i; j < N - i - 1; j++) 
	        { 
	  
	            // Swap elements of each cycle 
	            // in clockwise direction 
	            char temp = res[i][j]; 
	            res[i][j] = res[N - 1 - j][i];  
	            res[N - 1 - j][i] = res[N - 1 - i][N - 1 - j]; 
	            res[N - 1 - i][N - 1 - j] = res[j][N - 1 - i]; 
	            res[j][N - 1 - i] = temp ;

	        
	        } 
	    } 
		return res;
		
	}
	
	private static char[][] _180deg(char[][] in){
		return _90deg(_90deg(in));
	}
	
	private static char[][] _270deg(char[][] in){
		return _90deg(_180deg(in));
	}
	
	private static char[][] _reflec(char[][] in) {

		char[][] res = new char[in.length][in.length];

		for (int i = 0; i < in.length; i++) {

			for (int j = 0; j < in.length; j++) {
				
				res[i][j] = in[i][in.length-1-j];
				res[i][in.length-1-j] = in[i][j];

			}
		}

		return res;

	}

	private static boolean isSame(char[][] in) {

		char[][] res = new char[in.length][in.length];

		for (int i = 0; i < in.length; i++) {

			for (int j = 0; j < in.length; j++) {
				if(in[i][j] != trans[i][j])
					return false;
			}
		}

		return true;

	}
	
	private static void print(char [][] in){
		
		for (int i = 0; i < N; i++) {

			for (int j = 0; j < N; j++) {
				System.out.print(in[i][j]);
			}
			System.out.println();
		}
	}

}
