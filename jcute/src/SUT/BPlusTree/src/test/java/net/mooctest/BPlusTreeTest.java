package net.mooctest;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;

public class BPlusTreeTest {

    private static final Class<? extends Throwable> ArithmeticException = null;

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        BPlusTree<String> bPlusTree0 = new BPlusTree<String>(2416, 2416);
        bPlusTree0.insert(1, "");
        bPlusTree0.insert((-1828), "net.mooctest.IntegerBloomFilter");
        bPlusTree0.insert(2416, "[7W#JK-A1[cx!I};6}");
        assertEquals(1829, bPlusTree0.getMinGap());
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        BPlusTree<String> bPlusTree0 = new BPlusTree<String>(701, 1050);
        bPlusTree0.reverseInOrder();
        assertEquals(Integer.MAX_VALUE, bPlusTree0.getMinGap());
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        BPlusTree<Integer> bPlusTree0 = new BPlusTree<Integer>(701);
        Integer integer0 = new Integer(0);
        bPlusTree0.insert(701, integer0);
        bPlusTree0.getSize();
        assertEquals(Integer.MAX_VALUE, bPlusTree0.getMinGap());
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        BPlusTree<Object> bPlusTree0 = new BPlusTree<Object>(1, 702);
        bPlusTree0.toString();
        assertEquals(Integer.MAX_VALUE, bPlusTree0.getMinGap());
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        BPlusTree<String> bPlusTree0 = new BPlusTree<String>(701, 1050);
        bPlusTree0.insert(1050, "");
        String string0 = bPlusTree0.inOrder();
        assertEquals("1050", string0);
        assertEquals(Integer.MAX_VALUE, bPlusTree0.getMinGap());
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BPlusTree<String> bPlusTree0 = new BPlusTree<String>(701, 1050);
        bPlusTree0.insert(1050, "");
        int int0 = bPlusTree0.order(1050);
        assertEquals(Integer.MAX_VALUE, bPlusTree0.getMinGap());
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        BPlusTree<String> bPlusTree0 = new BPlusTree<String>(2495);
        int int0 = bPlusTree0.order((-2733));
        assertEquals((-1), int0);
        assertEquals(Integer.MAX_VALUE, bPlusTree0.getMinGap());
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BPlusTree<LeafNode<String>> bPlusTree0 = new BPlusTree<LeafNode<String>>(1);
        bPlusTree0.insert(1, (LeafNode<String>) null);
        String string0 = bPlusTree0.reverseInOrder();
        assertEquals("1,", string0);
        assertEquals(Integer.MAX_VALUE, bPlusTree0.getMinGap());
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        BPlusTree<String> bPlusTree0 = new BPlusTree<String>(701, 1050);
        bPlusTree0.insert(1050, "");
        bPlusTree0.insert(1050, (String) null);
        assertEquals(Integer.MAX_VALUE, bPlusTree0.getMinGap());
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        BPlusTree<String> bPlusTree0 = new BPlusTree<String>(1658, 1658);
        bPlusTree0.search(1658);
        assertEquals(Integer.MAX_VALUE, bPlusTree0.getMinGap());
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        BPlusTree<Object> bPlusTree0 = new BPlusTree<Object>(1);
        bPlusTree0.search(1);
        assertEquals(Integer.MAX_VALUE, bPlusTree0.getMinGap());
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        BPlusTree<Object> bPlusTree0 = new BPlusTree<Object>(1, 702);
        Object object0 = new Object();
        bPlusTree0.insert(1, object0);
        Object object1 = bPlusTree0.search(1);
        assertNotNull(object1);
        assertEquals(Integer.MAX_VALUE, bPlusTree0.getMinGap());
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        BPlusTree<Integer> bPlusTree0 = new BPlusTree<Integer>(1658, 1658);
        bPlusTree0.getSize();
        assertEquals(Integer.MAX_VALUE, bPlusTree0.getMinGap());
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        BPlusTree<Integer> bPlusTree0 = new BPlusTree<Integer>(1658, 1658);
        int int0 = bPlusTree0.getMinGap();
        assertEquals(Integer.MAX_VALUE, int0);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        Integer integer0 = new Integer(3);
        LeafNode<Integer> leafNode0 = new LeafNode<Integer>(3);
        InsertionResult<Integer> insertionResult0 = new InsertionResult<Integer>(integer0, leafNode0, leafNode0);
        InternalNode<Integer> internalNode0 = new InternalNode<Integer>(3, insertionResult0);
        internalNode0.insert(3, integer0);
        int int0 = internalNode0.order(2006);
        assertEquals(1, internalNode0.getNodeSize());
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        Integer integer0 = new Integer(846);
        LeafNode<String> leafNode0 = new LeafNode<String>(846);
        InsertionResult<String> insertionResult0 = new InsertionResult<String>(integer0, leafNode0, leafNode0);
        InternalNode<String> internalNode0 = new InternalNode<String>(846, insertionResult0);
        int int0 = internalNode0.order((-1));
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        Integer integer0 = new Integer(1);
        LeafNode<Integer> leafNode0 = new LeafNode<Integer>(1);
        InsertionResult<Integer> insertionResult0 = new InsertionResult<Integer>(integer0, leafNode0, leafNode0);
        InternalNode<Integer> internalNode0 = new InternalNode<Integer>(1, insertionResult0);
        leafNode0.insert(1, integer0);
        int int0 = internalNode0.order(1);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        Integer integer0 = new Integer(846);
        LeafNode<String> leafNode0 = new LeafNode<String>(846);
        InsertionResult<String> insertionResult0 = new InsertionResult<String>(integer0, leafNode0, leafNode0);
        InternalNode<String> internalNode0 = new InternalNode<String>(846, insertionResult0);
        internalNode0.insert(10, "");
        int int0 = internalNode0.getNodeSize();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        Integer integer0 = new Integer((-1121));
        InternalNode<Integer> internalNode0 = new InternalNode<Integer>(4390);
        InsertionResult<Integer> insertionResult0 = new InsertionResult<Integer>(integer0, internalNode0, internalNode0);
        InternalNode<Integer> internalNode1 = new InternalNode<Integer>(4390, insertionResult0);
        Node<Integer> node0 = internalNode1.getMaxChildNode();
        assertEquals(0, node0.getNodeSize());
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        Integer integer0 = new Integer(846);
        LeafNode<String> leafNode0 = new LeafNode<String>(846);
        InsertionResult<String> insertionResult0 = new InsertionResult<String>(integer0, leafNode0, leafNode0);
        InternalNode<String> internalNode0 = new InternalNode<String>(846, insertionResult0);
        internalNode0.insert(0, "");
        internalNode0.getChildNode(0);
        assertEquals(1, internalNode0.getNodeSize());
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        LinkedList<Node<Object>> linkedList1 = new LinkedList<Node<Object>>();
        InternalNode<Object> internalNode0 = new InternalNode<Object>(1, linkedList0, linkedList1);
        linkedList1.add((Node<Object>) internalNode0);
        InternalNode<Object> internalNode1 = new InternalNode<Object>(1, linkedList0, linkedList1);
        assertEquals(0, internalNode1.getNodeSize());
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        Integer integer0 = new Integer(846);
        LeafNode<String> leafNode0 = new LeafNode<String>(846);
        InsertionResult<String> insertionResult0 = new InsertionResult<String>(integer0, leafNode0, leafNode0);
        InternalNode<String> internalNode0 = new InternalNode<String>(846, insertionResult0);
        int int0 = internalNode0.getNodeSize();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Integer integer0 = new Integer(846);
        LeafNode<LeafNode<Node<String>>> leafNode0 = new LeafNode<LeafNode<Node<String>>>(1);
        InsertionResult<LeafNode<Node<String>>> insertionResult0 = new InsertionResult<LeafNode<Node<String>>>(integer0, leafNode0, leafNode0);
        InternalNode<LeafNode<Node<String>>> internalNode0 = new InternalNode<LeafNode<Node<String>>>(3227, insertionResult0);
        Node<LeafNode<Node<String>>> node0 = internalNode0.getChildNode((-12));
        assertEquals(0, node0.getNodeSize());
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        Integer integer0 = new Integer(846);
        LeafNode<String> leafNode0 = new LeafNode<String>(846);
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        LinkedList<String> linkedList1 = new LinkedList<String>();
        LeafNode<String> leafNode1 = new LeafNode<String>(1, leafNode0, linkedList0, linkedList1);
        InsertionResult<String> insertionResult0 = new InsertionResult<String>(integer0, leafNode1, leafNode1);
        InternalNode<String> internalNode0 = new InternalNode<String>(846, insertionResult0);
        internalNode0.insert(10, "");
        assertEquals(1, internalNode0.getNodeSize());
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        Integer integer0 = new Integer(1);
        LeafNode<Integer> leafNode0 = new LeafNode<Integer>(1);
        InsertionResult<Integer> insertionResult0 = new InsertionResult<Integer>(integer0, leafNode0, leafNode0);
        InternalNode<Integer> internalNode0 = new InternalNode<Integer>(1, insertionResult0);
        int int0 = internalNode0.order(2006);
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        Integer integer0 = new Integer(1);
        LeafNode<Integer> leafNode0 = new LeafNode<Integer>(1);
        InsertionResult<Integer> insertionResult0 = new InsertionResult<Integer>(integer0, leafNode0, leafNode0);
        InternalNode<Integer> internalNode0 = new InternalNode<Integer>(1, insertionResult0);
        InsertionResult<Integer> insertionResult1 = internalNode0.insert(1704, integer0);
        assertEquals(1704, (int) insertionResult1.getSplitRootKey());
        assertEquals(0, internalNode0.getNodeSize());
    }

    @Test(timeout = 4000)
    public void test69() throws Throwable {
        IntegerBloomFilter integerBloomFilter0 = new IntegerBloomFilter(2242.643, (-421));
        integerBloomFilter0.clear();
        integerBloomFilter0.clear();
        int int0 = integerBloomFilter0.getFilterSize();
        assertEquals(6736, int0);
        double double0 = integerBloomFilter0.getExpectedFalsePositiveProbability();
        assertEquals((-16), integerBloomFilter0.getBitsPerElement());
        assertEquals(Double.POSITIVE_INFINITY, integerBloomFilter0.getCurrentFalsePositiveProbability(), 0.01);
        assertEquals(2180.0231231218227, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test70() throws Throwable {
        IntegerBloomFilter integerBloomFilter0 = new IntegerBloomFilter(2078, 2078, 2078);
        double double0 = integerBloomFilter0.getCurrentFalsePositiveProbability();
        assertEquals(0.0, double0, 0.01);
        int int0 = integerBloomFilter0.getTotalHashFunctions();
        assertEquals(2078, integerBloomFilter0.getBitsPerElement());
        assertEquals(2078, int0);
        assertEquals(4318084, integerBloomFilter0.getFilterSize());
        assertEquals(0.0, integerBloomFilter0.getExpectedFalsePositiveProbability(), 0.01);
    }

    @Test(timeout = 4000)
    public void test90() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(2064);
        Integer integer0 = new Integer(1803);
        leafNode0.insert(2, integer0);
        leafNode0.insert(2064, integer0);
        InsertionResult<Object> insertionResult0 = leafNode0.insert((-168), integer0);
        InsertionResult<Object> insertionResult1 = leafNode0.insert((-1), insertionResult0);
        assertEquals(3, insertionResult1.getMinGap());
    }

    @Test(timeout = 4000)
    public void test51() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(2064);
        Integer integer0 = new Integer(1803);
        leafNode0.insert(2, integer0);
        leafNode0.insert(2064, integer0);
        leafNode0.insert(306, integer0);
        leafNode0.insert((-168), integer0);
        InsertionResult<Object> insertionResult0 = leafNode0.insert(1803, (Object) null);
        assertEquals(261, insertionResult0.getMinGap());
    }

    @Test(timeout = 4000)
    public void test52() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(2064);
        Integer integer0 = new Integer(1803);
        leafNode0.insert(2, integer0);
        leafNode0.insert(2064, integer0);
        leafNode0.insert(306, integer0);
        InsertionResult<Object> insertionResult0 = leafNode0.insert(1803, (Object) null);
        assertEquals(261, insertionResult0.getMinGap());
    }

    @Test(timeout = 4000)
    public void test63() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(2064);
        Integer integer0 = new Integer(2064);
        leafNode0.insert(2064, integer0);
        leafNode0.insert(0, (Object) null);
        leafNode0.insert((-168), integer0);
        int int0 = leafNode0.findLessThanOrEqualToKey(0);
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test64() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(2);
        leafNode0.insert(2, (Object) null);
        int int0 = leafNode0.order(2);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test65() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(2064);
        Integer integer0 = new Integer(1803);
        leafNode0.insert(2, integer0);
        leafNode0.insert(2064, integer0);
        int int0 = leafNode0.order(2064);
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test76() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(558);
        int int0 = leafNode0.order(0);
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(4402);
        leafNode0.insert(4402, "");
        Object object0 = new Object();
        leafNode0.insert(4402, object0);
        assertEquals(1, leafNode0.getNodeSize());
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(2);
        leafNode0.insert(2, (Object) null);
        int int0 = leafNode0.getNodeSize();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(2904);
        int int0 = leafNode0.findLessThanOrEqualToKey(758);
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test79() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(2051);
        Integer integer0 = new Integer(47);
        leafNode0.insert(2051, integer0);
        int int0 = leafNode0.findLessThanOrEqualToKey(2051);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test80() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(2051);
        Integer integer0 = new Integer(47);
        leafNode0.insert(47, integer0);
        leafNode0.insert(2051, integer0);
        int int0 = leafNode0.findLessThanOrEqualToKey(2051);
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test81() throws Throwable {
        LeafNode<Node<Object>> leafNode0 = new LeafNode<Node<Object>>(2051);
        int int0 = leafNode0.getNodeSize();
        assertEquals(0, int0);
    }
}

