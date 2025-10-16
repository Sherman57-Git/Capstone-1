import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ledger {
    private List<Transaction> Transactions;
    private final Scanner scanner = new Scanner(System.in);
    public Ledger(List<Transaction> Transactions) {
        this.Transactions = Transactions;
    }

    public void showMenu() {
        while (true) {
            System.out.println("\n= Ledger =");
            System.out.println("1) Month To Date");
            System.out.println("2) Previous Month");
            System.out.println("3) Year To Date");
            System.out.println("4) Previous Year");
            System.out.println("5) Search by Vendor");
            System.out.println("0) Back - go back to the Ledger page");
            String options = scanner.nextLine().toUpperCase();

            switch (options) {
                case "A":
                    showAll();
                    break;
                case "D":
                    showDeposits();
                    break;
                case "P":
                    showPayments();
                    break;
                case "R":
                    showReports();
                    break;
                case "H":
                    return;
                default:
                    System.out.println("invaild option");


            }

        }


    }

    public void showAll() {
        System.out.println("\n All transactions ");
        for (Transaction trans : (Transactions)) {
            System.out.println(trans);
        }
    }
    public void showDeposits() {
        System.out.println("\n Deposits ");
        for (Transaction trans : (Transactions)) {
            if (trans.getAmount() > 0 );
            System.out.println(trans);
        }
    }
    public void showPayments() {
        System.out.println("\n Paymemts  ");
        for (Transaction trans : (Transactions)) {
            if (trans.getAmount() < 0 );
            System.out.println(trans);
        }
    }
    //Report to methods
    public void showReports() {

    }
}




