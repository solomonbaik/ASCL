import java.util.*;
import java.io.*;
public class C1JR_PostOffice {
	
public static void main(String [] args) {
		
				
	try {
			Scanner in = new Scanner(new File("0506c1jr.in"));
			
		for(int x = 0; x < 10; x++) {
			double length = 0, height = 0, thick = 0;
			boolean regularpost = true, largepost = true, envelope = true, largeenvelope = true, Package = true, largepackage = true, unmailable = false;

			double[] num = new double[3];
			num[0] = in.nextDouble();
			num[1] = in.nextDouble();
			num[2] = in.nextDouble();
			length = num[0];
			height = num[1];
			thick = num[2];
			
			if(length < 3.5) {
				unmailable = true;
			}
			if(length > 4.25) {
				regularpost = false;
			}
			if(length > 6) {
				largepost = false;
			}
			if(length > 4) {
				regularpost = false;
			}
			if(length < 6) {
				largeenvelope = false;
			}
			if(height < 3.5) {
				unmailable = true;
			}
			if(height > 6) {
				regularpost = false;
			}
			if(height < 5) {
				envelope = false;
				largepost = false;
			}
			if(height < 11) {
				largeenvelope = false;
			}
			if(height > 18) {
				largeenvelope = false;
			}
			if(height > 11.5) {
				largepost = false;
				envelope = false;
			}
			if(thick < 0.007) {
				unmailable = true;
			}
			if(thick > 0.016) {
				regularpost = false;
				largepost = false;
			}
			if(thick <0.25) {
				envelope = false;
			}
			if(length < 24) {
				Package = false;
				largepackage = false;
			}
			if(height < 18) {
				Package = false;
				largepackage = false;
			}
			if(thick <= 0.5) {
				Package = false;
				largepackage = false;
			}else {
				envelope = false;
				largeenvelope = false;
			}
			if (!(length + 2 * (thick + height) > 84)){
				Package = false;
			}
			if (!(length + 2 * (thick + height) > 84)){
				largepackage = false;
			}
			if(unmailable) {
				System.out.println("UNMAILABLE");
			}else
			if(regularpost) {
				System.out.println("REGULAR POST CARD");
			}else
			if(largepost) {
				System.out.println("LARGE POST CARD");
			}else
			if(envelope) {
				System.out.println("ENVELOPE");
			}else
			if(largeenvelope) {
				System.out.println("LARGE ENVELOPE");
			}else
			if(Package) {
				System.out.println("PACKAGE");
			}else
			if(largepackage) {
				System.out.println("LARGE PACKAGE");
			}
		}
	}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}
