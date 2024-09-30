import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StatementAnalyzer {
    protected List<BankTransaction> listOfBankTransactions;

    public List<BankTransaction> getListOfBankTransactions() {
        return listOfBankTransactions;
    }

    public void setListOfBankTransactions() {
        this.listOfBankTransactions = listOfBankTransactions;
    }

    public void determineProfit(List<BankTransaction> listOfBankTransactions) {
        int finalAmount = 0;
        for (BankTransaction bankTransaction : listOfBankTransactions) {
            int transactionAmount = bankTransaction.getAmount();
            finalAmount += transactionAmount;
        }

        System.out.println("The final amount is " + finalAmount);

        if (finalAmount < 0) {
            System.out.println("There is loss");
        } else {
            System.out.println("There is profit");
        }
    }

    public int getNoOfTransactionsForTheMonth(int month) {
        int monthlyTransactions = 0;
        for (BankTransaction bankTransaction : listOfBankTransactions) {
            int monthOfStatement = bankTransaction.getMonth();
            if (month == monthOfStatement) {
                monthlyTransactions++;
            }
        }
        return monthlyTransactions;
    }

    public void sortExpenses() {
        Collections.sort(listOfBankTransactions, Comparator.comparing(BankTransaction::getAmount));
    }

    public void showTopExpenses() {
        sortExpenses();
        System.out.println("Top 10 expenses");
        System.out.println("---------------");
        for (BankTransaction bankTransaction : listOfBankTransactions) {
            int index = listOfBankTransactions.indexOf(bankTransaction) + 1;
            int amount = bankTransaction.getAmount();
            if (amount > 0 || index == 11) {
                break;
            }
            int expense = Math.abs(amount);
            String category = bankTransaction.getCategory();
            System.out.println(index + "." + category + ": " + expense);
        }
    }

    public String getMostSpentCategory() {
        sortExpenses();
        String mostSpentCategory = listOfBankTransactions.get(0).getCategory();
        return mostSpentCategory;
    }
}
