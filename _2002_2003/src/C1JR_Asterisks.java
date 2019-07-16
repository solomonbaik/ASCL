import java.util.*;
import java.io.*;

public class C1JR_Asterisks {
	
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("0203c1jr.in"));
			
			//giant for loop
			for(int x = 0; x < 9; x++) {
			    String[] temp = in.nextLine().split(" ");
				char fig = temp[0].charAt(0);
				int[] nums = new int [2];
				nums[0] = Integer.parseInt(temp[1]);
				nums[1] = fig == 'B' ? Integer.parseInt(temp[2]) : nums[0];
				
				if(fig == 'S') 
					figureS(nums[0]);
				if(fig == 'H')
					figureH(nums[0]);
				if(fig == 'L')
					figureL(nums[0]);
				if(fig == 'B')
					figureB(nums[0], nums[1]);
			}
			
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void figureS(int height) {
		for(int i = 0; i < height; i++) {
			System.out.println();
			for(int j = 0; j < height; j++) {
				System.out.print("*");
			}
		}
		
	}
	
	public static void figureH(int height) {
		for(int i = 0; i < height; i++) {
			System.out.println();
			for(int k = height - i; k < height; k++) {
				System.out.print(" ");
			}
			for(int j = i; j < height; j++) {
				System.out.print("*");
			}
		}
	}
	
	public static void figureL(int height) {
		for(int i = 0;i < height;i++){
		    System.out.println();
			for(int j= height - i; j< height + 1; j++){
			    System.out.print("*");
			}
		}
	}
	
	public static void figureB(int length, int width) {
		for(int i = 0; i < width; i++) {
			System.out.println();
			for(int j = 0; j < length; j++) {
				System.out.print("*");
			}
		}
	}
	
	

}
