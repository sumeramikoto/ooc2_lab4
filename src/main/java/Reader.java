import java.io.File;

abstract class Reader {
    protected File file;

    public Reader(String filepath) {
        this.file = new File(filepath);
    }

    public abstract void readStatement(StatementAnalyzer statement);
}
