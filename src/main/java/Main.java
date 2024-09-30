public class Main {
    public static void main(String[] args) {
        StatementAnalyzer csvStatement = new StatementAnalyzer();
        Reader csvReader = new CSVReader("statements.csv");
        csvReader.readFile(csvStatement);
        csvStatement.determineProfit();
        csvStatement.showTopExpenses();

        System.out.println();


    }
}
