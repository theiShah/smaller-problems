/*
ID: ishansh2
LANG: JAVA
TASK: friday
*/
import java.io.*;
import java.util.*;

class friday {
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    BufferedReader f = new BufferedReader(new FileReader("friday.in"));
                                                  // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
    // Use StringTokenizer vs. readLine/split -- lots faster
    StringTokenizer st = new StringTokenizer(f.readLine());
						  // Get line, break into tokens
    int finishTime = Integer.parseInt(st.nextToken()); 

    int thirteenCount[] = new int[7]; 
    int weekday = 1; //This keeps track of what day of the week it is, because weekday++ happens first I set this to Sun so first day is Mon
    int year = 1900; 
    int day = 0; 

    //Sets it all to 0 
    for(int i = 0; i < thirteenCount.length; i++) {
    	thirteenCount[i] = 0; 
    }

    for(int i = 0; i < finishTime; i++) {
    	for(int m = 0; m < 12; m++) {

    		int monthLength = dayCalculator(m, year);     
    		for(int d = 0; d < monthLength; d++) {
    			weekday++; 
    			day++; 
    			if(weekday >= 7) { //resets when it goes past Friday to Saturday
    				weekday = 0; 
    			}
    			if(d == 12) { //Because days start at 0
    				thirteenCount[weekday]++; //The actual incrementing bit 
    			}
    		}
    	}
    	//System.out.println(day + " " + year); 
    	day = 0; 
    	year++; 
    }

    for(int i = 0; i < thirteenCount.length - 1; i++) {
    	out.print(thirteenCount[i] + " "); 
    }
    out.println(thirteenCount[thirteenCount.length-1]); 
    out.close(); 
	}

	static int dayCalculator(int month, int year) {
		if(month%2 == 0 && month <= 6) { //Odd month and not July 
			return 31; 
		}
		if(month%2 == 1 && month >=6) {
			return 31; 
		}
		if(month == 1 && (year%4 == 0) && (year%100 != 0)) { //Leap Year
			return 29; 
		}
		if(month == 1 && (year%400 == 0)) { //exception Leap Year
			return 29; 
		}
		if(month == 1) {
			return 28; 
		}
		return 30; 
	}

}