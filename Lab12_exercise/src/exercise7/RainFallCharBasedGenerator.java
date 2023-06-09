package exercise7;

import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.FileWriter;

//This class is recreated based on RainFallDataWriter.java in package exercise5
// author : Hairul Akhmal Bashyar (B032210005)

public class RainFallCharBasedGenerator {
	
	public static void main (String [] args)
	{
		//declare output file
		String outFile = "rainfallcharbased.txt";
		try
		{		
			//Construct BufferedWriter object together with FileWriter
			FileWriter files = new FileWriter(outFile);
			BufferedWriter bwOutput = new BufferedWriter(files);
			int [] array= {4,1,0,6,19,1};
			
			//Write the data
			for (int index = 0; index < array.length; index++) {
				bwOutput.write(String.valueOf(array[index]));
				bwOutput.newLine();
			}
			
			
			//Clear the stream
			bwOutput.flush(); 
			
			//Close the stream
			bwOutput.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//end of program
		System.out.println("End of program. Check your data " + outFile); 
	}

}

