import java.util.*;
import java.io.*;
public class C1JR_DraftPicks {
	
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("1314c1jr.in"));
			for(int x = 0; x < 2; x++) {
				double ans1 = 0, ans2 = 0, ans3 = 0, ans4 = 0, ans5 = 0;
				double years = 0, value, avgsalary = 0, salary, avg16 = 0, avg18 = 0;
				int i = 0, j = 0;
				ArrayList<Double> lowest16 =new ArrayList<Double>();
				ArrayList<Double> highest18 =new ArrayList<Double>();
				for(int y = 0; y < 5; y++) {
					String[] temp = in.nextLine().split(" ");
					years = Double.parseDouble(temp[0]);
					value = Double.parseDouble(temp[1]);
					if(value / years > 10)
						ans1 += 1;
					avgsalary += (value / years);
					salary = value / years;
					lowest16.add(salary);
					highest18.add(salary);
				}
				
				System.out.println((int)(ans1));
					ans2 = (int)(avgsalary / years * 1000000);
				System.out.println((int)(ans2));
					Collections.sort(lowest16);
					ans3 = (int) Math.round(lowest16.get(0) * 1000000 / 16);
				System.out.println((int)(ans3));
					Collections.sort(highest18);
					ans4 = (int) Math.round(lowest16.get(4) * 1000000 / 18);
				System.out.println((int)(ans4));
					while(i <= 4) {
						avg16 += lowest16.get(i);
						i++;
					}
					avg16 = avg16 / 5 / 16;
					while(j <= 4) {
						avg18 += highest18.get(j);
						j++;
					}
					avg18 = avg18 / 5 / 18;
					ans5 = (avg16 - avg18) * 1000000;
				System.out.println((int)(ans5));
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
