import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Replace {

    public static void main(String[] args) throws IOException {

        String file = "/Users/chihiro/Desktop/sql.txt";
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;
        while ((line = br.readLine()) != null)
        {
            String rs = line.replace("\"", "\'");
            System.out.println(rs);

        }
    }
}
