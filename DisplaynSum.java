package fileHandlingInteger;
import java.util.StringTokenizer;
import java.util.Scanner;

public class DisplaynSum {
		public static void main(String arg[]){
			Scanner sc=new Scanner(System.in);
			System.out.print("enter integer :");
			String integer = sc.nextLine();
			StringTokenizer st=new StringTokenizer(integer);
			int sum=0,i;
			while(st.hasMoreTokens()) {
				i=Integer.parseInt(st.nextToken());
				System.out.println(i);
				sum=sum+i;
			}
			System.out.println("sum is "+sum);
			sc.close();
		}
}

		
	