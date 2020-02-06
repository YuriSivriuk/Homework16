package sivriuk.com;

public class CashRegister {
    private Fruit[] fruits;

    public CashRegister(Fruit[] fruits) {
        this.fruits = fruits;
    }

    public void printBill() {
        double sum = 0;
        for (int i = 0; i < fruits.length; i++) {

            sum += fruits[i].getPrice();

        }
        System.out.println(String.format("Total : " +"%.2f",sum  ));
    }
}
