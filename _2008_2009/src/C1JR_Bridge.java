import java.util.*;
import java.io.*;
public class C1JR_Bridge {
	static int bid, tricks, line;
	static String suit;
	
	public static void main(String[] main) {
		try {
			
			Scanner in = new Scanner(new File("0809c1jr.in"));
			
			for(int x = 0; x < 10; x++) {
				
				String [] temp = in.nextLine().split(" ");
				bid = Integer.parseInt(temp[0]);
				tricks = Integer.parseInt(temp[1]);
				suit = temp[2];
				line = bid + 6;
				if(tricks == line) {
					equalTo(suit, bid);
				}else if(tricks < line) {
					lessThan(suit, tricks);
				}else {
					greaterThan(suit, tricks, bid);
				}
				
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	public static void lessThan(String s, int i) {
		if(s.equals("H") || s.equals("S")) {
			System.out.println((i - 6) * 30 + ", 0 ");
		}else if(s.equals("C") || s.equals("D")) {
			System.out.println((i - 6) * 20 + ", 0");
		}else {
			System.out.println((i - 6) * 30 + 10 + ", 0");
		}
	}
	
	public static void greaterThan(String s, int i, int j) {
		if(s.equals("H") || s.equals("S")) {
			System.out.println(bid * 30 + "," + ((tricks - bid - 6) * 30));
		}else if(s.equals("C") || s.equals("D")) {
			System.out.println(bid * 20 + "," + ((tricks - bid - 6) * 20));
		}else {
			System.out.println(bid * 30 + 10 + "," + ((tricks - bid - 6) * 30));
		}
	}
	
	public static void equalTo(String s, int i) {
		if(s.equals("H") || s.equals("S")){
			System.out.println(i * 30 + ", 0");
		}else if(s.equals("C") || s.equals("D")) {
			System.out.println(i * 20 + ", 0");
		}else {
			System.out.println(bid * 30 + 10 + ", 0");
		}
				
	}
}
