import java.io.File;
import java.util.ArrayList;
import java.util.List;

abstract class Reader {
    protected List<BankTransaction> listOfBankTransactions = new ArrayList<>();
    File file;

    public abstract void readFile();
}
