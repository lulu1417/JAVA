
import java.util.Scanner;
import java.util.StringTokenizer;

public class Piglatin {
	
	static boolean isVowel(char c){
		
		return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || 
	            c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'); 
	
	} 
	
	static String pigLatin(String s) { 
		  
	    // the index of the first vowel is stored. 
	    int len = s.length(); 
	    int index = -1; 

	    if (isVowel(s.charAt(0)))
	    	index = 0;  
	    else {
			index = 1;
		}
	    if (index == -1) 
	        return "-1"; 
	  
	    return s.substring(index) + s.substring(0, index) + "ay"; 
	} 
	
	static String convert(String sentence) {
		
        char ch[] = sentence.toCharArray(); 
        
        for (int i = 0; i < sentence.length(); i++) { 
  
            if (i == 0 && ch[i] != ' ' ||  ch[i] != ' ' && ch[i - 1] == ' ') { 
  
                if (ch[i] >= 'a' && ch[i] <= 'z') { 
  
                    ch[i] = (char)(ch[i] - 'a' + 'A'); 
                } 
            } 
  
            else if (ch[i] >= 'A' && ch[i] <= 'Z')  
            	
                ch[i] = (char)(ch[i] + 'a' - 'A');             
        } 
  
        String st = new String(ch); 
        return st; 
		
	}
	
	public static void main(String[] args) {
		
		Scanner scannerObject  = new Scanner(System.in);

		String str = scannerObject.nextLine();
		StringTokenizer token = new StringTokenizer(str, " ");
		
		int i=0, count=0;
		String tokens[] = new String[20];
		while(token.hasMoreTokens()) {
			tokens[i] = token.nextToken();
			count++;
			i++;
		}	
		i=0; 
		while(i<count) {
			pigLatin(tokens[i]);
			System.out.print(convert(pigLatin(tokens[i])));
			if(i<count-1)
				System.out.print(" ");
			i++;
		}
		
	}

}
