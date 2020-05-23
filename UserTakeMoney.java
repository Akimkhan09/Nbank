public class UserTakeMoney {
    private String money;

    public UserTakeMoney(String money) {
        this.money = money;
    }

    public UserTakeMoney() {
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Подготовка выдачи наличных: " + "\n" + money + ".00 KZT" + "\n";
    }
}
