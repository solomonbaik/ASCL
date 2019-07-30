import java.util.*;
import java.io.*;
public class C1JR_NavigatingASCLland {
	
	public static void main(String [] args) {
		try {
			Scanner in = new Scanner(new File("1415c1jr.in"));
			for(int x = 0; x < 2; x++) {
				String[] firstLine = in.nextLine().split(" ");
				double mpg = Double.parseDouble(firstLine[0]);
				double ppg = Double.parseDouble(firstLine[1]);
				double avgspeed = Double.parseDouble(firstLine[2]);
				
				for(int y = 0; y < 5; y++) {
					String[] fiveLines = in.nextLine().split(" ");
					String location1 = fiveLines[0], location2 = fiveLines[1];
					double distance = 0, time, cost;
					if(location1.equals("A")) {
						if(location2.equals("B")) {
							distance = 450;
						}else if(location2.equals("C")) {
							distance = 590;
						}else if(location2.equals("D")) {
							distance = 710;
						}else if(location2.equals("E")) {
							distance = 1030;
						}else if(location2.equals("F")) {
							distance = 1280;
						}else{
							distance = 1360;
						}
					}else if(location1.equals("B")) {
						if(location2.equals("C")) {
							distance = 140;
						}else if(location2 .equals("D")) {
							distance = 260;
						}else if(location2.equals("E")) {
							distance = 580;
						}else if(location2.equals("F")) {
							distance = 830;
						}else{
							distance = 910;
						}
					}else if(location1.equals("C")) {
						if(location2.equals("D")) {
							distance = 120;
						}else if(location2.equals("E")) {
							distance = 440;
						}else if(location2.equals("F")) {
							distance = 690;
						}else {
							distance = 770;
						}
					}else if(location1.equals("D")) {
						if(location2.equals("E")) {
							distance = 320;
						}else if(location2.equals("F")) {
							distance = 570;
						}else {
							distance = 650;
						}
					}else if(location1.equals("E")) {
						if(location2.equals("F")) {
							distance = 250;
						}else {
							distance = 330;
						}
					}else{
						distance = 80;
					}
					System.out.print((int)(distance));
					time = distance / avgspeed;
					System.out.print(", " + ((int)(time) + ":" + String.format("%.0f",((time % ((int)time)) * 60))));
					System.out.println(", $" + (String.format("%.2f",(distance / mpg * ppg))));
				}
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
