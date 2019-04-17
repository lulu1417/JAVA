import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.text.DecimalFormat;
import java.lang.Math;
import java.math.*;

public class hw4 {
	public static void main(String[] args) {
		double r, n, guess=2;
		Scanner keyboardScanner = new Scanner(System.in);
		n = keyboardScanner.nextDouble();
		r = n/guess;
		guess = (guess+r)/2;
		r = n/guess;
		while (guess-((guess+r)/2)>0.01) {
			r = n/guess;
			guess = (guess+r)/2;
		}
		DecimalFormat pattern = new DecimalFormat("0.00");
		String ans = pattern.format(guess);
		ans = ans.replaceAll("0+?$", "");
		ans = ans.replaceAll("[.]$", "");
		System.out.println(ans);
	}
}
