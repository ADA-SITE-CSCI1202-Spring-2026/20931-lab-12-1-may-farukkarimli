@FunctionalInterface
interface DiscountCalculator {
    // ===== TODO 1 =====
    double calculate(double price);
}

public class DiscountDemo {
    public static void main(String[] args) {

        // ===== TODO 2 =====
        // 10% discount lambda
        DiscountCalculator discount10 = price -> price * 0.9;

        // ===== TODO 3 =====
        // 25% discount lambda
        DiscountCalculator discount25 = price -> price * 0.75;

        double price = 100;

        // ===== TODO 4 =====
        // Print price after 10% discount
        System.out.println("After 10% discount: " + discount10.calculate(price));

        // ===== TODO 5 =====
        // Print price after 25% discount
        System.out.println("After 25% discount: " + discount25.calculate(price));
    }
}
