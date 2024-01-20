import java.io.*;
import java.util.*;

public class WinterTireScheduler {


    public static void main(String[] args) 
    {

        Date date1 = new Date(1,1,2001,5,5);

        Date date2 = new Date(2,2,2023,2,7);
    
        System.out.println(date1);

        Customer Boaty = new Customer(date1,date2,"Car");

        System.out.println(Boaty);

    
        
        String file = "WinterTireScheduler//datafile.csv";
        BufferedReader reader = null;
        String line = "";
        ArrayList<List<String>> listOfCustomers = new ArrayList<>();

        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine())!= null) {
                
                String[] row = line.split(",");
                List<String> fixedLengthList = Arrays.asList(row);
                listOfCustomers.add(listOfCustomers.size(), fixedLengthList);
                
            }
            System.out.println(listOfCustomers);
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}

