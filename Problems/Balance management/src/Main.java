import java.util.Scanner;

public class Main {

    /**
     * The method change the balance of the given account according to an operation.
     * @param account
     * @param operation
     * @return true if the balance has changed, otherwise - false.
     */
    public static boolean changeBalance(Account account, Operation operation, Long sum) {
        boolean changed = false;
        if (operation == Operation.DEPOSIT) {
            Long curBal = account.getBalance();
            account.setBalance(curBal += sum);
            changed = true;
        } else if (operation == Operation.WITHDRAW) {
            if (account.getBalance() - sum >= 0) {
                account.setBalance(account.getBalance() - sum);
                changed = true;
            } else {
                System.out.println("Not enough money to withdraw.");
            }
        } else {
            System.out.println("Unknown Operation");
        }

        return changed;
    }

    /* Do not change code below */
    enum Operation {
        /**
         * deposit (add) an amount into an Account
         */
        DEPOSIT,
        /**
         * withdraw (subtract) an amount from an Account
         */
        WITHDRAW
    }

    static class Account {

        private String code;
        private Long balance;

        public String getCode() {
            return code;
        }

        public Long getBalance() {
            return balance;
        }

        public void setBalance(Long balance) {
            this.balance = balance;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split("\\s+");

        Account account = new Account();
        account.setBalance(Long.parseLong(parts[0]));

        Operation operation = Operation.valueOf(parts[1]);

        Long sum = Long.parseLong(parts[2]);

        if (changeBalance(account, operation, sum)) {
            System.out.println(account.getBalance());
        }
    }
}