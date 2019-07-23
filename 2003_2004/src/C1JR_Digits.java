import java.util.*;
import java.io.*;
public class C1JR_Digits {
	
	public static void main(String[] args) {
		
		try {
			// 1.set up input file
			Scanner in = new Scanner(new File("0304c1jr.in"));
			
			// 2.giant for loop
			for(int x = 0; x < 10; x++) {
				
				// 2a.organize data
				String temp = in.nextLine();
				int indexL = 0;
				
				for(int i = 0; i < temp.length(); i++) {
					char og = temp.charAt(indexL);
					if(og < temp.charAt(i))
						indexL = i;
				}
				
				temp = temp.substring(0,  indexL) + changeNum(temp.charAt(indexL)) + temp.substring(indexL + 1);
				
				System.out.println(Integer.parseInt(temp));
				
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static char changeNum(char n) {
		int num = Character.getNumericValue(n);
		if(num % 2 == 1)
			return '0';
		return (char)('0' + (num + 4) % 10);
	}

}
