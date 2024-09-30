import java.util.ArrayList;
import java.util.List;

public class StatementAnalyzer {
    protected List<BankTransaction> listOfBankTransactions = new ArrayList<>();

    public List<BankTransaction> getListOfBankTransactions() {
        return listOfBankTransactions;
    }

    public void setListOfBankTransactions(List<BankTransaction> listOfBankTransactions) {
        this.listOfBankTransactions = listOfBankTransactions;
    }
}
