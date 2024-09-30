import java.io.File;
import java.util.Scanner;

public class CSVReader extends Reader {
    public CSVReader(String filepath) {
        super(filepath);
    }

    public void readFile() {
        try {
            Scanner dataReader = new Scanner(file);
            while(dataReader.hasNextLine()) {
                String fileData = dataReader.nextLine();
                String[] parts = fileData.split(",");
                if (parts.length == 3) {
                    String date = parts[0];
                    int amount = Integer.parseInt(parts[1]);
                    String category = parts[2];

                    BankTransaction bankTransaction = new BankTransaction(date, amount, category);
                    parseDateInfo(bankTransaction);
                    listOfBankTransactions.add(bankTransaction);
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void parseDateInfo(BankTransaction bankTransaction) {
        String date = bankTransaction.getDate();
        String[] parts = date.split("-");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);
        bankTransaction.setDay(day);
        bankTransaction.setMonth(month);
        bankTransaction.setYear(year);
    }
}
