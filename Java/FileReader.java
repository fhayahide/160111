import java.util.*;
import java.io.*;

public class FileReader {
	public static void main(String[] args) {
		String fileName = args[0];
		File f = null;
		FileReader fr = null;


		try{
			f = new File(fileName);
			fr = new FileReader(f);
			System.err.println("ファイルを開きました");

			int data = 0;

			while ((data = fr.read()) != -1){
				System.out.print((char)data);
			}

			fr.close();

		}catch (Exception e) {
			System.out.println("エラー");
			e.printStackTrace();
		}
	}
}