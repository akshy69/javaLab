import java.util.Scanner;
public class Small {
	public static void main(String[] args) {
		int i,j;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("enter no of elements");
		int n=sc.nextInt();
		System.out.println("enter elements to array");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<n;i++) {
			for(j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("second smallest no is "+a[1]);
	}

}
