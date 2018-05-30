package com.matritellabs.utama.collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyQueue implements Queue {

    public static Logger myLogger = LoggerFactory.getLogger(MyQueue.class);

    private LinkedList<Object> theList;
    private int capacity;

    public MyQueue(int capacity){
        myLogger.info("MyQueue instantiated with "+capacity+" capacity.");
        this.capacity = capacity;
        this.theList = new LinkedList<>();
    }

    @Override
    public boolean add(Object e){
        if (theList.size()>=capacity) {
            myLogger.debug("add method called with full capacity");
            throw new IllegalStateException();
        } else {
            myLogger.info(e+" object added");
            theList.addLast(e);
            return true;
        }
    }

    @Override
    public Object element() {
        if (theList.getFirst()!=null) {
            return theList.getFirst();
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public boolean offer(Object e){
        if (theList.size()>=capacity) {
            return false;
        } else {
            theList.addLast(e);
            return true;
        }
    }

    @Override
    public Object peek(){
        if (theList.size()==0){
            return null;
        } else {
            return theList.getFirst();
        }
    }

    @Override
    public Object poll(){
        if (theList.size()==0){
            return null;
        } else {
            Object o = theList.getFirst();
            theList.removeFirst();
            return o;
        }
    }

    @Override
    public Object remove(){
        Object o = theList.getFirst();
        if (o!=null) {
            theList.removeFirst();
            return o;
        } else {
            throw new NoSuchElementException();
        }
    }

}
