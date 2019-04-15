public class BankAccount {

        private int amount;

        private String name;

        public BankAccount() {

        }

        public BankAccount(int amount, String name) {
            this.amount = amount;
            this.name = name;
        }

        public void addMoney(int money) {
            if (amount + money < 0) {
                throw new RuntimeException("good buy");
            }

            amount = amount + money;
        }

        public void printAccount() {
            System.out.println("Счет " + name + ", сумма - " + amount);
        }
    }

