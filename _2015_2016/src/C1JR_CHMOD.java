import java.util.*;
import java.io.*;
public class C1JR_CHMOD {
	
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("1516c1jr.in"));
			//creates 5 runs for the 5 lines of input
			for(int i =0; i < 5; i++){
				//creates array to hold binary form of input
				  String[] octal = in.nextLine().split(" ");
				  //creates array to hold read - write - execute values of input
				  String[] perm = new String[3];
				  //creates 3 runs to input binary values of each number into octal
				  for(int j = 0; j < octal.length; j++){
						octal[j] = Integer.toBinaryString(Integer.parseInt(octal[j]));
						//creates condition that if each binary length is less than 3, than add a 0 to the front until it's length 3
				  	while(octal[j].length() < 3)
				      octal[j] = "0" + octal[j];
				  }
				  //creates a loop running 3 times to convert from binary form to read - write - execute form
				  for(int x = 0; x < 3; x++){
				    if(octal[x].charAt(0) == '1')	perm[x] += "r"; //if the one is the first number, it's read
				    else	perm[x] += "-";
				    
				    if(octal[x].charAt(1) == '1')	perm[x] += "w";//if the one is the second number, it's write
				    else	perm[x] += "-";
				    
				    if(octal[x].charAt(2) == '1')	perm[x] += "x";//if the one is the third number, it's execute
				    else	perm[x] += "-";
				    perm[x]+=" ";
				  }
				  for(int j = 0; j < 3; j++) {
					  System.out.print(octal[j] + " ");
				  }
				  System.out.print(" and ");
				  for(int j = 0; j < 3; j++) {
					  System.out.print(perm[j].replace("null", ""));
				  }
				  System.out.println();
				}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
