

public class Cal {

    // --- käynnistyspiste ---
    public static void main(String[] args) {
        Cal c = new Cal();
        System.out.println("Hello from Cal!");
        System.out.println("2 + 3 = " + c.addMe(2, 3));
        System.out.println("7 - 5 = " + c.subMe(7, 5));
        System.out.println("4 * 6 = " + c.mulMe(4, 6));
        System.out.println("8 / 2 = " + c.divMe(8, 2));
    }

    // --- logiikka ---
    public int addMe(int a, int b) { return a + b; }
    public int subMe(int a, int b) { return a - b; }
    public int mulMe(int a, int b) { return a * b; }
    public int divMe(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }
}

