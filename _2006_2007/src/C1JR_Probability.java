import java.util.*;
import java.io.*;
public class C1JR_Probability {
	
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("0506c1jr.in"));
			for(int i = 0; i < 5; i++) {
				String [] temp = in.nextLine().split(" ");
				int total, reds, blues;
				String ans;
				boolean replace = false;
				
				if(temp[0].equals("2")) {
					reds = Integer.parseInt(temp[1]);
					blues = Integer.parseInt(temp[2]);
					total = reds + blues;
					if(temp[3].equals("Y"))
						replace = true;
					if(temp[4].equals("R")) {
						if(temp[5].equals("R")) {
							if(replace) {
								ans = (reds * reds) + "/" + (Math.pow(total,  2));
							}else {
								ans = (reds * (reds - 1)) + "/" + (total * (total - 1));
							}
						}else {
							if(replace) {
								ans = (reds * blues) + "/" + (total * total);
							}
							else {
								ans = (reds * blues) + "/" + (total * (total - 1));
							}
						}
					}else {
						if(temp[5].equals("B")) {
							if(replace) {
								ans = blues * blues + "/" + (total * total);
							}
							else {
								ans = (blues * (blues - 1)) + "/" + (total * (total - 1));
							}
						}
						else {
							if(replace) {
								ans = (reds * blues) + "/" + (total * total);
							}
							else {
								ans = (reds * blues) + "/" + (total * (total - 1));
							}
						}
					}
				}else {
					reds = Integer.parseInt(temp[1]);
					blues = Integer.parseInt(temp[2]);
					total = reds + blues;
					if(temp[3] == "R") {
						ans = reds + "/" + total;
					}else {
						ans = blues + "/" + total;
					}
				}
				System.out.println(ans);
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
	}

}
