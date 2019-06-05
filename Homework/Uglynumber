import java.text.DecimalFormat;
import java.lang.Math;
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class hw3 {
	public static boolean isSpecial(int n) { 
		if (n == 0) 
			return false; 
		while (n % 5 == 0) 
			n /= 5; 
		while (n % 3 == 0) 
			n /= 3; 
		while (n % 2 == 0) 
			n /= 2; 
		return n == 1; 
	}

	public static int specailNumber(int index) { 
		int n = 0; 
		int specailCount = 0; 

		while (specailCount < index) { 
			n++; 
			if (isSpecial(n)) { 
				specailCount++; 
			} 
		} 
		return n; 
} 

	public static void main(String[] args) {

		   Scanner scannerObject = new Scanner(System.in);
		   String input = scannerObject.nextLine();
		   String[] parts = input.split("=");
		   String part1 = parts[0]; 
		   String part2 = parts[1]; 
		   int n = Integer.valueOf(part2);
		   
		   if( part1.equals("X") ) {
			  System.out.println( isSpecial(n) );
		   }
		    
		   else if( part1.equals("Y")){
			   System.out.println( specailNumber(n) );
		   }
	
	}
	
}
