package exercise6;

import java.io.DataInputStream;
import java.io.FileInputStream;

import java.util.ArrayList;
import java.util.HashSet;

//This data read byte based using DataInputStream class
public class RainFallByteBasedReader {
	
	public static void main(String[] args) {

		// Declare source file 
		String sourceFile = "rainfallbyte.txt";
		System.out.println("Reading data from " + sourceFile + "\n");
		
		try {

			// Create input stream to read data
			DataInputStream disIn = new DataInputStream(new FileInputStream(sourceFile));

			
			// Station Id
			int id = 0;
			
			// Station Name and District
			String station = " ", district = " ";
			
			// Daily rainfall reading
			double reading1 = 0.0, reading2 = 0.0, reading3 = 0.0;
			double reading4 = 0.0, reading5 = 0.0, reading6 = 0.0;
			
			
			// Total number of records read from the source file
			int RecordsNum = 0;
			
			// Total daily rainfall readings for each station
			double sum = 0.0;
			
			// Declaration of arraylist
			ArrayList <Double> totalRainfall = new ArrayList<Double>();
			
			// ArrayList to store stations for calculation purpose
			ArrayList<String> stations = new ArrayList<String>();
						
			// HashSet to store distinct district for calculation purpose
			HashSet<String> districtCount = new HashSet<String>();
			
			
			// Process data until end-of-file
			while(disIn.available() > 0) {
				
				// Read data
				
				// station id
				id = disIn.readInt();
				
				// station name
				station = disIn.readUTF();
				
				// district
				district = disIn.readUTF();
				
				// daily rainfall readings for 3 June 2023
				reading1 = disIn.readDouble();
				
				// daily rainfall readings for 4 June 2023
				reading2 = disIn.readDouble();
				
				// daily rainfall readings for 5 June 2023
				reading3 = disIn.readDouble();
			
				// daily rainfall readings for 6 June 2023
				reading4 = disIn.readDouble();
				
				// daily rainfall readings for 7 June 2023
				reading5 = disIn.readDouble();
				
				// daily rainfall readings for 8 June 2023
				reading6 = disIn.readDouble();
				
				System.out.println( id + "\t" +  station  +  "\t"  +  district
						+ "\t" +  reading1 +   "\t"  +  reading2  + "\t"   + reading3 
						+ "\t" +  reading4  +  "\t"  +  reading5  +  "\t"  +  reading6 );
				
				// calculate total daily rainfall readings for each station
				sum = reading1 + reading2 + reading3 + reading4 + reading5 + reading6;
				
				// save the sum into the arraylist, totalRainfall
				totalRainfall.add(sum);
				
				// save the station names into the arraylist, stations
				stations.add(station);
				
				// save the distinct district into hashSet, districtCount
				districtCount.add(district);
				
				// Auto update for current number
				RecordsNum ++;
			}
			
			System.out.println("\n");
			
			// calculation for average daily rainfall reading
			for(int index = 0; index < stations.size(); index++)
			{
				// calculation for average daily rainfall readingn
				double average = totalRainfall.get(index) / RecordsNum;
				
				// format the average in one decimal places
				String formattedAverage = String.format("%.1f", average);
				
				// display the total daily rainfall readings in each station ge
				System.out.println("The total daily rainfall readings in " + stations.get(index) + " : " 
						+ totalRainfall.get(index) );
				System.out.println("The average daily rainfall readings in " + stations.get(index) + " : " 
						+ formattedAverage + "\n");
			}
			
			System.out.println("There are " + stations.size() + " stations and "
						+ districtCount.size() + " districts in Melaka.");
			
			// 4. Close stream
			disIn.close();
	
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}

		// Indicate end of program - Could be successful
		System.out.println("\nEnd of program.");
	}

}

