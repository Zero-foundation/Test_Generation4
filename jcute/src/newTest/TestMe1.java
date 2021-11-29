package newTest;
public class TestMe1 {

    // how many tests do we need to cover all paths?
    public static void testMe1(int x) {
        System.out.println("x = " + x);

        if (x <= 1200) {
            System.out.println("  <= 1200");
        }
        if (x >= 1200) {
            System.out.println("  <= 1200");
        }
    }

    /* ----- Test Driver ----- */
    public static void main(String[] args) {
        System.out.println("!!!!!!!!!!!!!!! Start Testing! ");
        testMe1(42);
    }

}
