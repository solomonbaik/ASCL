import java.util.*;
import java.io.*;
public class C1JR_Prints {
	public static int evens, odds;
	
	public static void main(String[] args) {
		
		try {
			
			Scanner in = new Scanner(new File("0809c1jr.in"));
			
			for(int x = 0; x < 7; x++) {
				
				String[] temp = in.nextLine().split(" ");
				int[] ans = new int[temp.length];
				
				for(int i = 0; i < temp.length; i++) {
					ans[i] = Integer.parseInt(temp[i]);
				}
				
				for(int i = 0; i < ans.length; i++) {
					if(ans[i] % 2 == 0) {
						evens += 1;
					}else {
						odds += 1;
					}
				}
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void whorlNumber() {
		
	}

}
