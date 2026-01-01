/** Checks if a given string is a palindrome. */
public class Palindrome {

	public static void main(String[]args) {
		String s = args[0];
    	System.out.println(isPalindrome(s));
    }
	
	/** Checks if the given string is a palindrome. */
	public static boolean isPalindrome(String s) {
		if (s.length() <= 1) return true;
		if (s.charAt(0) != s.charAt(s.length()-1)) return false;
		return isPalindrome(s.substring(1, s.length()-1));
    }
}