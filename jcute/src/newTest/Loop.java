package newTest;
public class Loop {

    static void test(int n) {
        int x = 0;
        while (x < n)
            x = x + 1;
    }

    /* ----- Test Driver ----- */
    public static void main(String[] args) {
        test(0);
    }
}
