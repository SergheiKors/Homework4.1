public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        int expected = 300;
        int actual = (int)service.calculate(10_000, true);
        System.out.println("1. " + expected + " == ? == " + actual);

        expected = 100;
        actual = (int)service.calculate(10_000, false);
        System.out.println("2. " + expected + " == ? == " + actual);
    }
}