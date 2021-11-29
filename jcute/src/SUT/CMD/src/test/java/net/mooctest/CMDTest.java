package net.mooctest;

import static org.junit.Assert.*;
import java.util.Locale;
import org.junit.Test;

public class CMDTest {

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        CMD.UnknownOptionException cMD_UnknownOptionException0 = new CMD.UnknownOptionException("", "");
        assertEquals("", cMD_UnknownOptionException0.getMessage());
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        CMD cMD0 = new CMD();
        CMD.Option<Double> cMD_Option0 = cMD0.addDoubleOption('@', "");
        String string0 = cMD_Option0.longForm();
        assertEquals("@", cMD_Option0.shortForm());
        assertTrue(cMD_Option0.wantsValue());
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        CMD cMD0 = new CMD();
        CMD.Option<Double> cMD_Option0 = cMD0.addDoubleOption("");
        Locale locale0 = Locale.UK;
        cMD_Option0.parseValue("4", locale0);
        assertTrue(cMD_Option0.wantsValue());
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        CMD cMD0 = new CMD();
        String[] stringArray0 = new String[4];
        stringArray0[0] = "";
        stringArray0[1] = "";
        stringArray0[2] = "";
        stringArray0[3] = "";
        cMD0.parse(stringArray0);
        String[] stringArray1 = cMD0.getRemainingArgs();
        assertFalse(stringArray1.equals((Object) stringArray0));
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        CMD cMD0 = new CMD();
        String[] stringArray0 = new String[0];
        cMD0.parse(stringArray0);
        String[] stringArray1 = cMD0.getRemainingArgs();
        assertEquals(0, stringArray1.length);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        CMD cMD0 = new CMD();
        CMD.Option.DoubleOption cMD_Option_DoubleOption0 = new CMD.Option.DoubleOption("");
        CMD.Option<Double> cMD_Option0 = cMD0.addOption((CMD.Option<Double>) cMD_Option_DoubleOption0);
        assertTrue(cMD_Option0.wantsValue());
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        CMD cMD0 = new CMD();
        String[] stringArray0 = new String[2];
        stringArray0[0] = "--";
        Locale locale0 = Locale.CHINESE;
        cMD0.parse(stringArray0, locale0);
        assertEquals("", locale0.getVariant());
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        CMD cMD0 = new CMD();
        CMD.Option.IntegerOption cMD_Option_IntegerOption0 = new CMD.Option.IntegerOption("");
        Integer integer0 = new Integer(0);
        cMD0.getOptionValue((CMD.Option<Integer>) cMD_Option_IntegerOption0, integer0);
        assertTrue(cMD_Option_IntegerOption0.wantsValue());
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        CMD cMD0 = new CMD();
        CMD.Option<Boolean> cMD_Option0 = cMD0.addBooleanOption('h', "");
        CMD.Option<Boolean> cMD_Option1 = cMD0.addOption(cMD_Option0);
        assertFalse(cMD_Option1.wantsValue());
        assertEquals("", cMD_Option1.longForm());
        assertEquals("h", cMD_Option1.shortForm());
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        CMD.Option.BooleanOption cMD_Option_BooleanOption0 = new CMD.Option.BooleanOption('I', "");
        assertFalse(cMD_Option_BooleanOption0.wantsValue());
        assertEquals("", cMD_Option_BooleanOption0.longForm());
        assertEquals("I", cMD_Option_BooleanOption0.shortForm());
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        CMD.Option.DoubleOption cMD_Option_DoubleOption0 = new CMD.Option.DoubleOption('\\', "");
        assertTrue(cMD_Option_DoubleOption0.wantsValue());
        assertEquals("", cMD_Option_DoubleOption0.longForm());
        assertEquals("\\", cMD_Option_DoubleOption0.shortForm());
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        CMD cMD0 = new CMD();
        Locale locale0 = Locale.GERMAN;
        String[] stringArray0 = new String[5];
        stringArray0[0] = "";
        stringArray0[1] = "";
        stringArray0[2] = "";
        stringArray0[3] = "";
        stringArray0[4] = "";
        cMD0.parse(stringArray0, locale0);
        assertEquals("", locale0.getVariant());
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        CMD cMD0 = new CMD();
        CMD.Option.LongOption cMD_Option_LongOption0 = new CMD.Option.LongOption('d', "");
        cMD0.getOptionValues((CMD.Option<Long>) cMD_Option_LongOption0);
        assertEquals("", cMD_Option_LongOption0.longForm());
        assertTrue(cMD_Option_LongOption0.wantsValue());
        assertEquals("d", cMD_Option_LongOption0.shortForm());
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        CMD.UnknownOptionException cMD_UnknownOptionException0 = new CMD.UnknownOptionException("");
        assertEquals("", cMD_UnknownOptionException0.getOptionName());
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        CMD.UnknownSuboptionException cMD_UnknownSuboptionException0 = new CMD.UnknownSuboptionException("", 'g');
        char char0 = cMD_UnknownSuboptionException0.getSuboption();
        assertEquals("", cMD_UnknownSuboptionException0.getOptionName());
        assertEquals('g', char0);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        CMD.UnknownSuboptionException cMD_UnknownSuboptionException0 = new CMD.UnknownSuboptionException("", 'i');
        String string0 = cMD_UnknownSuboptionException0.getOptionName();
        assertEquals('i', cMD_UnknownSuboptionException0.getSuboption());
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        CMD cMD0 = new CMD();
        CMD.Option<Long> cMD_Option0 = cMD0.addLongOption("");
        String string0 = cMD_Option0.shortForm();
        assertNull(string0);
        assertTrue(cMD_Option0.wantsValue());
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        CMD cMD0 = new CMD();
        CMD.Option<Integer> cMD_Option0 = cMD0.addIntegerOption('p', "");
        cMD0.getOptionValue(cMD_Option0);
        assertTrue(cMD_Option0.wantsValue());
        assertEquals("", cMD_Option0.longForm());
        assertEquals("p", cMD_Option0.shortForm());
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        CMD cMD0 = new CMD();
        CMD.Option<Boolean> cMD_Option0 = cMD0.addBooleanOption("");
        assertFalse(cMD_Option0.wantsValue());
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        CMD cMD0 = new CMD();
        String[] stringArray0 = cMD0.getRemainingArgs();
        assertNull(stringArray0);
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        CMD cMD0 = new CMD();
        CMD.Option<Double> cMD_Option0 = cMD0.addDoubleOption("");
        boolean boolean0 = cMD_Option0.wantsValue();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test48() throws Throwable {
        CMD.Option.LongOption cMD_Option_LongOption0 = new CMD.Option.LongOption("");
        assertTrue(cMD_Option_LongOption0.wantsValue());
    }

    @Test(timeout = 4000)
    public void test50() throws Throwable {
        CMD.Option.StringOption cMD_Option_StringOption0 = new CMD.Option.StringOption('i', "");
        Locale locale0 = Locale.CHINA;
        cMD_Option_StringOption0.parseValue("", locale0);
        assertEquals("i", cMD_Option_StringOption0.shortForm());
        assertTrue(cMD_Option_StringOption0.wantsValue());
        assertEquals("", cMD_Option_StringOption0.longForm());
    }

    @Test(timeout = 4000)
    public void test52() throws Throwable {
        CMD cMD0 = new CMD();
        CMD.Option<Integer> cMD_Option0 = cMD0.addIntegerOption("");
        assertTrue(cMD_Option0.wantsValue());
    }

    @Test(timeout = 4000)
    public void test53() throws Throwable {
        CMD cMD0 = new CMD();
        CMD.Option<Boolean> cMD_Option0 = cMD0.addBooleanOption('P', "");
        Locale locale0 = Locale.JAPAN;
        cMD_Option0.parseValue("", locale0);
        assertFalse(cMD_Option0.wantsValue());
        assertEquals("", cMD_Option0.longForm());
        assertEquals("P", cMD_Option0.shortForm());
    }

    @Test(timeout = 4000)
    public void test54() throws Throwable {
        CMD.Option.BooleanOption cMD_Option_BooleanOption0 = new CMD.Option.BooleanOption("");
        cMD_Option_BooleanOption0.getValue("", (Locale) null);
        assertFalse(cMD_Option_BooleanOption0.wantsValue());
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        CMD.Option.StringOption cMD_Option_StringOption0 = new CMD.Option.StringOption("");
        cMD_Option_StringOption0.getDefaultValue();
        assertTrue(cMD_Option_StringOption0.wantsValue());
    }

    @Test(timeout = 4000)
    public void test56() throws Throwable {
        CMD.Option.BooleanOption cMD_Option_BooleanOption0 = new CMD.Option.BooleanOption("");
        CMD.IllegalOptionValueException cMD_IllegalOptionValueException0 = new CMD.IllegalOptionValueException((CMD.Option<Boolean>) cMD_Option_BooleanOption0, "");
        cMD_IllegalOptionValueException0.getValue();
        assertEquals("Illegal value '' for option --", cMD_IllegalOptionValueException0.getMessage());
        assertFalse(cMD_Option_BooleanOption0.wantsValue());
    }

    @Test(timeout = 4000)
    public void test57() throws Throwable {
        CMD cMD0 = new CMD();
        CMD.Option<String> cMD_Option0 = cMD0.addStringOption("");
        CMD.IllegalOptionValueException cMD_IllegalOptionValueException0 = new CMD.IllegalOptionValueException(cMD_Option0, "");
        CMD.Option<?> cMD_Option1 = cMD_IllegalOptionValueException0.getOption();
        assertTrue(cMD_Option1.wantsValue());
        assertEquals("net.mooctest.CMD$IllegalOptionValueException: Illegal value '' for option --", cMD_IllegalOptionValueException0.toString());
    }

    @Test(timeout = 4000)
    public void test58() throws Throwable {
        CMD.NotFlagException cMD_NotFlagException0 = new CMD.NotFlagException("", '[');
        char char0 = cMD_NotFlagException0.getOptionChar();
        assertEquals('[', char0);
        assertEquals("", cMD_NotFlagException0.getOptionName());
    }
}

