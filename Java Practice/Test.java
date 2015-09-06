package chapter9;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex9_6 
{

	public static void main(String[] args) throws Exception 
{
		// create original file
		File file = new File("file.txt");

		// check if the file exists
		if (file.exists() == false) 
{
			System.out.println("The file does not exist");
			System.exit(0);
		} else
			System.out.println("The file does exist");

		// create test file
		// File targetFile = new File("Test.java");
		// check if the target file exists
		// if (!targetFile.exists()) 
{
		// System.out.println("The target file does not exist");
		// System.exit(0);
		// }
		String targetFile = "Test.java";
		FileInputStream fis = new FileInputStream(targetFile);
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedReader br = new BufferedReader(new InputStreamReader(bis));
		// create a scanner for input and a PrintWriter for output
		// Scanner input = new Scanner("Test.java");
		// PrintWriter output = new PrintWriter("Test.java");
		String outFile = "";
		String line = br.readLine();
		while (line != null) 
{
			// 遇到
{就换行
			int index = line.indexOf('
{');
			System.out.println(index);
			if (index != -1) 
{
				outFile += line.substring(0, index) + "\r\n"
						+ line.substring(index) + "\r\n";
			} else 
{
				outFile += line + "\r\n";
			}
			line=br.readLine();
		}
		// 关闭流然后再写初到源文件
		br.close();
		FileOutputStream fos = new FileOutputStream(targetFile);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		bos.write(outFile.getBytes());
		bos.flush();
		bos.close();

	}
}
