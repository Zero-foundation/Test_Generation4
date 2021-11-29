package net.mooctest;

import static org.junit.Assert.*;
import org.junit.Test;

public class NextdayTest {

    @Test
    public void testDate() {
        Date d = new Date(4, 17, 2019);
        d.printDate();
        assertEquals(d.toString(), "4/17/2019");
        Date d2 = new Date(4, 17, 2019);
        Date d3 = new Date(4, 16, 2019);
        Date d4 = new Date(3, 17, 2019);
        assertEquals(true, d.equals(d2));
        assertEquals(false, d.equals("3"));
        assertEquals(false, d.equals(d3));
        assertEquals(false, d.equals(d4));
    }

    @Test
    public void testObject() {
        Year y = new Year(2019);
        assertEquals(false, y.equals("3"));
        Month m = new Month(3, y);
        assertEquals(false, m.equals("3"));
        Day d = new Day(1, m);
        assertEquals(false, d.equals("3"));
    }

    @Test
    public void testDayandMonthEqual() {
        Month m = new Month(1, new Year(2019));
        Month m2 = new Month(1, new Year(2018));
        assertEquals(false, m.equals(m2));
        Day d = new Day(1, m);
        Day d2 = new Day(1, m2);
        assertEquals(false, d.equals(d2));
    }
}

