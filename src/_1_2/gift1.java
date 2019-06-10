package _1_2;
/*
ID: raychun2
LANG: JAVA
TASK: gift1
*/
import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class gift1 {

	
	static Scanner in;
	static PrintWriter out;
	static String inFile = "./input_output/gift1.in";
	static String outFile = "./input_output/gift1.out";

	static String result = "";

	// Input Variables
	
	static LinkedHashMap<String, Integer> list;
	static int NP;

	public static void main(String[] args) {
		
		try {
			
			in = new Scanner(new File(inFile));
			out = new PrintWriter(new File(outFile));
			
			init();
			out.print(solve());
			
			in.close();
			out.close();
			
			
		}catch(Exception e){
			System.out.println(e);
		}

	}
	
	private static void init() {
		// 
		NP = Integer.parseInt(in.nextLine());
		list = new LinkedHashMap<String, Integer>();
		for(int i = 0; i < NP; i++) {
			list.put(in.nextLine(), 0);
		}
		
		
		// empty line for last line

//		
//		Iterator it = list.keySet().iterator();
//		while(it.hasNext()) {
//			String key = it.next().toString();
//			int value = list.get(key);
//			
//			result += key + " " + value;
//			
//			if(it.hasNext())
//				result += "\n";
//		}
		
//		list.forEach((k,v) -> {
//		    System.out.println(k + " " + v);
//		});
		
//		for(Entry<String, Integer> list: list.entrySet()) {
//			String name = list.getKey();
//			int money = list.getValue();
//			
//			result += name + " " + money + "\n";
//		}
		
	}

	private static String solve() {
		
		for(int i = 0; i < NP; i++) {
			String giver = in.nextLine();
			String [] temp = in.nextLine().split(" ");
			int totalMoney = Integer.parseInt(temp[0]);
			int numbPeop = Integer.parseInt(temp[1]);
			
			if(numbPeop == 0) continue; 
			
			int money = totalMoney / numbPeop;
			int left = totalMoney - (money * numbPeop);
			
			list.put(giver, list.get(giver)-totalMoney + left);
			
			for(int j = 0; j < numbPeop; j++) {
				String receiver = in.nextLine();
				list.put(receiver, list.get(receiver)+money);
			}
		}
		
		for(String s: list.keySet()) {
			result += s + " " + list.get(s) + "\n";
		}

		return result;
	}
	
	//Algorithm Methods

	

}
