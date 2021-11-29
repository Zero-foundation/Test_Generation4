package net.mooctest;

import static org.junit.Assert.*;
import java.util.Collection;
import java.util.LinkedList;
import org.junit.Test;

public class DatalogTest {

    @Test
    public void test() {
        Argument[] a = new Argument[1];
        a[0] = Argument.value(new Value("value"));
        Predicate p = new Predicate("pre");
        Datalog f = new Datalog(p, a);
        assertArrayEquals(a, f.getArguments());
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[5];
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        Argument[] argumentArray1 = datalog0.getArguments();
        assertSame(argumentArray0, argumentArray1);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[0];
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        Fact fact0 = datalog0.toFact();
        Substitution substitution0 = datalog0.substituteTo(fact0);
        assertNotNull(substitution0);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[0];
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        Value[] valueArray0 = new Value[2];
        Fact fact0 = new Fact(predicate0, valueArray0);
        Substitution substitution0 = datalog0.substituteTo(fact0);
        assertNull(substitution0);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[0];
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        String string0 = datalog0.toString();
        assertEquals("()", string0);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[5];
        Variable variable0 = new Variable("");
        Argument argument0 = Argument.variable(variable0);
        argumentArray0[0] = argument0;
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        Fact fact0 = datalog0.toFact();
        assertNull(fact0);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[5];
        Value value0 = new Value("");
        Argument argument0 = Argument.variable((Variable) null);
        argumentArray0[0] = argument0;
        argumentArray0[1] = argumentArray0[0];
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        Value[] valueArray0 = new Value[5];
        valueArray0[0] = value0;
        Fact fact0 = new Fact(predicate0, valueArray0);
        Substitution substitution0 = datalog0.substituteTo(fact0);
        assertNull(substitution0);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[8];
        Argument argument0 = Argument.value((Value) null);
        argumentArray0[0] = argument0;
        Value value0 = new Value("");
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        Value[] valueArray0 = new Value[8];
        valueArray0[0] = value0;
        Fact fact0 = new Fact(predicate0, valueArray0);
        Substitution substitution0 = datalog0.substituteTo(fact0);
        assertNull(substitution0);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[8];
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        Predicate predicate1 = new Predicate("Y");
        Value[] valueArray0 = new Value[7];
        Fact fact0 = new Fact(predicate1, valueArray0);
        Substitution substitution0 = datalog0.substituteTo(fact0);
        assertNull(substitution0);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[0];
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        Fact fact0 = datalog0.toFact();
        boolean boolean0 = datalog0.compatibleWith(fact0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[5];
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        Value[] valueArray0 = new Value[2];
        Fact fact0 = new Fact(predicate0, valueArray0);
        boolean boolean0 = datalog0.compatibleWith(fact0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[0];
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        Argument[] argumentArray1 = new Argument[9];
        Datalog datalog1 = new Datalog(predicate0, argumentArray1);
        boolean boolean0 = datalog0.equals(datalog1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[0];
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        Predicate predicate1 = new Predicate("H");
        Argument[] argumentArray1 = new Argument[9];
        Datalog datalog1 = new Datalog(predicate1, argumentArray1);
        boolean boolean0 = datalog0.equals(datalog1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[0];
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        boolean boolean0 = datalog0.equals("");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[5];
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        boolean boolean0 = datalog0.equals((Object) null);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[0];
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        boolean boolean0 = datalog0.equals(datalog0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[0];
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        Argument[] argumentArray1 = datalog0.getArguments();
        assertEquals(0, argumentArray1.length);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[0];
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        Predicate predicate1 = datalog0.getPredicate();
        assertEquals("", predicate1.getName());
    }

    @Test(timeout = 4000)
    public void testvv0() throws Throwable {
        Variable variable0 = new Variable("V");
        String string0 = variable0.getIdentifier();
        assertEquals("V", string0);
    }

    @Test(timeout = 4000)
    public void testvv1() throws Throwable {
        Variable variable0 = new Variable("");
        boolean boolean0 = variable0.equals(variable0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void testvv2() throws Throwable {
        Variable variable0 = new Variable("");
        boolean boolean0 = variable0.equals((Object) null);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void testvv3() throws Throwable {
        Variable variable0 = new Variable("");
        boolean boolean0 = variable0.equals("");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void testvv5() throws Throwable {
        Variable variable0 = new Variable("");
        String string0 = variable0.getIdentifier();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void testvv6() throws Throwable {
        Variable variable0 = new Variable("");
        String string0 = variable0.toString();
        assertEquals("VAR:", string0);
    }

    @Test(timeout = 4000)
    public void testv0() throws Throwable {
        Value value0 = new Value("X");
        String string0 = value0.toString();
        assertEquals("X", string0);
    }

    @Test(timeout = 4000)
    public void testv1() throws Throwable {
        Value value0 = new Value("X");
        String string0 = value0.getValue();
        assertEquals("X", string0);
    }

    @Test(timeout = 4000)
    public void testv2() throws Throwable {
        Value value0 = new Value("");
        boolean boolean0 = value0.equals(value0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void testv3() throws Throwable {
        Value value0 = new Value("");
        boolean boolean0 = value0.equals((Object) null);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void testv4() throws Throwable {
        Value value0 = new Value("");
        boolean boolean0 = value0.equals("");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void testv6() throws Throwable {
        Value value0 = new Value("");
        String string0 = value0.toString();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void testv8() throws Throwable {
        Value value0 = new Value("");
        String string0 = value0.getValue();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void tests04() throws Throwable {
        Substitution substitution0 = new Substitution();
        Predicate predicate0 = new Predicate("N\\Q");
        Argument[] argumentArray0 = new Argument[2];
        Value value0 = new Value("` *)@{F|Cqy");
        Argument argument0 = Argument.value(value0);
        argumentArray0[0] = argument0;
        Argument argument1 = Argument.value(value0);
        argumentArray0[1] = argument1;
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        Datalog datalog1 = substitution0.applyOn(datalog0);
        substitution0.applyOn(datalog1);
        assertTrue(datalog1.equals((Object) datalog0));
        assertTrue(datalog0.equals((Object) datalog1));
    }

    @Test(timeout = 4000)
    public void tests05() throws Throwable {
        Substitution substitution0 = new Substitution();
        LinkedList<Substitution> linkedList0 = new LinkedList<Substitution>();
        linkedList0.iterator();
        LinkedList<Substitution> linkedList1 = substitution0.extendAll(linkedList0);
        linkedList1.add(substitution0);
        LinkedList<Substitution> linkedList2 = substitution0.extendAll(linkedList1);
        assertTrue(linkedList2.contains(substitution0));
        assertFalse(linkedList0.contains(substitution0));
    }

    @Test(timeout = 4000)
    public void tests08() throws Throwable {
        Substitution substitution0 = new Substitution();
        LinkedList<Substitution> linkedList0 = new LinkedList<Substitution>();
        LinkedList<Substitution> linkedList1 = substitution0.extendAll(linkedList0);
        LinkedList<Substitution> linkedList2 = substitution0.extendAll(linkedList1);
        LinkedList<Substitution> linkedList3 = substitution0.extendAll(linkedList1);
        Value value0 = new Value("");
        Argument argument0 = Argument.value(value0);
        argument0.getVariable();
        Substitution substitution1 = substitution0.extend((Variable) null, value0);
        Predicate predicate0 = new Predicate("");
        Argument argument1 = Argument.variable((Variable) null);
        linkedList0.add(substitution1);
        assertNotSame(linkedList0, linkedList3);
        LinkedList<Substitution> linkedList4 = substitution1.extendAll(linkedList2);
        Argument[] argumentArray0 = new Argument[0];
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        Datalog datalog1 = substitution1.applyOn(datalog0);
        substitution0.applyOn(datalog1);
        substitution1.extendAll(linkedList1);
        Substitution substitution2 = substitution0.extend((Variable) null, value0);
        LinkedList<Substitution> linkedList5 = substitution1.extendAll(linkedList4);
        substitution1.applyOn(datalog0);
        substitution0.extendAll(linkedList5);
        Argument[] argumentArray1 = new Argument[2];
        argumentArray1[0] = argument0;
        argumentArray1[1] = argument1;
        Datalog datalog2 = new Datalog(predicate0, argumentArray1);
        Datalog datalog3 = substitution0.applyOn(datalog2);
        assertFalse(datalog3.equals((Object) datalog2));
        substitution1.extendAll(linkedList4);
        Substitution substitution3 = new Substitution();
        Substitution substitution4 = substitution0.extend((Variable) null, (Value) null);
        assertNull(substitution4);
        assertNotSame(substitution0, substitution2);
    }

    @Test(timeout = 4000)
    public void testr00() throws Throwable {
        Datalog[] datalogArray0 = new Datalog[0];
        Rule rule0 = new Rule((Datalog) null, datalogArray0);
        Datalog datalog0 = rule0.getHead();
        assertNull(datalog0);
    }

    @Test(timeout = 4000)
    public void testr01() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[1];
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        Rule rule0 = new Rule(datalog0, (Datalog[]) null);
        Datalog[] datalogArray0 = rule0.getBody();
        assertNull(datalogArray0);
    }

    @Test(timeout = 4000)
    public void testr02() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[0];
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        Datalog[] datalogArray0 = new Datalog[2];
        Rule rule0 = new Rule(datalog0, datalogArray0);
        Datalog[] datalogArray1 = rule0.getBody();
        assertSame(datalogArray1, datalogArray0);
    }

    @Test(timeout = 4000)
    public void testr05() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[0];
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        Datalog[] datalogArray0 = new Datalog[0];
        Rule rule0 = new Rule(datalog0, datalogArray0);
        LinkedList<Fact> linkedList0 = new LinkedList<Fact>();
        LinkedList<Fact> linkedList1 = rule0.deriveOnce(linkedList0);
        assertEquals(1, linkedList1.size());
    }

    @Test(timeout = 4000)
    public void testr06() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[0];
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        Datalog[] datalogArray0 = new Datalog[0];
        Rule rule0 = new Rule(datalog0, datalogArray0);
        String string0 = rule0.toString();
        assertEquals("() :- .", string0);
    }

    @Test(timeout = 4000)
    public void testr08() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[3];
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        Datalog[] datalogArray0 = new Datalog[3];
        datalogArray0[0] = datalog0;
        Rule rule0 = new Rule(datalog0, datalogArray0);
        LinkedList<Fact> linkedList0 = new LinkedList<Fact>();
        Value[] valueArray0 = new Value[9];
        Fact fact0 = new Fact(predicate0, valueArray0);
        linkedList0.add(fact0);
        LinkedList<Fact> linkedList1 = rule0.deriveOnce(linkedList0);
        assertEquals(0, linkedList1.size());
    }

    @Test(timeout = 4000)
    public void testr09() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[0];
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        Datalog[] datalogArray0 = new Datalog[0];
        Rule rule0 = new Rule(datalog0, datalogArray0);
        Datalog[] datalogArray1 = rule0.getBody();
        assertSame(datalogArray0, datalogArray1);
    }

    @Test(timeout = 4000)
    public void testr10() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[0];
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        Datalog[] datalogArray0 = new Datalog[0];
        Rule rule0 = new Rule(datalog0, datalogArray0);
        Datalog datalog1 = rule0.getHead();
        assertSame(datalog1, datalog0);
    }

    @Test(timeout = 4000)
    public void ptest01() throws Throwable {
        Rule[] ruleArray0 = new Rule[0];
        Program program0 = new Program(ruleArray0);
        Rule[] ruleArray1 = program0.getProgram();
        assertSame(ruleArray0, ruleArray1);
    }

    @Test(timeout = 4000)
    public void ptest02() throws Throwable {
        Rule[] ruleArray0 = new Rule[5];
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[6];
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        Datalog[] datalogArray0 = new Datalog[1];
        Rule rule0 = new Rule(datalog0, datalogArray0);
        ruleArray0[0] = rule0;
        ruleArray0[1] = ruleArray0[0];
        ruleArray0[2] = rule0;
        ruleArray0[3] = ruleArray0[0];
        ruleArray0[4] = ruleArray0[1];
        Program program0 = new Program(ruleArray0);
        Fact[] factArray0 = new Fact[0];
        Fact[] factArray1 = program0.deriveAll(factArray0);
        assertNotSame(factArray0, factArray1);
    }

    @Test(timeout = 4000)
    public void ptest03() throws Throwable {
        Rule[] ruleArray0 = new Rule[5];
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[0];
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        Datalog[] datalogArray0 = new Datalog[3];
        datalogArray0[0] = datalog0;
        datalogArray0[1] = datalog0;
        datalogArray0[2] = datalog0;
        Rule rule0 = new Rule(datalog0, datalogArray0);
        ruleArray0[0] = rule0;
        ruleArray0[1] = rule0;
        ruleArray0[2] = ruleArray0[0];
        ruleArray0[3] = ruleArray0[0];
        Predicate predicate1 = new Predicate("#");
        Datalog datalog1 = new Datalog(predicate1, argumentArray0);
        Rule rule1 = new Rule(datalog1, datalogArray0);
        ruleArray0[4] = rule1;
        Program program0 = new Program(ruleArray0);
        Fact fact0 = datalog0.toFact();
        Fact[] factArray0 = new Fact[5];
        factArray0[0] = fact0;
        factArray0[1] = fact0;
        factArray0[2] = fact0;
        factArray0[3] = fact0;
        factArray0[4] = fact0;
        Fact[] factArray1 = program0.deriveAll(factArray0);
        assertEquals(2, factArray1.length);
    }

    @Test(timeout = 4000)
    public void ptest05() throws Throwable {
        Rule[] ruleArray0 = new Rule[6];
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[0];
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        Datalog[] datalogArray0 = new Datalog[2];
        datalogArray0[0] = datalog0;
        datalogArray0[1] = datalog0;
        Rule rule0 = new Rule(datalog0, datalogArray0);
        ruleArray0[0] = rule0;
        ruleArray0[1] = ruleArray0[0];
        ruleArray0[2] = ruleArray0[1];
        ruleArray0[3] = ruleArray0[0];
        ruleArray0[4] = rule0;
        ruleArray0[5] = ruleArray0[0];
        Program program0 = new Program(ruleArray0);
        Fact[] factArray0 = new Fact[6];
        Value[] valueArray0 = new Value[1];
        Fact fact0 = new Fact(predicate0, valueArray0);
        factArray0[0] = fact0;
        Fact fact1 = datalog0.toFact();
        factArray0[1] = fact1;
        factArray0[2] = factArray0[0];
        factArray0[3] = factArray0[0];
        factArray0[4] = factArray0[1];
        factArray0[5] = factArray0[1];
        Fact[] factArray1 = program0.query(datalog0, factArray0);
        assertEquals(1, factArray1.length);
    }

    @Test(timeout = 4000)
    public void ptest06() throws Throwable {
        Rule[] ruleArray0 = new Rule[6];
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[0];
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        Datalog[] datalogArray0 = new Datalog[2];
        datalogArray0[0] = datalog0;
        Rule rule0 = new Rule(datalog0, datalogArray0);
        ruleArray0[0] = rule0;
        ruleArray0[1] = ruleArray0[0];
        ruleArray0[2] = ruleArray0[1];
        ruleArray0[3] = rule0;
        ruleArray0[4] = ruleArray0[2];
        ruleArray0[5] = rule0;
        Program program0 = new Program(ruleArray0);
        Fact[] factArray0 = new Fact[6];
        Value[] valueArray0 = new Value[1];
        Fact fact0 = new Fact(predicate0, valueArray0);
        factArray0[0] = fact0;
        factArray0[1] = fact0;
        factArray0[2] = factArray0[1];
        factArray0[3] = factArray0[0];
        factArray0[4] = factArray0[0];
        factArray0[5] = fact0;
        Fact[] factArray1 = program0.query(datalog0, factArray0);
        assertEquals(0, factArray1.length);
    }

    @Test(timeout = 4000)
    public void ptest07() throws Throwable {
        Rule[] ruleArray0 = new Rule[5];
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[0];
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        Datalog[] datalogArray0 = new Datalog[3];
        datalogArray0[0] = datalog0;
        datalogArray0[1] = datalog0;
        datalogArray0[2] = datalog0;
        Rule rule0 = new Rule(datalog0, datalogArray0);
        ruleArray0[0] = rule0;
        ruleArray0[1] = rule0;
        ruleArray0[2] = rule0;
        ruleArray0[3] = rule0;
        Predicate predicate1 = new Predicate("k");
        Datalog datalog1 = new Datalog(predicate1, argumentArray0);
        Rule rule1 = new Rule(datalog1, datalogArray0);
        ruleArray0[4] = rule1;
        Program program0 = new Program(ruleArray0);
        Fact fact0 = datalog0.toFact();
        Fact[] factArray0 = new Fact[3];
        factArray0[0] = fact0;
        factArray0[1] = fact0;
        factArray0[2] = fact0;
        boolean boolean0 = program0.canDerive(fact0, factArray0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void ptest09() throws Throwable {
        Rule[] ruleArray0 = new Rule[6];
        Predicate predicate0 = new Predicate("");
        Argument[] argumentArray0 = new Argument[0];
        Datalog datalog0 = new Datalog(predicate0, argumentArray0);
        Datalog[] datalogArray0 = new Datalog[3];
        Rule rule0 = new Rule(datalog0, datalogArray0);
        ruleArray0[0] = rule0;
        ruleArray0[1] = rule0;
        ruleArray0[2] = rule0;
        ruleArray0[3] = rule0;
        ruleArray0[4] = rule0;
        ruleArray0[5] = rule0;
        Program program0 = new Program(ruleArray0);
        Fact fact0 = datalog0.toFact();
        Fact[] factArray0 = new Fact[0];
        boolean boolean0 = program0.canDerive(fact0, factArray0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void ptest10() throws Throwable {
        Rule[] ruleArray0 = new Rule[5];
        Program program0 = new Program(ruleArray0);
        Rule[] ruleArray1 = program0.getProgram();
        assertSame(ruleArray1, ruleArray0);
    }

    @Test(timeout = 4000)
    public void test0p() throws Throwable {
        Predicate predicate0 = new Predicate("x");
        String string0 = predicate0.toString();
        assertEquals("x", string0);
    }

    @Test(timeout = 4000)
    public void test1p() throws Throwable {
        Predicate predicate0 = new Predicate("x");
        String string0 = predicate0.getName();
        assertEquals("x", string0);
    }

    @Test(timeout = 4000)
    public void test2p() throws Throwable {
        Predicate predicate0 = new Predicate("");
        boolean boolean0 = predicate0.equals(predicate0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test3p() throws Throwable {
        Predicate predicate0 = new Predicate("");
        boolean boolean0 = predicate0.equals((Object) null);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test4p() throws Throwable {
        Predicate predicate0 = new Predicate("");
        boolean boolean0 = predicate0.equals("");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test7p() throws Throwable {
        Predicate predicate0 = new Predicate("");
        String string0 = predicate0.getName();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test8p() throws Throwable {
        Predicate predicate0 = new Predicate("");
        String string0 = predicate0.toString();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test01f() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Value[] valueArray0 = new Value[0];
        Fact fact0 = new Fact(predicate0, valueArray0);
        Value[] valueArray1 = fact0.getValues();
        assertEquals(0, valueArray1.length);
    }

    @Test(timeout = 4000)
    public void test02f() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Value[] valueArray0 = new Value[0];
        Fact fact0 = new Fact(predicate0, valueArray0);
        String string0 = fact0.toString();
        assertEquals("()", string0);
    }

    @Test(timeout = 4000)
    public void test04f() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Value[] valueArray0 = new Value[7];
        Fact fact0 = new Fact(predicate0, valueArray0);
        Value[] valueArray1 = new Value[4];
        Fact fact1 = new Fact(predicate0, valueArray1);
        boolean boolean0 = fact0.equals(fact1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test05f() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Value[] valueArray0 = new Value[3];
        Fact fact0 = new Fact(predicate0, valueArray0);
        Predicate predicate1 = new Predicate("N");
        Fact fact1 = new Fact(predicate1, valueArray0);
        boolean boolean0 = fact0.equals(fact1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test06f() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Value[] valueArray0 = new Value[7];
        Fact fact0 = new Fact(predicate0, valueArray0);
        boolean boolean0 = fact0.equals(fact0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test07f() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Value[] valueArray0 = new Value[7];
        Fact fact0 = new Fact(predicate0, valueArray0);
        boolean boolean0 = fact0.equals(valueArray0[1]);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test08f() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Value[] valueArray0 = new Value[7];
        Fact fact0 = new Fact(predicate0, valueArray0);
        Object object0 = new Object();
        boolean boolean0 = fact0.equals(object0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test11f() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Value[] valueArray0 = new Value[7];
        Fact fact0 = new Fact(predicate0, valueArray0);
        Value[] valueArray1 = fact0.getValues();
        assertSame(valueArray0, valueArray1);
    }

    @Test(timeout = 4000)
    public void test12f() throws Throwable {
        Predicate predicate0 = new Predicate("");
        Value[] valueArray0 = new Value[7];
        Fact fact0 = new Fact(predicate0, valueArray0);
        Predicate predicate1 = fact0.getPredicate();
        assertSame(predicate0, predicate1);
    }

    @Test(timeout = 4000)
    public void atest00() throws Throwable {
        Value value0 = new Value("p");
        Argument argument0 = Argument.value(value0);
        String string0 = argument0.toString();
        assertEquals("p", string0);
    }

    @Test(timeout = 4000)
    public void atest01() throws Throwable {
        Variable variable0 = new Variable("");
        Argument argument0 = Argument.variable(variable0);
        boolean boolean0 = argument0.isValue();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void atest02() throws Throwable {
        Variable variable0 = new Variable("");
        Argument argument0 = Argument.variable(variable0);
        argument0.getVariable();
        assertFalse(argument0.isValue());
    }

    @Test(timeout = 4000)
    public void atest03() throws Throwable {
        Variable variable0 = new Variable("");
        Argument argument0 = Argument.variable(variable0);
        argument0.getValue();
        assertTrue(argument0.isVariable());
    }

    @Test(timeout = 4000)
    public void atest04() throws Throwable {
        Value value0 = new Value("");
        Argument argument0 = Argument.value(value0);
        String string0 = argument0.toString();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void atest06() throws Throwable {
        Value value0 = new Value("");
        Argument argument0 = Argument.value(value0);
        boolean boolean0 = argument0.isVariable();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void atest07() throws Throwable {
        Argument argument0 = Argument.variable((Variable) null);
        boolean boolean0 = argument0.isVariable();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void atest08() throws Throwable {
        Value value0 = new Value("");
        Argument argument0 = Argument.value(value0);
        argument0.getVariable();
        assertTrue(argument0.isValue());
    }

    @Test(timeout = 4000)
    public void atest09() throws Throwable {
        Value value0 = new Value("");
        Argument argument0 = Argument.value(value0);
        argument0.getValue();
        assertFalse(argument0.isVariable());
    }

    @Test(timeout = 4000)
    public void atest10() throws Throwable {
        Value value0 = new Value("");
        Argument argument0 = Argument.value(value0);
        boolean boolean0 = argument0.isValue();
        assertTrue(boolean0);
    }
}

