import java.util.*;
import java.io.*;
public class C1JR_Scrabble {
	
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("1314c1jr.in"));
			for(int x = 0; x < 2; x++) {
				char[] word = in.nextLine().replace(" ","").toCharArray();			
				for(int i = 0; i < 5; i++) {
					int start = Integer.parseInt(in.nextLine());
					int sum = 0;
					boolean d = false, t = false;
					for(int j = 0; j < 4; j++) {
						int tPos = start + j;
						int temp = val(word[j]);
						if(tPos % 3 == 0 && tPos % 6 != 0) {
							temp *= 2;
						}else if(tPos % 5 == 0) {
							temp *= 3;
						}else if(tPos % 7 == 0) {
							d = true;
						}else if(tPos % 8 == 0) {
							t = true;
						}
						sum += temp;
					}
					if(d) {
						sum *= 2;
					}else if(t) {
						sum *= 3;
					}
					System.out.println(sum);
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static int val(char c) {
		if(c == 'A' || c == 'E') {
			return 1;
		}else if(c == 'D' || c == 'R') {
			return 2;
		}else if(c == 'B' || c == 'M') {
			return 3;
		}else if(c == 'V' || c == 'Y') {
			return 4;
		}else {
			return 8;
		}
	}
}
