package exercise5;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * Exercise 5 : Processing Rain Fall Data
 * Generate 6 days of rain fall data
 * author Hairul Akhmal Bashyar (B032210005)
 *
 */


public class RainFallDataGenerator {
	
	public static void main(String [] args)
	{
		// declare output
		String outFile = "rainfalldata.txt";
		
		try 
		{
			// create output stream between the program and output file
			DataOutputStream dosOutput = new DataOutputStream(new FileOutputStream(outFile));
			
			//write rainfall data for 6 days
			dosOutput.write(4);
			dosOutput.write(1);
			dosOutput.write(0);
			dosOutput.write(6);
			dosOutput.write(19);
			dosOutput.write(1);
			
			//clear stream
			dosOutput.flush();
			
			//close stream
			dosOutput.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		//end of program
		System.out.println("End of program. Check data " + outFile);
	} 
}
