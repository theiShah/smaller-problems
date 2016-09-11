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

    int lines = 0; 
    int friends = Integer.parseInt(st.nextToken());
    lines++; 
    String[] names = new String[friends]; 
    int[] money = new int[friends]; 
    for(int i = 0; i < friends; i++) {
    	names[i] = f.readLine(); 
    	money[i] = 0; 
    	lines++; 
    }
    System.out.println(lines + ""); 
    for(int i = 0; i < friends && f.ready(); i++) {

    	String gifter = f.readLine(); 
    	lines++; 
    	System.out.println(lines + ""); 

    	for (int j = 0; j < friends ; j++ ) {
    			if(names[j].equals(gifter)) {
    				break; 
    			}
    		i = j; 
    	}

    	st = new StringTokenizer(f.readLine()); 
    	lines++; 
    	System.out.println(lines + ""); 
    	money[i] -= Integer.parseInt(st.nextToken()); 
    	int gifts = Integer.parseInt(st.nextToken());
    	int giftMoney = money[i]/gifts; 
    	for(int l = 0; l < gifts; l++) {
    		String friend = f.readLine(); 
    		lines++; 
    		System.out.println(lines + "");
    		for (int j = 0; j < friends ; j++ ) {
    			if(names[j].equals(friend)) {
    				break; 
    			}
    			money[j] += giftMoney; 
    			money[i] -= giftMoney; 
    		}
    	}
    	System.out.println(lines + "");
    }
    for(int i = 0; i < friends; i++) {
    	out.println("" + names[i] + " " + money[i]); 
    }
    out.close(); 
	}
}