package core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import junit.framework.TestCase;

public class FileInputTest extends TestCase
{
	public void TestFiles() throws IOException
	{
		@SuppressWarnings("resource")
		Scanner fileInput = new Scanner (new File("File1.txt"));
		assertEquals("SK HA HQ CA", fileInput.nextLine());
		
	}
	
}
