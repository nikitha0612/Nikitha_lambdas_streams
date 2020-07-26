package epam;
import java.util.*;
public class Stringstartwith_a {

	public static void main(String[] args) {
		List<String> s=new ArrayList<String>();
		System.out.println("Enter number of strings");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter strings");
		for(int i = 0;i < n;i++) {
			s.add(sc.next());
		}
		s.stream().filter((i) -> i.startsWith("a") && i.length() == 3)
        .forEach(System.out::println);
		
		

	}

}
