package findthesumoftransactionamountsforeachday;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindthesumoftransactionLoop {

    public static void main(String[] args) {

        List<Transaction> transactions = Arrays.asList(
                new Transaction("2022-01-01", 100),
                new Transaction("2022-01-01", 200),
                new Transaction("2022-01-02", 300),
                new Transaction("2022-01-02", 400),
                new Transaction("2022-01-03", 500)
        );

        Map<String, Integer> transactionMap = new HashMap<>();

        /*for (Transaction transaction : transactions) {
            Integer amountTmp = transactionMap.getOrDefault(transaction.getDate(),
                    transactionMap.putIfAbsent(transaction.getDate(), 0));
            amountTmp += transaction.getAmount();
            transactionMap.put(transaction.getDate(), amountTmp);
        }*/

        for (Transaction transaction : transactions) {
            transactionMap.merge(transaction.getDate(), transaction.getAmount(), Integer::sum);
        }

        for (Map.Entry<String, Integer> entry : transactionMap.entrySet()) {
            System.out.println("entry : " + entry);
        }

    }

}
