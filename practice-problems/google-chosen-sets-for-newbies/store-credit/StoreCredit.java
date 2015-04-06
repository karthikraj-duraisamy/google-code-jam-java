import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class a {
	    PrintWriter out;
	    Scanner in;
	    String testCase = "A-small-practice";

	    public static void main(String[] args) throws Exception {
	        new a().solve();
	    }

	    void solve() throws Exception {

	    	  out = new PrintWriter(new FileOutputStream(testCase + ".out"));
	        in = new Scanner(new BufferedReader(new InputStreamReader(new FileInputStream(testCase + ".in"))));

	        int N = in.nextInt();

	        for (int t = 1; t <= N; ++t) {
	              int C = in.nextInt();
		        int I = in.nextInt();
		        //System.out.println(C+" credits amount we have");
		        //System.out.println(I+" items available in store");
	            
		      int[] temparray = new int[I];  
	            for (int k = 0; k < I; k++){
	            String num = in.next();
	            //System.out.println("Integer values in array " + num);
	            temparray[k] = Integer.valueOf(num);                    
	            }
	            
	            String result = "";
	            for (int l = 1;l<= temparray.length;l++){
	            	int j = 1;
	            	while (j <= temparray.length) {
					if(temparray[l-1]+temparray[j-1] == C){
					result = j+" "+l;
					break;
					}else
						j++;
					
				}
	            }
	            
	            out.println("Case #" + t + ": "+result);
	            System.out.println("Case #" + t + ": "+result);
	            }
	        out.close();
	    }
}
