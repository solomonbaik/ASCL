import java.util.*;
import java.io.*;
public class C1JR_AGRAM {
	
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("1617c1jr.in"));
			for(int x = 0; x < 10; x++) {
				String[] temp = in.nextLine().split(" ");
				int[] ans = new int[10];
				String leadsuit = temp[1];
				int leadnumber = Integer.parseInt(temp[0]);
				boolean none = false;
				for(int i = 3; i < 12; i+=2) {
					if(temp[i].equals(leadsuit)) {
						break;
					}else {
						if(i == 11) {
							none = true;
						}
					}
				}
				if(none) {
					System.out.println("NONE");
					continue;
				}
				for(int i = 0; i < 10; i++) {
					if(temp[i + 2].equals(leadsuit)) 
						ans[i] = Integer.parseInt(temp[i + 1]);
				}
				Arrays.sort(ans);
				for(int i = 0; i < 10; i++) {
					if(ans[i] <= leadnumber)
						continue;
					else if(ans[i] > leadnumber) {
						System.out.println(ans[i] + ", " + leadsuit);
					}else {
						for(int j = 0; j < 10; j++) {
							if(ans[j] == 0) {
								continue;
							}else {
								System.out.println(ans[j] + ", " + leadsuit);
								break;
							}
						}
					}
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
