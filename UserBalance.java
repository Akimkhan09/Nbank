public class UserBalance {
    private String balance;

    public UserBalance() {
    }

    public UserBalance(String balance) {
        this.balance = balance;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Ваш баланс на данный момент: "+ "\n" + balance+".00 KZT";
    }
}
