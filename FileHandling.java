package fileHandling;

import java.io.File;

public class FileHandling {
	public static void main(String[] args) {
		File f=new File("C:\\Users\\Admin\\Desktop\\javaWork\\fileHandling\\src\\fileHandling\\new.txt");
		
		if(f.exists()) {
			System.out.println("File name: "+f.getName());
			System.out.println("File location: "+f.getAbsolutePath());
			System.out.println("File writable: "+f.canWrite());
			System.out.println("File readable: "+f.canRead());
			System.out.println("last modified: "+f.lastModified());
		}
		else
			System.out.println("file does not exists");
	}

}
