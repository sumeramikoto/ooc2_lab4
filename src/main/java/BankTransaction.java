public class BankTransaction {
    private String date;
    private int day;
    private int month;
    private int year;
    private int amount;
    private String category;

    public String getCategory() {
        return category;
    }

    public int getMonth() {
        return month;
    }

    public int getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public BankTransaction(String date, int amount, String category) {
        this.date = date;
        this.amount = amount;
        this.category = category;
    }
}
