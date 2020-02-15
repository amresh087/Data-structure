/*
1) Let input string be 'str[]' and length of string be 'n'
2) l = 0, r = n-1
3) While l is smaller than r, do following
    a) If str[l] is not an alphabetic character, do l++
    b) Else If str[r] is not an alphabetic character, do r--
    c) Else swap str[l] and str[r]
    
	*/

package Array;

public class ReverseStringWithoutSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "a!!!b.c.d,e'f,ghi";
		char[] charArray = str.toCharArray();

		System.out.println("Input string: " + str);
		reverse(charArray);
		String revStr = new String(charArray);

		System.out.println("Output string: " + revStr);

	}

	public static void reverse(char[] str) {
		int l = 0;
		int r = str.length - 1;
		while (l < r) {
			if (!Character.isAlphabetic(str[l]))
				l++;
			else if (!Character.isAlphabetic(str[r]))
				r--;
			else {
				char temp = str[l];
				str[l] = str[r];
				str[r] = temp;
				l++;
				r--;
			}
		}

	}

}
