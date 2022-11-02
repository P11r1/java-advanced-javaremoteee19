package org.sda.generics;

/**
 * Generic comparable interface
 *
 * @author Marko
 */
public interface Comparable<T> {
    /**
     * To Compare two objects field and return the better object
     * @param item Generic
     * @return true/false
     */
    boolean isBetter(T item);
}
