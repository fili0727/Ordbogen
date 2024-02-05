import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args){

        try {
            Scanner filereader = new Scanner(new File("data/ddo_fullforms_2023-10-11.csv"));
            int counter = 0;
            while(filereader.hasNext()) {
                String line = filereader.nextLine();
                System.out.println(line);
                counter++;
            }
            System.out.println(counter + " words read");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
