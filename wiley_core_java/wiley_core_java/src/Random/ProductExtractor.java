package Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ProductExtractor {
    public static void main(String[] args) {
        String csvFile = "D://Programs//Java//Wiley//src//Random//products.csv";
        String csvSplitBy = ",";
        ArrayList<String[]> productsList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, csvSplitBy);
                String[] product = new String[3];
                int i = 0;
                while (tokenizer.hasMoreTokens()) {
                    product[i++] = tokenizer.nextToken();
                }
                productsList.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Print out the contents of the ArrayList
        for (String[] product : productsList) {
            System.out.println("Car [id=" + product[0] + ", name=" + product[1] + ", price=" + product[2] + "]");
        }
    }
}
