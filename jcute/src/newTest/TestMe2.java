package newTest;
public class TestMe2 {

    public void testMe2(int x, boolean b) {
        System.out.println("!!!!!!!!!!!!!!! First step! ");

        if (b) {
            if (x <= 5) {
                System.out.println("  <= 5");
            }
            if (x >= 7) {
                System.out.println("  >= 7");
            }
        }
    }

    /* ----- Test Driver ----- */
    public static void main(String[] args) {
        System.out.println("!!!!!!!!!!!!!!! Start Testing! ");
        (new TestMe2()).testMe2(0, true);
    }

}
