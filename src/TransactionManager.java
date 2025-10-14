import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    public static List<Transactions> transactionsList(String fileName) {
        List<Transactions> transactions;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            bufferedReader.readLine();


            String transactionString;
            while ((transactionString = bufferedReader.readLine()) != null) {
                String[] transArr = transactionString.split("\\|");
                Transactions trans = new Transactions(LocalDate.parse(transArr[0], dtf), LocalTime.parse(transArr[1]), transArr[2], transArr[3], Double.parseDouble(transArr[4]));
                transactions.add(trans);

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return transactions;


    }

}

