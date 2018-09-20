package core;

import java.io.IOException;

import comp3004.A1.Black.Jack.Game.TestFileInput;
import junit.framework.TestCase;

public class FileInputTest extends TestCase
{
	public void TestFiles() throws IOException
	{
		TestFileInput print = new TestFileInput();
		assertEquals("SK HA HQ CA", print.printFile1());
	}
	
}
