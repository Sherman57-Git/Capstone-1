import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    public final String fileName = "transactions.csv";
    public List<Transactions> transactionsList() {
        List<Transactions> transactions = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            bufferedReader.readLine();

            String transactionString;
            while ((transactionString = bufferedReader.readLine()) != null) {
                String[] transArr = transactionString.split("\\|");
                Transactions trans = new Transactions(LocalDate.parse(transArr[0]), LocalTime.parse(transArr[1]), transArr[2], transArr[3], Double.parseDouble(transArr[4]));
                transactions.add(trans);

            }
            bufferedReader.close();
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
        return transactions;

    }

    public saveTranstaions(Transactions Trans) {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.write(Trans.toCsv() + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Error");

        }

    }


