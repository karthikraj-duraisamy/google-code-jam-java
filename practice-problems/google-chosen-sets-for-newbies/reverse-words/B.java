import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class B {
	private PrintWriter out;
	private Scanner in;
	//private String testCase = "B-small-practice";
	private String testCase = "B-large-practice";
	
	public static void main(String[] args) throws Exception {
		long startTime = System.nanoTime();
		new B().solve();
		long endTime = System.nanoTime();
		long durationInMs = TimeUnit.MILLISECONDS.convert((endTime - startTime), TimeUnit.NANOSECONDS);
		System.out.println("Running Time : "+ durationInMs +" milliseconds"); 
	}
	
	void solve() throws Exception {
		
	
		out = new PrintWriter(new FileOutputStream(testCase + ".out"));
		in = new Scanner(new BufferedReader(new InputStreamReader(new FileInputStream(testCase + ".in"))));
		int N = in.nextInt();
		in.nextLine();
			for (int n = 0; n < N; n++) {
				
				String[] wordsInLine = in.nextLine().split(" ");
				out.print("Case #" + (n+1) + ": ");
				System.out.print("Case #" + (n+1) + ": ");
				for (int i = wordsInLine.length-1; i >= 0; i--){
				out.print(wordsInLine[i]+" ");
				System.out.print(wordsInLine[i]+" ");
				}
				out.println();
				System.out.println();
				
			}
		out.close();
	}
}
