import java.util.Scanner;
public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][]=new int [10][10];
		int b[][]=new int [10][10];
		System.out.println("enter the no of rows of first");
		int m=sc.nextInt();
		System.out.println("enter the no of colomn first");
		int n=sc.nextInt();
		System.out.println("enter the no of rows of secnond");
		int p=sc.nextInt();
		System.out.println("enter the no of colomn second");
		int q=sc.nextInt();
		int c[][]=new int [10][10];
		System.out.println("enter elements of first matrix");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter elements of second matrix");
		for(int i=0;i<p;i++) {
			for(int j=0;j<q;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<q;j++) {
				for(int k=0;k<p;k++) {
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("the resultant is ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<q;j++) {
				System.out.print(c[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}
