import java.util.ArrayList;
import java.util.List;

abstract class Reader {
    protected List<BankTransaction> listOfBankTransactions = new ArrayList<>();

    public abstract void readFile();
}
