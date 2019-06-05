
public class Subtraction implements IOperation{
	public String perform(String num1, String num2) {
    		String res;
    		
            char[] arr1 = new StringBuilder(num1).reverse().toString()
                    .toCharArray();
            char[] arr2 = new StringBuilder(num2).reverse().toString()
                    .toCharArray();

            int len1 = arr1.length;
            int len2 = arr2.length;
            int len = len1 > len2 ? len1 : len2;
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                int ch1 = i < len1 ? (arr1[i]-'0') : 0;
                int ch2 = i < len2 ? (arr2[i]-'0') : 0;
                arr[i] = ch1 - ch2;
            }

            for (int i = 0; i < len; i++) {
                if (arr[i] < 0) {
                    arr[i + 1] -= 1;
                    arr[i] += 10;
                }
            }

            StringBuilder result = new StringBuilder();
            boolean flag = false;
            for (int i = len - 1; i >= 0; i--) {
                if (arr[i] == 0 && flag == false) {
                    continue;
                } else {
                    flag = true;
                }
                result.append(arr[i]);
            }
            res = result.toString();
            return res;
        }

}
