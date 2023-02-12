package ReadFile;

import java.io.*;
import java.net.URL;

public class Buffreader {
    public static void main(String[] args) {
        URL url = Buffreader.class.getResource("stock.txt");
        File file = new File(url.getPath());

        String content = "";
        try {
            FileReader archive = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(archive);
            String line = "";
            try {
                line = bufferedReader.readLine();
                while (line != null) {
                    content += line + "/r/n";
                    line = bufferedReader.readLine();

                }
                System.out.println(content);
                archive.close();

            } catch (IOException ex) {
                throw new RuntimeException("Error: We can't read the file");
            }
        } catch (FileNotFoundException ex) {
            throw new RuntimeException("Error: File is not found");
        }
    }
}
