// DataWrapper.java
// Dan Rojas
// 8/9/26
// wrapper class for any data object

package edu.fscj.cop2800c.util;

import java.util.List;

public class DataWrapper<T> {
    // private field
    private T value;

    // no-arg constructor
    public DataWrapper() {
        this.value = null;
    }

    // overloaded constructor
    public DataWrapper(T value) {
        this.value = value;
    }

    // Getter method
    public T getValue() {
        return value;
    }

    // static generic display method
    public static <T> void displayList(List<DataWrapper<T>> list) {
        for (DataWrapper<T> element : list) {
            // getValue down to the object's toString
            System.out.println(element.getValue());
        }
    }
}