import java.text.DecimalFormat;
import java.lang.Math;
import java.util.Scanner;
public class hw2 {
	public static void main(String[] args) {

		double answer1, answer2;
		
		Scanner scannerObject  = new Scanner(System.in);

			double a = scannerObject.nextDouble();
			double b = scannerObject.nextDouble();
			double c = scannerObject.nextDouble();
			String str = scannerObject.next();
			
			double d = b*b-4*a*c;
			
		//calculate
			answer1 = ((-b+Math.sqrt(d))/(2*a));
			answer2 = ((-b-Math.sqrt(d))/(2*a));	
		
			DecimalFormat pattern = new DecimalFormat(str); //indicate the printing form of the answers 
			
		
			if(d==0) { //only one root exists
					System.out.println(pattern.format(answer1));
			}
			
			else if(d>0) { //there are 2 roots
				if( a > 0 ) {
					if (answer1 > answer2)
						System.out.println(pattern.format(answer1)+"\n"+pattern.format(answer2));
					else
						System.out.println(pattern.format(answer2)+"\n"+pattern.format(answer1));
				}
				
				else { 
					if (answer1 < answer2)
						System.out.println(pattern.format(answer1)+"\n"+pattern.format(answer2));
					else
						System.out.println(pattern.format(answer2)+"\n"+pattern.format(answer1));
				}
			}	
		
	}

}
