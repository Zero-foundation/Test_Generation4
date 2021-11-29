package newTest;
public class SwapSimple {

    static void test(int x, int y) {
        System.out.println("Initial values:");

        if (x > y) {
            x = x + y;
            y = x - y;
            x = x - y;

        }

        if (x >= y)
            assert false;
    }

    /* ----- Test Driver ----- */
    public static void main(String[] args) {
        test(0, 0);
    }
}
