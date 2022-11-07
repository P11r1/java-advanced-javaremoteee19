package org.sda.homeworks;

public interface CompareTo<T> {
    /**
     * To Compare two Persons height and return taller
     * @param height Generic
     * @return true/false
     */
    boolean isTaller(T height);
}
