package com.it.technology.lesson9.interfaces;

public interface Calculatetable<T> {
    double calculateLength();
    double scalarProduct(T vector);
    T add(T vector);
    T subtract(T vector);
}