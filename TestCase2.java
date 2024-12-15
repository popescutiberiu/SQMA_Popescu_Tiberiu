public class TestCase2 {
    public static void main(String[] args) {
        int result = multiply(2, 3);
        if (result == 6) {
            System.out.println("TestCase2 Passed: 2 * 3 = " + result);
        } else {
            System.out.println("TestCase2 Failed: 2 * 3 != " + result);
        }
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
