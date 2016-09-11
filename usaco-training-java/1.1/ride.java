/*
ID: ishansh2
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;

class ride {
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    BufferedReader f = new BufferedReader(new FileReader("ride.in"));
                                                  // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
    String name = f.readLine(); 
    String group = f.readLine(); 
    int name_mod = 1; 
    int group_mod = 1; 
    for(int i = 0; i < name.length(); i++) {
    	name_mod *= Character.getNumericValue(name.charAt(i)) - 9; 
    }
    for(int i = 0; i < group.length(); i++) {
    	group_mod *= Character.getNumericValue(group.charAt(i)) - 9; 
    }
    if( (name_mod%47) == (group_mod%47) ) {
    	out.println("GO"); 
    } else {
    	out.println("STAY");
    } 
    out.close(); 
	}
}