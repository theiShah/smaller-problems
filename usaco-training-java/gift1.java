/*
ID: ishansh2
LANG: JAVA
TASK: gift1
*/
import java.io.*;
import java.util.*;

class gift1 {
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
                                                  // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
    // Use StringTokenizer vs. readLine/split -- lots faster
    StringTokenizer st = new StringTokenizer(f.readLine());
						  // Get line, break into tokens

    int friends = Integer.parseInt(st.nextToken());
    String[] names = new String[friends]; 
    int[] money = new int[friends]; 
    for(int i = 0; i < friends; i++) {
    	names[i] = f.readLine(); 
    	money[i] = 0; 
    }
    String s = f.readLine(); 
    while(s != null) {
    	 int gifter = personCalculator(s, names); 
    	 st = new StringTokenizer(f.readLine()); 
    	 int giftMoney = Integer.parseInt(st.nextToken());
    	 int giftFriends = Integer.parseInt(st.nextToken());
    	 if(giftFriends != 0) {
	    	 int gift = giftMoney / giftFriends; 
	    	 money[gifter] += giftMoney%giftFriends; 
	    	 money[gifter] -= giftMoney; 

	    	 for(int i = 0; i < giftFriends; i++) {
	    	 	int giftPerson = personCalculator(f.readLine(), names); 
	    	 	money[giftPerson] += gift; 
	    	 }  
	     }
    	 s = f.readLine(); 
    }

    for(int i = 0; i < friends; i++) {
    	out.println("" + names[i] + " " + money[i]); 
    }
    out.close(); 
	}

	static int personCalculator(String s, String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(s)) 
				return i; 
		}
		return -1; 
	}
}