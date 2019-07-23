import java.util.*;
import java.io.*;
public class C1JR_Triangles {
	public static int answer;
	
	public static void main(String[] args) {
		try {
			
			Scanner in = new Scanner(new File("0708c1jr.in"));
			
			for(int i = 0; i < 10; i++) {
				
				String [] temp = in.nextLine().split(" ");
				double [] ans = new double [6];
				
				for(int x = 0; x < temp.length; x++) {
					ans[x] = Double.parseDouble(temp[x]);
				}
				
				for(int x = 0; x < 3; x++) {
					for(int j = 3; j < 6; j++) {
						if(ans[x] == ans[j]) {
							answer += 1;
							ans[j] = 0;
							break;
						}
					}
				}
				System.out.println(answer);
				answer = 0;
			}
						
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
