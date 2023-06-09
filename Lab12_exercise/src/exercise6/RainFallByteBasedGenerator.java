package exercise6;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

// This program will allow processing daily rainfall from selected station by Byte Based Program.
//Data represent station id, station name, name of district and daily rainfall reading.
// author by Hairul Akhmal Bashyar (B032210005)

public class RainFallByteBasedGenerator {

	public static void main(String [] args)
	{
		//Declare output
		String outFile = "rainfallbyte.txt";
		
		//Data declaration using station Id
		int id[] = {2421003, 2321006, 2424031, 2225044, 2223023, 2222006 };
		
		//Station name
		String station[] = {"Simpang Ampat", "Ladang Lendu", "Datoh Kramat", "Chohong", 
				"Sg.Duyong", "Cheng"};
		
		//District name
		String district[] = {"Alor Gajah", "Alor Gajah", "Jasin", "Jasin", "Melaka Tengah",
				"Melaka Tengah"};
		
		//Reading on 3 June
		double reading1 [] = {4.0, 2.0, 0, 0, 0, 0};
		
		//Reading on 4 June
		double reading2 [] = {1.0, 0, 0, 21.5, 3.0, 3.5};
		
		//Reading on 5 June
		double reading3 [] = {0, 0, 0, 0, 0, 0};
		
		//Reading on 6 June
		double reading4 [] = {6.0, 3.0, 0, 39.0, 43.0, 42.5};
		
		//Reading on 7 June
		double reading5 [] = {19.0, 4.0, 17.0, 14.5, 26.0, 10.0};
		//Reading on 8 June
		double reading6 [] = {1.0, 0, 0, 24.5, 26.0, 14.5};
		
		try {
			
			//create output to read data
			DataOutputStream dosOut = new DataOutputStream(new FileOutputStream(outFile));
			
			//process data
			for(int index = 0; index < station.length; index++)
			{
				//write data into data stream
				
				dosOut.writeInt(id[index]);
				dosOut.writeUTF(station[index]);
				dosOut.writeUTF(district[index]);
				dosOut.writeDouble(reading1[index]);
				dosOut.writeDouble(reading2[index]);
				dosOut.writeDouble(reading3[index]);
				dosOut.writeDouble(reading4[index]);
				dosOut.writeDouble(reading5[index]);
				dosOut.writeDouble(reading6[index]);
				
				//flush for each writing
				dosOut.flush();
			}
			
			//close stream
			dosOut.close();
		} catch (Exception ex)
		
		{
			ex.printStackTrace();
		}
		
		//End of program
		System.out.println("End of program. Please check data " + outFile);
	}
}

