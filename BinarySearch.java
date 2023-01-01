import java.util.Scanner;
public class BinarySearch {
	BinarySearch(int a[]){
		this.a=a;
	}
	int i,n;
	int a[]=new int[10];
	Scanner sc=new Scanner(System.in);
	void read(int n){
		System.out.print("enter array elements :");
	    for(i=0;i<n;i++)
	    	a[i]=sc.nextInt();
	    display(n);
	}
	void display(int n){
	    for(i=0;i<n;i++)
	    	System.out.println(a[i]+"	");
	}
	void bubbleSort(int a[],int n){
	    int i,j,temp;
	    for(i=0;i<n-1;i++){
	        for(j=0;j<n-1-i;j++){
	            if(a[j]>a[j+1]){
	                temp=a[j];
	                a[j]=a[j+1];
	                a[j+1]=temp;
	            }
	        }
	    }
	    display(n);
	}
	void binary(int a[],int n,int key)
	{
	    int begin=0,end=n-1,flag=0;
	    int mid=(begin+end)/2;
	    while(begin<=end)
	    {
	        if(a[mid]==key)
	        {
	            flag=1;
	            break;
	        }
	        else if(key<a[mid])
	            end=mid-1;
	        else
	            begin=mid+1;
	        mid=(begin+end)/2;
	    }
	    if(flag==1) {
	    	System.out.println("element found at "+mid);
	    	System.out.println("flag is "+flag);
	    }
	    else {
	        System.out.println("element not found");
	    	System.out.println("flag is "+flag);
	    }
	    for(i=0;i<n;i++)
			System.out.println(a[i]+"	");
	}
}
class Main{
	public static void main(String[] args) {
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		BinarySearch ob=new BinarySearch(a);
		System.out.print("enter no of elements : ");
		int n=sc.nextInt();
		ob.read(n);
		System.out.print("enter key to search : ");
		int key=sc.nextInt();
		ob.bubbleSort(a, n);
		ob.binary(a, n, key);
		sc.close();
	}
}
