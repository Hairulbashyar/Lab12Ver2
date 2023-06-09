package exercise7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//This class is recreated based on RainFallDataWriter.java in package exercise5
//author : Hairul Akhmal Bashyar (B032210005)

public class RainFallCharBasedReader {
	
	public static void main (String [] args)
	{
		//declare output file 
		String sourceFile = "rainfallcharbased.txt";
		
		//display reading data
		System.out.println("Reading data from " + sourceFile + "\n");
		try
		{
			
			
			//Construct the Reader object
			BufferedReader brInput = new BufferedReader(new FileReader(sourceFile));
			
			
			//receive daily rainfall reading
			String dailyRainfall = "";
			
			//variables to count number of daily reading
			int RecordsNum = 0;
			
			//variable to calculate total daily rainfall
			double totalRainfall = 0.0;
			
			//Read values from the stream
			
			
			//Read the data
			dailyRainfall = brInput.readLine();
			while (dailyRainfall != null) {
				
				//Display each daily rainfall reading
				System.out.println(dailyRainfall);
				
				//Calculate total daily rainfall
				totalRainfall = totalRainfall + Double.parseDouble(dailyRainfall);
				
				//Auto update current number of records read from the source file
				RecordsNum ++;
				
				//Read next value for the daily rainfall reading
				dailyRainfall = brInput.readLine();
			}
			
			//display total number of records for the daily rainffall
			System.out.println("\nTotal Records: " + RecordsNum);
			
			//Display total daily rainfall
			System.out.println("Total Daily Rainfall: " + totalRainfall);
			
			//Calculate average daily rainfall
			double averageRainfall = totalRainfall / Double.valueOf(RecordsNum);
			
			
			String formattedAverage = String.format("%.1f", averageRainfall);
			System.out.print("\nAverage rainfall for " + RecordsNum 
					+ " days from station Simpang Ampat in Alor Gajah district: " + formattedAverage);
						
			//Close the Reader
			brInput.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
					
	}
}


