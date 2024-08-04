package materials.src.main.java.org.example.books.realdevsoftware.chapter02.application;

import materials.src.main.java.org.example.books.realdevsoftware.chapter02.entities.BankStatementCSVParser;
import materials.src.main.java.org.example.books.realdevsoftware.chapter02.entities.BankStatementProcessor;
import materials.src.main.java.org.example.books.realdevsoftware.chapter02.entities.BankTransaction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class BankTransactionClass {
        private static final String RESOURCES = "materials/src/main/resources/bank-data-simple.csv";
    public static void main(final String...args) throws IOException {
        final BankStatementCSVParser bankStatementParser = new BankStatementCSVParser();
        final Path path = Paths.get(RESOURCES);
        final List<String> lines = Files.readAllLines(path);
        final List<BankTransaction> bankTransactionList = bankStatementParser.parseLinesFromCSV(lines);

        final BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(bankTransactionList);

        collectSummary(bankStatementProcessor);
    }

    private static void collectSummary(final BankStatementProcessor bankStatementProcessor){
        System.out.println("The total for all transaction is " +
                bankStatementProcessor.calculateTotalAmount());
        System.out.println("The total for all transaction in January is " +
                bankStatementProcessor.calculateTotalInMonth(Month.JANUARY));
        System.out.println("The total for all transaction in February is " +
                bankStatementProcessor.calculateTotalInMonth(Month.FEBRUARY));
        System.out.println("The total salary received is " +
                bankStatementProcessor.calculateTotalForCategory("Salary"));
    }

}
