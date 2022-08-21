package com.it.technology.lesson14.interfaces;

@FunctionalInterface
public interface Displayable<T> {
    T displayInformation(T object);
}
