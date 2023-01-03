
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		String rev="";
		System.out.println("enter the string ");
		String a=sc.nextLine();
		sc.close();
		int n=a.length();
		for(i=n-1;i>=0;i--)
			rev=rev+a.charAt(i);
		System.out.println("reversed string is "+rev);
		if(a.equals(rev))
			System.out.println("it is palindrome");
		else
			System.out.println("it is not palindrome");
	}
	
}
