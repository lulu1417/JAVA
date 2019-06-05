import java.util.Arrays;

import javax.naming.spi.DirStateFactory.Result;

public class Addition implements IOperation{
	public String perform(String num1, String num2) {
    	String res;
        int len1 = num1.length();
        int len2 = num2.length();
        char[] arr1 = new StringBuilder(num1).reverse().toString()
                .toCharArray();
        char[] arr2 = new StringBuilder(num2).reverse().toString()
                .toCharArray();

        int len = len1 > len2 ? len1 : len2;
        int[] arr = new int[len + 1];
        for (int i = 0; i < len + 1; i++) {
            int n1 = i < len1 ? (arr1[i]-'0') : 0;
            int n2 = i < len2 ? (arr2[i]-'0') : 0;
            arr[i] = n1 + n2;
        }

        for (int i = 0; i < len + 1; i++) {
            if(arr[i] > 10){
                	arr[i+1] += arr[i] / 10;
                	arr[i] = arr[i] % 10;
            }	
        }

        StringBuilder result = new StringBuilder();
        boolean flag = true;
        for(int i=len;i>=0;i--){
            if(arr[i] == 0 && flag){
                continue;
            }else{
                flag = false;
            }
            result.append(arr[i]);

        }
        res = result.toString();
        return res;
    }

}
