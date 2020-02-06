package sivriuk.com;

public class Main {

    public static void main(String[] args) {
        Fruit lemon = new Fruit(26.90, 134, FruitType.LEMON, Color.YELLOW);
        System.out.println(lemon);

        Fruit banana = new Fruit(29.90, 196, FruitType.BANANA, Color.YELLOW);
        System.out.println(banana);

        Fruit redApple = new Fruit(11.90, 176, FruitType.APPLE, Color.RED);
        System.out.println(redApple);

        Fruit greenApple = new Fruit(13.50, 202, FruitType.APPLE, Color.GREEN);
        System.out.println(greenApple);

        Fruit[] fruits = new Fruit[4];
        fruits[0] = lemon;
        fruits[1] = banana;
        fruits[2] = redApple;
        fruits[3] = greenApple;

        CashRegister cashRegister = new CashRegister(fruits);
        cashRegister.printBill();
    }
}