package epam;
import java.util.*;
interface Average{
	int avg(int[] arr,int n);
}
public class Average_of_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of integers in array");
		int n =sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter array integers");
		for(int i = 0; i < n;i++) {
			arr[i] = sc.nextInt();
		}
		Average a1=(int[] x,int y)->{
			int s = 0;
			for(int i = 0 ;i <n;i++) {
				s += x[i];
            }; 
            return s/y;
		};
        System.out.println("Average of given list of integers is " + a1.avg(arr,n)); 
	}
}
		
