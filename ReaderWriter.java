package fileHandllingWriterReader;
import java.io.*; 
import java.util.Scanner;
public class ReaderWriter {
	public static void main(String arg[]) throws FileNotFoundException {
		Scanner sc=new Scanner(System.in);
		try {
			FileWriter f=new FileWriter("new.txt");
			try {
				System.out.print("enter string to write :");
				String input =sc.nextLine();
				f.write(input);
			}
			finally {
				f.close();
			}
			System.out.println("data writed successfully!");
		}
		catch(IOException i) {
			System.out.println(i);
		}
		FileReader r=new FileReader("new.txt");
		try {
			char a[]=new char [50];
			r.read(a);
			System.out.println(a);
			r.close();
		}
		catch(IOException i) {
			System.out.println("exception handled");
		}
	}
}
