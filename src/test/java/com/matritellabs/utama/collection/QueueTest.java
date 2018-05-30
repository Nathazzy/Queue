package com.matritellabs.utama.collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.NoSuchElementException;

public class QueueTest {

    private int capacity = 5;
    private Queue testQueue = new MyQueue(capacity);

    @Test
    public void addTest(){
        System.out.println(testQueue);
        String[] testArr = new String[3];
        Assert.assertEquals(true,testQueue.add(100));
        Assert.assertEquals(100,testQueue.poll());
        Assert.assertEquals(true,testQueue.add("What"));
        Assert.assertEquals("What",testQueue.poll());
        Assert.assertEquals(true,testQueue.add(testArr));
        Assert.assertEquals(testArr,testQueue.poll());
        Assert.assertEquals(true,testQueue.add(3.0d));
        Assert.assertEquals(3.0d,testQueue.poll());
        Assert.assertEquals(true,testQueue.add(true));
        Assert.assertEquals(true,testQueue.poll());
    }


    @Test(expected = IllegalStateException.class)
    public void addExceptionTest(){
        System.out.println(testQueue);
        Assert.assertEquals(true,testQueue.add(4));
        Assert.assertEquals(true,testQueue.add("What"));
        Assert.assertEquals(true,testQueue.add("asd"));
        Assert.assertEquals(true,testQueue.add(3.0d));
        Assert.assertEquals(true,testQueue.add(114));
        Assert.assertEquals(false,testQueue.add("Last"));
    }

    @Test
    public void elementTest() {
        System.out.println(testQueue);
        Assert.assertEquals(true,testQueue.add(4));
        Assert.assertEquals(true,testQueue.add(16));
        Assert.assertEquals(4,testQueue.element());
    }

    @Test(expected = NoSuchElementException.class)
    public void elementExceptionTest() {
        System.out.println(testQueue);
        Assert.assertEquals(16,testQueue.element());
        Assert.assertEquals(true,testQueue.add(16));
        Assert.assertEquals(16,testQueue.element());
        Assert.assertEquals(16,testQueue.element());
    }

    @Test
    public void offerTest(){

        System.out.println(testQueue);
        Assert.assertEquals(true,testQueue.offer(4));
        Assert.assertEquals(true,testQueue.offer("What"));
        Assert.assertEquals(true,testQueue.offer("asd"));
        Assert.assertEquals(true,testQueue.offer(3.0d));
        Assert.assertEquals(true,testQueue.offer(114));
        Assert.assertEquals(false,testQueue.offer("Last"));
    }

    @Test
    public void peekTest(){
        System.out.println(testQueue);
        Assert.assertEquals(null,testQueue.peek());
        Assert.assertEquals(true,testQueue.add(4));
        Assert.assertEquals(true,testQueue.add(16));
        Assert.assertEquals(true,testQueue.add("String"));
        Assert.assertEquals(4,testQueue.peek());
    }

    @Test
    public void pollTest(){
        Assert.assertEquals(null,testQueue.poll());
        Assert.assertEquals(true,testQueue.add(4));
        Assert.assertEquals(true,testQueue.add(16));
        Assert.assertEquals(true,testQueue.add("String"));
        Assert.assertEquals(4,testQueue.poll());
        Assert.assertEquals(16,testQueue.poll());
        Assert.assertEquals("String",testQueue.poll());
        Assert.assertEquals(null,testQueue.poll());

    }

    @Test
    public void removeTest(){
        Assert.assertEquals(true,testQueue.add(4));
        Assert.assertEquals(true,testQueue.add(16));
        Assert.assertEquals(true,testQueue.add("String"));
        Assert.assertEquals(4,testQueue.remove());
        Assert.assertEquals(16,testQueue.remove());
        Assert.assertEquals("String",testQueue.remove());
    }

    @Test(expected = NoSuchElementException.class)
    public void removeExceptionTest(){
        Assert.assertEquals(true,testQueue.add(4));
        Assert.assertEquals(4,testQueue.remove());
        Assert.assertEquals(16,testQueue.remove());
        Assert.assertEquals("String",testQueue.remove());
    }


}
