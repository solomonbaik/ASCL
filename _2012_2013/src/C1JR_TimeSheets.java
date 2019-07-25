import java.util.*;
import java.io.*;
public class C1JR_TimeSheets {
	
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("1213c1jr.in"));
			for(int y = 0; y < 2; y++){
				double ans = 0;
				for(int x = 0; x < 4; x++) {
			        String[] temp = in.nextLine().split(" ");
			        int location = Integer.parseInt(temp[0]);
			        char start = temp[1].charAt(0);
			        char end = temp[2].charAt(0);
			        int startTime = Character.getNumericValue(start);
			        int endTime = Character.getNumericValue(end);
			        double workHours = (Math.abs(endTime - startTime) / 2.0);
			
			        if(location <= 9 && location >= 1) {
			            ans += workHours * 10;
			            System.out.println("$" + String.format("%.2f", (workHours * 10)));
			        }else if(location <= 19 && location >= 10) {
			              if(workHours > 4) {
			            	  ans += 32 + (workHours - 4) * 12;
			            	  System.out.println("$" + String.format("%.2f", (32 + (workHours - 4) * 12)));
			              }else {
			            	  ans += workHours * 8;
			                  System.out.println("$" + String.format("%.2f",  (workHours * 8)));
			              }
			        }else {
			            if(workHours > 4) {
			            	ans += 48 + (workHours - 4) * 24;
			            	System.out.println("$" + String.format("%.2f", (48 + (workHours - 4) * 24)));
			            }else {
			            	ans += workHours * 12;
			            	System.out.println("$" + String.format("%.2f",  (workHours * 12)));
			            }
			        }
	        	 }
				System.out.println("$" + ans + "0");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}