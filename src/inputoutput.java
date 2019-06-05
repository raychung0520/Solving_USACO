import java.util.*;
import java.io.*;

public class inputoutput {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(new File("./input_output/test.in"));
		PrintWriter out = new PrintWriter(new File("./input_output/test.out"));

		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 30000; i++) {

			String[] temp = in.nextLine().split(" ");

			for (int j = 0; j < 5; j++) {

				out.print(temp[j] + " ");
			}

			out.print("\n");

		}

		in.close();
		out.close();

		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);

		startTime = System.currentTimeMillis();

		BufferedReader f = new BufferedReader(new FileReader("./input_output/test.in"));

		PrintWriter out2 = new PrintWriter(new BufferedWriter(new FileWriter("./input_output/test.out")));

		for (int i = 0; i < 30000; i++) {

			StringTokenizer st = new StringTokenizer(f.readLine());

			for (int j = 0; j < 5; j++) {

				out2.print(st.nextToken() + " ");

			}

			out2.print("\n");

		}
		
		f.close();
		out2.close();
		
		endTime = System.currentTimeMillis();
		
		System.out.println(endTime - startTime);
		
		
		
		startTime = System.currentTimeMillis();
		
		StringBuilder sb = new StringBuilder();
		
		BufferedReader f2 = new BufferedReader(new FileReader("./input_output/test.in"));

		PrintWriter out3 = new PrintWriter(new BufferedWriter(new FileWriter("./input_output/test.out")));
		
		
		for (int i = 0; i < 30000; i++) {

			StringTokenizer st = new StringTokenizer(f2.readLine());

			for (int j = 0; j < 5; j++) {

				sb.append(st.nextToken() + " ");

			}

			sb.append("\n");

		}
		
		out3.print(sb);
		
		f2.close();
		out3.close();
		
		endTime = System.currentTimeMillis();
		
		System.out.println(endTime - startTime);
		
		

	}

}
