
/* JUnit test case generated automatically by CUTE */
import junit.framework.*;

public class tests_DSort_main_Test extends TestCase implements cute.Input {
    private Object[] input;
    private int i;

    public tests_DSort_main_Test(String name){
        super(name);
    }

    public boolean Boolean() {
        return ((Boolean)input[i++]).booleanValue();
    }

    public short Short() {
        return ((Short)input[i++]).shortValue();
    }

    public int Integer() {
        return ((Integer)input[i++]).intValue();
    }

    public long Long() {
        return ((Long)input[i++]).longValue();
    }

    public float Float() {
        return ((Float)input[i++]).floatValue();
    }

    public double Double() {
        return ((Double)input[i++]).doubleValue();
    }

    public char Character() {
        return ((Character)input[i++]).charValue();
    }

    public byte Byte() {
        return ((Byte)input[i++]).byteValue();
    }

    public Object Object(String type) {
        return input[i++];
    }

    public void test1(){
        i=0;
        input = new Object[1];
        input[i++] = null;
        i=0;
        cute.Cute.input = this;
        tests.DSort.main(null);
    }

    public void test2(){
        i=0;
        input = new Object[2];
        tests.Node tmp1 = new tests.Node();
        input[i++] = tmp1;
        input[i++] = new Integer(0);
        tmp1.next = null;
        i=0;
        cute.Cute.input = this;
        tests.DSort.main(null);
    }

    public void test3(){
        i=0;
        input = new Object[3];
        tests.Node tmp1 = new tests.Node();
        input[i++] = tmp1;
        input[i++] = new Integer(0);
        tests.Node tmp2 = new tests.Node();
        tmp1.next = tmp2;
        input[i++] = new Integer(0);
        tmp2.next = null;
        i=0;
        cute.Cute.input = this;
        tests.DSort.main(null);
    }

    public void test8(){
        i=0;
        input = new Object[3];
        tests.Node tmp1 = new tests.Node();
        input[i++] = tmp1;
        input[i++] = new Integer(1);
        tests.Node tmp2 = new tests.Node();
        tmp1.next = tmp2;
        input[i++] = new Integer(0);
        tmp2.next = null;
        i=0;
        cute.Cute.input = this;
        tests.DSort.main(null);
    }

}
