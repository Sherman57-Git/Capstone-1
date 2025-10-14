import java.time.LocalDate;
import java.time.LocalTime;

public class Transactions {
    private LocalDate date;
    private LocalTime time;
    private String description;
    private String vendor;
    private double amount;

    public Transactions(LocalDate date, LocalTime time, String description,String vendor, double amount) {
        this.date = date;
        this.time = time;
        this.description = description;
        this.vendor = vendor;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getDescription() {
        return description;
    }

    public String getVendor() {
        return vendor;
    }

    public double getAmount() {
        return amount;
    }
    public static Transactions fromCsvString(String Line) {
        String[] split = Line.split("\\|");
        LocalDate date = LocalDate.parse(split[0]);
        LocalTime time = LocalTime.parse(split[1]);
        String description = split[2];
        String vendor = split[3];
        double amount = Double.parseDouble(split[4]);

        return new Transactions(date, time, description, vendor, amount);
    }
    @Override
    public String toString() {
        return date + " | " + time + " | " + description + " | " + vendor + " | " + amount;
    }
}



