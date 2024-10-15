import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Output {
    private BufferedReader inputFile;
    private ArrayList<String> lineTxt = new ArrayList<String>();
    public void outfile(String fileName) {
        try {
            inputFile = new BufferedReader(new FileReader(fileName));
        } catch (Exception e) {
            e.printStackTrace();
        }
        String line;
        try {
            while ((line = inputFile.readLine()) != null) {
                System.out.println(line);
            }
            inputFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
