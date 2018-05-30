package com.matritellabs.utama.collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.NoSuchElementException;

public class QueueTest {

    private int capacity = 5;
    private Queue testQueue = new MyQueue(capacity);

    @Test
    public void addTest(){
        Assert.assertEquals(true,testQueue.add(4));
        Assert.assertEquals(true,testQueue.add("What"));
        Assert.assertEquals(true,testQueue.add(new String[3]));
        Assert.assertEquals(true,testQueue.add(3.0d));
        Assert.assertEquals(true,testQueue.add(true));
    }

    @Test(expected = IllegalStateException.class)
    public void addExceptionTest(){
        Assert.assertEquals(true,testQueue.add(4));
        Assert.assertEquals(true,testQueue.add("What"));
        Assert.assertEquals(true,testQueue.add("asd"));
        Assert.assertEquals(true,testQueue.add(3.0d));
        Assert.assertEquals(true,testQueue.add(114));
        Assert.assertEquals(false,testQueue.add("Last"));
    }

    @Test
    public void elementTest() {
        Assert.assertEquals(true,testQueue.add(4));
        Assert.assertEquals(true,testQueue.add(16));
        Assert.assertEquals(4,testQueue.element());
    }

    @Test(expected = NoSuchElementException.class)
    public void elementExceptionTest() {
        Assert.assertEquals(16,testQueue.element());
        Assert.assertEquals(true,testQueue.add(16));
        Assert.assertEquals(16,testQueue.element());
        Assert.assertEquals(16,testQueue.element());
    }

    @Test
    public void offerTest(){
        Assert.assertEquals(true,testQueue.offer(4));
        Assert.assertEquals(true,testQueue.offer("What"));
        Assert.assertEquals(true,testQueue.offer("asd"));
        Assert.assertEquals(true,testQueue.offer(3.0d));
        Assert.assertEquals(true,testQueue.offer(114));
        Assert.assertEquals(false,testQueue.offer("Last"));
    }

    @Test
    public void peekTest(){
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
