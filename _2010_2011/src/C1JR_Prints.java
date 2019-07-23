import java.util.*;
import java.io.*;
public class C1JR_Prints {	
	public static void main(String[] args) {
		
		try {
			
			Scanner in = new Scanner(new File("1011c1jr.in"));
			
			for(int x = 0; x < 7; x++) {
				int evens = 0, odds = 0, numerator = 0, denominator = 0;
				
				String[] temp = in.nextLine().split(" ");
				int[] ans = new int[temp.length];
				
				for(int i = 0; i < temp.length; i++) {
					ans[i] = Integer.parseInt(temp[i]);
				}
				
				if(ans[0] == 0 && ans.length == 1) {
					System.out.println("1/1");
					continue;
				}
				
				for(int i = 0; i < ans.length; i++) {
					if(ans[i] % 2 == 0) {
						evens += 1;
						if(ans[i] == 10)
							numerator += 1;
						if(ans[i] == 8)
							numerator += 2;
						if(ans[i] == 6)
							numerator += 4;
						if(ans[i] == 4)
							numerator += 8;
						if(ans[i] == 2)
							numerator+= 16;
					}else {
						odds += 1;
						if(ans[i] == 9)
							denominator += 1;
						if(ans[i] == 7)
							denominator += 2;
						if(ans[i] == 5)
							denominator += 4;
						if(ans[i] == 3)
							denominator += 8;
						if(ans[i] == 1)
							denominator += 16;
					}
				}
				
				System.out.println(numerator + 1 + "/" + (denominator + 1));
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
