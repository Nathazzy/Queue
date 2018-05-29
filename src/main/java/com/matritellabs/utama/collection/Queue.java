package com.matritellabs.utama.collection;

import java.util.Collections;

interface Queue {

    /**
     * Inserts the specified element into this queue
     * if it is possible to do so immediately without violating capacity restrictions,
     * returning true upon success
     * and throwing an IllegalStateException if no space is currently available.
     */
    boolean add(Object e);

    /**
     * Retrieves, but does not remove, the head of this queue.
     */
    Object element();

    /**
     * Inserts the specified element into this queue
     * if it is possible to do so immediately without violating capacity restrictions.
     */
    boolean offer(Object e);

    /**
     * Retrieves, but does not remove,
     * the head of this queue,
     * or returns null if this queue is empty.
     */
    Object peek();

    /**
     * Retrieves and removes the head of this queue,
     * or returns null if this queue is empty.
     */
    Object poll();

    /**
     * Retrieves and removes the head of this queue.
     */
    Object remove();

}
