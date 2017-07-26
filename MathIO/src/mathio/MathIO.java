package mathio;
import java.io.*;
public class MathIO {

   
    public static void main(String[] args) {
        
        
        String FILENAME = "numbers.txt";
        
        //Part 1
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            //here is where you should put your numbers
            String line1 = "12356\n";
            String line2 = "666\n";
            String line3 = "999\n";
            String line4 = "1314\n";
            String line5 = "14138\n";
            
            //here is where you should write your numbers to the file
            writer.write(line1);
            writer.write(line2);
            writer.write(line3);
            writer.write(line4);
            writer.write(line5);
            System.out.println("Done");

	} 
        catch (IOException e) {
            e.printStackTrace();

	}
        
        //Part 2
    
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {

            String currentLine = reader.readLine();
            double thing = 0;
            
            while (currentLine != null) {
                double d = Double.parseDouble(currentLine);
                thing +=(d);
                currentLine = reader.readLine();
            }
            
            System.out.println(thing);
	}
        catch (IOException e) {
            e.printStackTrace();
	}
    }
    
}
