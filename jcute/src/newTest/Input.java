package newTest;
public class Input {

    private int i64;

    public Input(int i) {
        if (i > 10) {
            System.out.println("\n-------- In <Init>(int)! i > 10");
        } else {
            System.out.println("\n-------- In <Init>(int! i <= 10");
        }
        this.i64 = 64;
    }

    public int foo(int i) {
        System.out.println("\n-------- In foo! Parameter = " + i);

        assert i64 > 0;
        if (i > i64) {
            System.out.printf("%s\n", "i > 64");
            if (5 * i <= 325) {
                System.out.printf("%s\n", "5 * i <= 325");
                if (i != 65) {
                    System.out.printf("%s\n", "i != 65");
                } else {
                    System.out.printf("%s\n", "i == 65");
                }
                return i + 3;
            } else if (i != 66) {
                System.out.printf("%s\n", "5 * i > 325 && i != 66");
                return i + 5;
            } else {
                System.out.printf("%s\n", "5 * i > 325 && i == 66");
                assert false : "foo failed!";
            }
        } else if ((i & 7) == 7) {
            System.out.printf("%s\n", "i & 5 == 5");
        }
        System.out.printf("%s\n", "i <= 64");

        this.i64 = i;

        return i;
    }


    private static short zoo_sub(short j, float f) {
        if (f + j > 256) {
            System.out.printf("%s\n", "i > 73 && f + j > 256");
            return j;
        }
        System.out.printf("%s\n", "i > 73 && f + j <= 256");
        assert (false);
        return 0;
    }

    public static short zoo(int i, short j, float f) {
        System.out.println("\n-------- In zoo! Parameters = " + i + ", " + j + ", " + f);

        if (i > 73) {
            zoo_sub(j, f);
        } else {
            switch (i) {
                case 12:
                    System.out.printf("%s\n", "i = 12");
                    break;
                case 42:
                    System.out.printf("%s\n", "i = 42");
                    break;
                default:
                    System.out.printf("%s\n", "i <= 73");
            }
        }
        return j;
    }


    /* ----- Test Driver ----- */
    public static void main(String[] args) {
        System.out.println("-------- In main!");
        Input inst = new Input(64);
        try {
            inst.foo(-1024);
        } catch (AssertionError ex) {
        }
        inst.zoo(1, (short) 2, (float) 1.414);
    }
}
