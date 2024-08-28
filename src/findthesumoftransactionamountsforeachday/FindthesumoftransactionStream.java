package findthesumoftransactionamountsforeachday;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Transaction{

    private String date ;
    private Integer amount;

    public Transaction(String date, Integer amount) {
        this.date = date;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date='" + date + '\'' +
                ", amount=" + amount +
                '}';
    }
}

public class FindthesumoftransactionStream {

    public static void main(String[] args) {

        List<Transaction> transactions = Arrays.asList(
                new Transaction("2022-01-01", 100),
                new Transaction("2022-01-01", 200),
                new Transaction("2022-01-02", 300),
                new Transaction("2022-01-02", 400),
                new Transaction("2022-01-03", 500)
        );

        Map<String, Integer> transactionMap = transactions.stream()
                    .collect(Collectors.groupingBy(Transaction::getDate, Collectors.summingInt(Transaction::getAmount)));

        for (Map.Entry<String, Integer> entry : transactionMap.entrySet()) {
            System.out.println("entry : " + entry);
        }

    }

}
