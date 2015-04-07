import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class a {
	private PrintWriter out;
	private Scanner in;
	private String testCase = "A-large-practice";
	
	public static void main(String[] args) throws Exception {
		long startTime = System.nanoTime();
		new a().solve();
		long endTime = System.nanoTime();
		long durationInMs = TimeUnit.MILLISECONDS.convert((endTime - startTime), TimeUnit.NANOSECONDS);
		System.out.println("Running Time : "+ durationInMs +" milliseconds"); 
	}
	
	void solve() throws Exception {
		
	
		out = new PrintWriter(new FileOutputStream(testCase + ".out"));
		in = new Scanner(new BufferedReader(new InputStreamReader(new FileInputStream(testCase + ".in"))));
		int N = in.nextInt();
		
			for (int n = 0; n < N; n++) {
				int C = in.nextInt();
				int I = in.nextInt();
				//System.out.println(C+" credits amount we have");
				//System.out.println(I+" items available in store");
				int[] temparray = new int[I];  
					for (int i = 0; i < I; i++){
						String num = in.next();
						//System.out.println("Integer values in array " + num);
						temparray[i] = Integer.valueOf(num);                    
					}
				
				
					for (int j = 0;j < I;j++){
						
						for (int k = j+1; k < I; k++) {
							if(temparray[j]+temparray[k] == C){
								out.println("Case #" + (n+1) + ": "+(j+1)+" "+(k+1));
								System.out.println("Case #" + (n+1) + ": "+(j+1)+" "+(k+1));
								k = I;
								j = I;
							}
						}
					}
				
			}
		out.close();
	}
}
