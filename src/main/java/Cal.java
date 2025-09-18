public class Cal {
    public int addMe(int a, int b) {
        return a + b;
    }
    public int subMe(int a, int b) {
        return a - b;
    }
    public int mulMe(int a, int b) {
        return a * b;
    }
    public int divMe(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        else return a / b;
    }
}
