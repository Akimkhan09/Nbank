public class UserOrder {
    private String operator;
    private String number;
    private String sum;

    public UserOrder() {
    }

    public UserOrder(String operator, String number, String sum) {
        this.operator = operator;
        this.number = number;
        this.sum = sum;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return  " Оператор: " + operator +"\n " +
                "Номер:       " + number +"\n" +
                " Сумма:       " + sum+".00 KZT";
    }
}
