import java.util.Scanner;

public class Frequency {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,count=0;
		System.out.println("enter the string");
		String word=sc.nextLine();
		System.out.println("enter the character");
		char ch =sc.nextLine().charAt(0);
		sc.close();
		for(i=0;i<word.length()-1;i++) {
			char x=word.charAt(i);
			if(ch==x)
				count=count+1;
		}
		System.out.println("frequency is "+count);
	}
}
