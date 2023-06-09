package exercise5;

import java.io.DataInputStream;
import java.io.FileInputStream;

//Continue exercise 5, task D

public class RainFallDataReader {
	
	public static void main(String[] args)
	{
		//declare output
		String sourceFile = "rainfalldata.txt";
		
		//display the reading data
		System.out.println("Rain fall data is : " + sourceFile + "\n");
		
		try
		{
			//create stream data
			DataInputStream disInput = new DataInputStream(new FileInputStream(sourceFile));
			
			//read values from stream
			
			double dailyRainfall = 0;
			
			//count daily reading from file
			int RecordsNum = 0;
			
			//calculate daily rainfall
			double totalRainfall = 0.0;
			
			//read values from stream
			dailyRainfall = disInput.read();
			
			System.out.println("Reading rainfall data for 6 days : ");
			
			//read until end of stream
			while(dailyRainfall != -1)
			{
				//display daily rainfall data
				System.out.println(dailyRainfall);
				
				//calculate total daily rainfall
				totalRainfall = totalRainfall + dailyRainfall;
				
				//Update number of records from source file
				RecordsNum ++;
				
				//Read next value for rainfall data
				dailyRainfall = disInput.read();
			}
			//Display total number of records for daily rainfall
			System.out.println("\nTotal Records : " + RecordsNum);
			
			//Display total daily rainfall
			System.out.println("Total daily rainfall : " + totalRainfall);
			
			//Calculate average
			double averageRainfall = totalRainfall / Double.valueOf(RecordsNum);
			
			String formattedAverage = String.format("%.1f" , averageRainfall);
			System.out.println("\n Average rainfall for " + RecordsNum + " days is : " + formattedAverage);
			
			//close stream
			disInput.close();
		}catch (Exception ex)
		{
			ex.printStackTrace();
		}
		
	}

}

