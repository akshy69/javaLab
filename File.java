import java.io.*;
class File {
	public static void main(String args[]) {
		try {
			FileReader fin1 = new FileReader("file1.txt");
			FileReader fin2 = new FileReader("file2.txt");
			FileWriter fout = new FileWriter("file3.txt");
			int i;
			while ((i = fin1.read()) != -1)
				fout.write(i);
			while ((i = fin2.read()) != -1)
				fout.write(i);
			fin1.close();
			fin2.close();
			fout.close();
			System.out.println("file writed successfully in file3.txt");
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}
}
