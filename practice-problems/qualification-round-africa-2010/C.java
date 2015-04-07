import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class C {
	private PrintWriter out;
	private Scanner in;
	//private String testCase = "C-small-practice";
	private String testCase = "C-large-practice";
	
	
	static TreeMap<String, String> keyMap = new TreeMap<String, String>();
	static {
      keyMap.put("a", "2");
      keyMap.put("b", "22");
      keyMap.put("c", "222");
      keyMap.put("d", "3");
      keyMap.put("e", "33");
      keyMap.put("f", "333");
      keyMap.put("g", "4");
      keyMap.put("h", "44");
      keyMap.put("i", "444");
      keyMap.put("j", "5");
      keyMap.put("k", "55");
      keyMap.put("l", "555");
      keyMap.put("m", "6");
      keyMap.put("n", "66");
      keyMap.put("o", "666");
      keyMap.put("p", "7");
      keyMap.put("q", "77");
      keyMap.put("r", "777");
      keyMap.put("s", "7777");
      keyMap.put("t", "8");
      keyMap.put("u", "88");
      keyMap.put("v", "888");
      keyMap.put("w", "9");
      keyMap.put("x", "99");
      keyMap.put("y", "999");
      keyMap.put("z", "9999");
      keyMap.put(" ", "0");
	}
	
	
	
	
	public static void main(String[] args) throws Exception {
		long startTime = System.nanoTime();
		new C().solve();
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
				
				String pressedString = in.nextLine();
				String result = "";
				out.print("Case #" + (n+1) + ": ");
				System.out.print("Case #" + (n+1) + ": ");
					
					for (int i = 0; i < pressedString.length(); i++){
					
						
						result = result+keyMap.get(pressedString.charAt(i)+"");
						
						if(i < pressedString.length()-1 && (pressedString.charAt(i)+"").equals(pressedString.charAt(i+1)+""))
						result = result+" ";
						
						if(i < pressedString.length()-1 && keyMap.get(pressedString.charAt(i)+"").charAt(0) == (keyMap.get(pressedString.charAt(i+1)+"").charAt(0)))
							result = result+" ";
					
					}
					
					
					out.println(result);
					System.out.println(result);				
			}
		out.close();
	}
}
