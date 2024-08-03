package materials.src.main.java.org.example.books.realdevsoftware.entities;

import materials.src.main.java.org.example.books.realdevsoftware.application.BankTransactionClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BackStatementCSVParser {
    private static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private BankTransactionClass parseFromCSV(final String line){
        final String[] columns = line.split(",");

        final LocalDate date = LocalDate.parse(columns[0], DATE_PATTERN);
        final double amount = Double.parseDouble(columns[1]);
        final String description = columns[2];

        return new BankTransactionClass(date,amount,description);
    }

    public List<BankTransactionClass>
}
