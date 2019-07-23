import java.util.*;
import java.io.*;
public class C1JR_Poker {

	
	public static void main(String[] args) {
			
		
		try {
			
			Scanner in = new Scanner(new File("0405c1jr.in"));
			
			
			for(int x = 0; x < 9; x++) {
				 boolean pair = false, three = false, four = false;

				String[] temp = in.nextLine().split(" ");
				int[] ans = new int[temp.length];
				int[] nums = new int[13];
				
				Arrays.sort(temp);
				
				for(int i = 0; i < temp.length; i++) {
					ans[i] = Integer.parseInt(temp[i]);
					ans[i] = ans[i] % 13;
					nums[ans[i]] += 1;
				}
				
				for(int i = 0; i < nums.length; i++) {
					if(nums[i] == 2) {
						pair = true;
					}
					if(nums[i] == 3) {
						three = true;
					}
					if(nums[i] == 4) {
						four = true;
					}
					
				}
				if(four) {
					System.out.println("FOUR OF A KIND");
				}else if(pair && three) {
					System.out.println("FULL HOUSE");
				}else if(three) {
					System.out.println("THREE OF A KIND");
				}else if(pair) {
						System.out.println("PAIR");
				}else {
					System.out.println("NONE");
				}
				
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
