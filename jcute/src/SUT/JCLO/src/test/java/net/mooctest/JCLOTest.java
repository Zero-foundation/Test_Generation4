package net.mooctest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;
import org.junit.runner.RunWith;

public class JCLOTest {

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        String[][] stringArray0 = new String[3][4];
        JCLO jCLO0 = new JCLO("P", "", stringArray0);
        String string0 = jCLO0.usage();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        String[][] stringArray0 = new String[3][4];
        JCLO jCLO0 = new JCLO("", "", stringArray0);
        String string0 = jCLO0.usage();
        assertEquals("-hash int\n", string0);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        String[][] stringArray0 = new String[1][8];
        JCLO jCLO0 = new JCLO((Object) "", stringArray0);
        String string0 = jCLO0.usage();
        assertEquals("-hash int\n", string0);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        Object object0 = new Object();
        JCLO jCLO0 = new JCLO(object0);
        String string0 = jCLO0.toString();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        String[][] stringArray0 = new String[7][1];
        JCLO jCLO0 = new JCLO("C", "", stringArray0);
        String string0 = jCLO0.usage();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        String[][] stringArray0 = new String[7][1];
        JCLO jCLO0 = new JCLO("", "", stringArray0);
        String string0 = jCLO0.usage();
        assertEquals("-hash int\n", string0);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        String[][] stringArray0 = new String[5][4];
        JCLO jCLO0 = new JCLO((Object) "", stringArray0);
        String string0 = jCLO0.usage();
        assertEquals("-hash int\n", string0);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        Object object0 = new Object();
        String[][] stringArray0 = new String[2][6];
        JCLO jCLO0 = new JCLO(object0, stringArray0);
        String string0 = jCLO0.toString();
        assertEquals("", string0);
    }
}

