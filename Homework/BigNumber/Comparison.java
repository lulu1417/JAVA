
public class Comparison implements IOperation{
	public String perform(String num1, String num2) {
		  int len1 = num1.length();
	        int len2 = num2.length();
	        if (len1 > len2) {
	            return ">";
	        } else if (len1 < len2) {
	            return "<";
	        }

	        int index = 0;
	        while (true) {
	            if (num1.charAt(index) > num2.charAt(index)) {
	                return ">";
	            } else if (num1.charAt(index) < num2.charAt(index)) {
	                return "<";
	            } else {
	                if (index == len1 - 1) {
	                    return "=";
	                }
	                index++;
	            }
	        }
	}
}
