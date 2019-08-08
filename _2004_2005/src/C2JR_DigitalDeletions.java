import java.util.*;
import java.io.*;
public class C2JR_DigitalDeletions {
	
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("0405c2jr.in"));
			for(int x = 0; x < 8; x++) {
				String[] input = in.nextLine().split(" ");
				ArrayList<Integer> temp = new ArrayList<Integer>();
				int max = 0, turns = 0, index = 0;
				for(int i = 0; i < input.length; i++) {
					temp.add(Integer.parseInt(input[i]));
				}
				while(temp.size() > 0) {
					for(int i = temp.size() - 1; i >= 0; i--) {
						if(temp.get(i) == 0) {
							for(int j = i; j >= 0; j--){
								temp.remove(j);
							}
							turns++;
							break;
						}
					}
					if(temp.size() == 0) {
						break;
					}
					//System.out.println(turns);
					//System.out.println(temp);
					for(int i = 0; i < temp.size(); i++) {
						max = Math.max(max, temp.get(i));
						//System.out.println("max: " + max);
						index = temp.lastIndexOf(max);
					}
					max = convert(max);
					temp.set(index, max);
					turns++;
				}
				System.out.println("turns: " + turns);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static int convert(int i) {
		if(i % 2 == 0) {
			return i -= 2;
		}else {
			return i -= 1;
		}
	}
}
