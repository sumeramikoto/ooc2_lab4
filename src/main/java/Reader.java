import java.io.File;
import java.util.ArrayList;
import java.util.List;

abstract class Reader {
    protected List<BankTransaction> listOfBankTransactions = new ArrayList<>();
    File file;

    public Reader(String filepath) {
        this.file = new File(filepath);
    }

    public abstract void readFile();
}
