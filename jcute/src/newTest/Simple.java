package newTest;
public class Simple {

    public static void test(int a, int b) {
        int c = a / (b + a - 2);
        if (c > 0)
            System.out.println(">0");
        else
            System.out.println("<=0");
    }

    /* ----- Test Driver ----- */
    public static void main(String[] args) {
        test(0, 0);
    }

}
