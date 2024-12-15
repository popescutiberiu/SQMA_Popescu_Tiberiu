public class TestCase1 {
    public static void main(String[] args) {
        int result = add(3, 2);
        if (result == 5) {
            System.out.println("TestCase1 Passed: 3 + 2 = " + result);
        } else {
            System.out.println("TestCase1 Failed: 3 + 2 != " + result);
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
