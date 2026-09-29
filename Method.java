public class Methods {

    static void greet() {
        System.out.println("Hello, I am learning Java.");
    }
    static int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {

        greet();

        int result = add(10, 20);

        System.out.println("Sum: " + result);
    }
}
