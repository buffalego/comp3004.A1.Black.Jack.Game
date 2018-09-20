package core;

//package comp3004.A1.Black.Jack.Game;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TestFileInput  {
	public String printFile1() throws IOException
	{
		
		@SuppressWarnings("resource")
		Scanner fileInput = new Scanner (new File("File1.txt"));
		return fileInput.nextLine();
	}
}

