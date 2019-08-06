import java.util.*;
import java.io.*;
public class C2JR_StringStats {
	
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("1819c2jr.in"));
			Set<Character> c = new HashSet<Character>();
			String s = in.nextLine();
			String temp = s.toLowerCase().replaceAll("[^a-z]", "");
			System.out.println(temp);
			for(int i = 0; i < temp.length(); i++)
				c.add(temp.charAt(i));
			System.out.println(c.size());
			
			//2
			
			String _2 = temp.replaceAll("[^aeiou]", "");
			System.out.println(_2.length());
			
			//3
			
			String _3 = s.replaceAll("[^A-Z]", "");
			System.out.println(_3.length());
			
			//4
			
			Map<Character, Integer> m = new HashMap<Character, Integer>();
			for(int i = 0; i < temp.length(); i++) {
				char key = temp.charAt(i);
				if(m.containsKey(key)) {
					m.put(key, m.get(key)+1);
				}else {
					m.put(key,  1);
				}
			}
			int max = 0;
			for(char key: m.keySet()) {
				max = Math.max(max,  m.get(key));
			}
			
			System.out.println(max);
			
			//5
			
			String[] ans = s.replaceAll("[^a-zA-Z0-9\\s]", "").split(" ");
			int longest = 0;
			for( int i = 0; i < ans.length; i++) {
				longest = Math.max(longest, ans[i].length());
			}
			for(int i = 0; i < ans.length; i++) {
				if(longest == ans[i].length()) {
					System.out.println(ans[i]);
					break;
				}
				continue;
			}
				
				
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
