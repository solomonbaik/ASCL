import java.util.*;
import java.io.*;
public class C1JR_NinetyNine {
	
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("1718c1jr.in"));
			for(int x = 0; x < 10; x++) {
				int score = in.nextInt(), temp;
				ArrayList <Integer> player = new ArrayList <Integer>();
				ArrayList <Integer> dealer = new ArrayList <Integer>();
				for(int i = 0; i < 4; i++) {
					player.add(in.nextInt());
				}
				for(int i = 0; i < 3; i++) {
					dealer.add(in.nextInt());
					player.add(in.nextInt());
				}
				//System.out.println(player);
				//System.out.println(dealer);
				while(true) {
					temp = player.remove(0);
					score += convert(temp, score);
					//System.out.println(temp+" "+score);
					if(score > 99) {
						System.out.println(score + ", dealer");
						break;
					}
					temp = dealer.remove(0);
					score += convert(temp, score);
					//System.out.println(temp+" "+score);
					if(score > 99) {
						System.out.println(score + ", player");
						break;
					}
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int convert(int i, int j) {
		if(i == 9)
			return 0;
		if(i == 4)
			return -10;
		if(i == 0) {
			if(11 + j > 99) {
				return 1;
			}else {
				return 11;
			}
		}
		return i;
	}
}
