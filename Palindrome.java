package epam;
import java.util.*;
import java.util.stream.IntStream;

public class Palindrome {
	public static boolean isPalindrome(String x) {
	    String temp = x.replaceAll("\\s+", "").toLowerCase();
	    return IntStream.range(0,x.length() / 2)
	        .allMatch(i -> temp.charAt(i) == temp.charAt(temp.length() - i - 1));
	}

	public static void main(String[] args) {
		List<String> s=new ArrayList<String>();
		System.out.println("Enter number of strings");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter strings");
		for(int i = 0;i < n;i++) {
			s.add(sc.next());
		}
		System.out.println("Palindromic strings are: ");
		for(String i:s) {
			if(isPalindrome(i)) {
				System.out.println(i);
			}
		}
		}
		
}