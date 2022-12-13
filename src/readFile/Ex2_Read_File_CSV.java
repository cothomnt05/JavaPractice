package readFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex2_Read_File_CSV {
	public static void main(String[] args) {
		try {
			Scanner sc= new Scanner(new File("D:\\workspace\\JavaPractice\\readFile\\csvTest.csv"));
			sc.useDelimiter(",");
			while(sc.hasNext()) {
				System.out.print(sc.next() + "\t\t");
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        
}
	
}
